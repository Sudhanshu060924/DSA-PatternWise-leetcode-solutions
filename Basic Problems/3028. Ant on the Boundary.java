// https://leetcode.com/problems/ant-on-the-boundary

class Solution {
    public int returnToBoundaryCount(int[] nums) {

        int add = 0;
        int c = 0;

        for(int i =0;i<nums.length;i++){
            add = add+ nums[i];
            if(add ==0){
                c++;
            }
        }
        return c;
    }
}