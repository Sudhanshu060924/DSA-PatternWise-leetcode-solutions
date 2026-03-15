//https://leetcode.com/problems/subarray-product-less-than-k?envType=problem-list-v2&envId=w8n3qg1m
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) { //if k is 1 or less, no product of positive integers can be less than k, so return 0
            return 0;
        }
        int l = 0; //left pointer
        int c = 0; //count of subarrays
        int p = 1; //product of elements in the current window
        for (int h = 0; h < nums.length; h++) {
            p *= nums[h]; //expand the window to the right by multiplying the new element
            while (p >= k) {
                p = p/nums[l]; //shrink the window from the left until the product is less than k
                l++;
            }
            c = c + h-l+1; //number of subarrays that end at index h and have a product less than k is h-l+1 (all subarrays that start from l to h)
        } 
       return c; 

    }
}