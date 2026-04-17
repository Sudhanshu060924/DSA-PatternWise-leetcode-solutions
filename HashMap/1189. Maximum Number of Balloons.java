// https://leetcode.com/problems/maximum-number-of-balloons?listId=552y65ke&page=1

import java.util.HashMap;

class Solution {
    public int maxNumberOfBalloons(String text) {
        
        int n = text.length();
 
        HashMap<Character,Integer> have = new HashMap();
        HashMap<Character,Integer> need = new HashMap();
        int res = Integer.MAX_VALUE;

        for(int i =0;i<n;i++){
            char c = text.charAt(i);

            have.put(c,have.getOrDefault(c,0)+1);
        }

        String s = "balloon";
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);

            need.put(c,need.getOrDefault(c,0)+1);
        }

        for(char c : need.keySet()){
            int f_need = need.get(c);
           int f_have = have.getOrDefault(c, 0);
            int times = f_have/f_need;
             res = Math.min(res,times);
        }
        return res;

    }
}