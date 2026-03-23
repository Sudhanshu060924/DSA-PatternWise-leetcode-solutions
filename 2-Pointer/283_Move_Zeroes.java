//https://leetcode.com/problems/move-zeroes?envType=problem-list-v2&envId=two-pointers

class Solution {
    public void moveZeroes(int[] nums) {
        int l =0;
       
        for(int h = 0;h<nums.length;h++){

            if(nums[h] != 0){
                int temp = nums[h];
                nums[h] = nums[l];
                nums[l] = temp;
                l++;
               
            }
           
        }
        
    }
}