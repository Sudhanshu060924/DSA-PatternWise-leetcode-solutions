// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array

class Solution {
    public int findMin(int[] nums) {
        int l =0;
        int h = nums.length-1;
        int res = -1;
        while(l<=h){
            int g = (l+h)/2;
            if(nums[g]>nums[nums.length-1]){
                l = g+1;
            }
            else{
                res = nums[g];
                h=g-1;
            }
        }
      
       
        return res;
    }
}