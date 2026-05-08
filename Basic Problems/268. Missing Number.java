// https://leetcode.com/problems/missing-number?envType=problem-list-v2&envId=binary-search

class Solution {
    public int missingNumber(int[] nums) {
        

        int n = nums.length;
        int sum = n*(n+1)/2;
        int s = nums[0];

        for(int i =1;i<n;i++){
            s += nums[i];
        }

        return sum-s;
    }
}