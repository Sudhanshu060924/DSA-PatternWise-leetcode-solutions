//https://leetcode.com/problems/maximum-subarray?utm_source=chatgpt.com

class Solution {
    public int maxSubArray(int[] nums) { // we will use 2 variables, best to store the maximum sum of the subarray ending at the current index, and ans to store the final result
        int i =0;
        int best = nums[0];
        int ans = nums[0];

        for(i =1;i<nums.length;i++){
            int n1 = nums[i]; // we will calculate the sum of the current number and the best sum of the subarray ending at the previous index, because if the current number is negative, then the best sum of the subarray ending at the previous index will become the best sum of the subarray ending at the current index
            int n2 = best+ nums[i]; // we will calculate the sum of the current number and the best sum of the subarray ending at the previous index, because if the current number is positive, then the best sum of the subarray ending at the previous index will become the best sum of the subarray ending at the current index
             best = Math.max(n1,n2); // we will calculate the best sum of the subarray ending at the current index, because if the current number is negative, then the best sum of the subarray ending at the previous index will become the best sum of the subarray ending at the current index, and if the current number is positive, then the best sum of the subarray ending at the previous index will become the best sum of the subarray ending at the current index
             ans = Math.max(ans,best); // we will update the final result, because if the best sum of the subarray ending at the current index is greater than the final result, then we will update the final result
        }
        return ans; // we will return the final result, because it will contain the maximum sum of the subarray in the given array
    }

}