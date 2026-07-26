// https://leetcode.com/problems/maximum-product-of-three-numbers?envType=daily-question&envId=2026-07-26

import java.util.Arrays;

public class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
       
        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        
       
        int product2 = nums[0] * nums[1] * nums[n - 1];
        
        return Math.max(product1, product2);
    }
}
