// https://leetcode.com/problems/validate-stack-sequences?listId=552y65ke&page=1

import java.util.Stack;

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {

        int j =0;
        Stack<Integer> st = new Stack();
        if(pushed.length != popped.length) return false;

        for(int i =0; i<pushed.length;i++){
            st.push(pushed[i]);

           while (!st.isEmpty() && st.peek() == popped[j]) {
                st.pop();
                j++;
            }
        }

        return st.empty();
        
        
        
    }
}