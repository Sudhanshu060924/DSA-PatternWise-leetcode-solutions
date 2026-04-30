// https://leetcode.com/problems/is-subsequence?listId=552y65ke&page=1

class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int i =0;
        int j =0;
        while(i<s.length() && j<t.length()){
            char c = s.charAt(i);
            if(c == t.charAt(j)){
                i++;
            }
            j++;
        }
        return (i == s.length());
    }
}