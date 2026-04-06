// https://leetcode.com/problems/next-greater-element-ii?listId=552y65ke&page=1

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        Stack<Integer> st = new Stack();
      

        for (int i = 2*n - 1; i >= 0; i--){
            int num = nums[i%n];
            while(!(st.empty()) && num >= st.peek()){
                st.pop();
            }

            if(i<n){         

            if(st.empty()){
                res[i] = -1;

            }
            else{
                res[i] = st.peek();
              
            }
            }
              st.push(num);
        }
        return res;
        
    }
}