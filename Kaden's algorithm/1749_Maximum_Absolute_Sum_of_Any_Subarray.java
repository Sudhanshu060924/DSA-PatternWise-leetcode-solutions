//https://leetcode.com/problems/maximum-absolute-sum-of-any-subarray?listId=552y65ke&page=1

class Solution {
    // we will use 2 variables, best to store the maximum sum of the subarray ending at the current index, and ans to store the final result

    public int maxsum(int[] nums){
        int i =0;
        int best = nums[0];
        int res = nums[0];
        for(i=1;i<nums.length;i++){
            int v1 = nums[i];
            int v2 = best+ nums[i];
            best = Math.max(v1,v2);
            res = Math.max(best,res);

        }
        return Math.abs(res);

        
    }
    // we will use 2 variables, best to store the minimum sum of the subarray ending at the current index, and res to store the final result
    public int minsum(int[] nums){
        int i =0;
        int best = nums[0];
        int res = nums[0];
        for(i=1;i<nums.length;i++){
            int v1 = nums[i];
            int v2 = best+ nums[i];
            best = Math.min(v1,v2);
            res = Math.min(best,res);

        }
        return Math.abs(res);

    }

    public int maxAbsoluteSum(int[] nums) {
        // we will return the maximum of the absolute value of the maximum sum of the subarray and the absolute value of the minimum sum of the subarray, because the maximum absolute sum of any subarray will be the maximum of the absolute value of the maximum sum of the subarray and the absolute value of the minimum sum of the subarray, because if the maximum sum of the subarray is positive, then it will be the maximum absolute sum of any subarray, and if the minimum sum of the subarray is negative, then it will be the maximum absolute sum of any subarray

        return Math.max(maxsum(nums),minsum(nums));
        
    }
}