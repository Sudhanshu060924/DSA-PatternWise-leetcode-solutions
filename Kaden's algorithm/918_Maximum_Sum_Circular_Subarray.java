// https://leetcode.com/problems/maximum-sum-circular-subarray?listId=552y65ke&page=1

class Solution {
    // we will use 2 variables, best to store the maximum sum of the subarray ending at the current index, and r to store the final result

    public int maxsum(int[] nums){
        int i =0;
        int best = nums[0];
        int r = nums[0];
        for(i = 1;i<nums.length;i++){
            int v1 = nums[i];
            int v2 = best + nums[i];
            best = Math.max(v1,v2);
             r = Math.max(best,r);
        }
        return r;
    }
    // we will use 2 variables, best to store the minimum sum of the subarray ending at the current index, and r to store the final result
     public int minsum(int[] nums){
        int i =0;
        int best = nums[0];
        int r = nums[0];
        for(i = 1;i<nums.length;i++){
            int v1 = nums[i];
            int v2 = best + nums[i];
            best = Math.min(v1,v2);
             r = Math.min(best,r);
        }
        return r;
     }

    public int maxSubarraySumCircular(int[] nums) {
        int sum =0;
        // we will return the maximum of the maximum sum of the subarray and the sum of the array minus the minimum sum of the subarray, because the maximum sum of the circular subarray will be the maximum of the maximum sum of the subarray and the sum of the array minus the minimum sum of the subarray, because if the maximum sum of the subarray is positive, then it will be the maximum sum of the circular subarray, and if the minimum sum of the subarray is negative, then it will be the maximum sum of the circular subarray
        for(int i =0;i<nums.length;i++){
sum = sum + nums[i];
        }
        
        if (maxsum(nums)<0){
            return maxsum(nums);
        }
        return Math.max(maxsum(nums),sum-minsum(nums));
    }
   
}