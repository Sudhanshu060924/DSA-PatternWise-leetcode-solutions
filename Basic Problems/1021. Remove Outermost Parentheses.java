// https://leetcode.com/problems/remove-outermost-parentheses?listId=552y65ke&page=1

class Solution {
    public String removeOuterParentheses(String s) {
        int open =  0;
        String res = "";
        for(char c :  s.toCharArray()){
            if(c == '(' && open++ >0) res += c;
               if(c == ')' && open-- >1) res += c;
        }
        return res;
        
    }
}