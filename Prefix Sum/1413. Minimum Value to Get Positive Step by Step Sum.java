// https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum?envType=problem-list-v2&envId=prefix-sum

class Solution {
    public int minStartValue(int[] nums) {
        int sum = 0;
        int minsum = 0;
        for(int num : nums){
            sum += num;
            minsum = Math.min(sum,minsum);
        
        }
        return 1 - minsum;
        
    }
}