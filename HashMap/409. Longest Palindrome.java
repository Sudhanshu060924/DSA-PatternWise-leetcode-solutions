// https://leetcode.com/problems/longest-palindrome?listId=552y65ke&page=1

import java.util.HashMap;

class Solution {
    public int longestPalindrome(String s) {

        HashMap<Character,Integer> map = new HashMap();
        int res = 0;
        int n = s.length();

        for(int i = 0;i<n;i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }

        Boolean odd = false;

        for(char c : map.keySet()){

            int val = map.get(c);

            if(val%2==0){
                res += val;

            }
            else{
                res += val-1;
                odd = true;
            }
        }
        if(odd==true){
            return res+1;
        }
        else{
            return res;
        }
        
    }
}