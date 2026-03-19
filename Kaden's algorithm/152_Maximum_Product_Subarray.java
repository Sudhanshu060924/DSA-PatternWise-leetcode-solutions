// https://leetcode.com/problems/maximum-product-subarray?listId=552y65ke&page=1

class Solution {
    public int maxProduct(int[] nums) {  // we will use 3 variables, mp to store the maximum product, min to store the minimum product, and result to store the final result
        int mp = nums[0];
        int result = nums[0];
        int min = nums[0];
        for(int i=1;i<nums.length;i++){ // we will calculate the maximum product and minimum product at each step, and update the result accordingly
            int n1 = nums[i];
            int n2 = min*nums[i]; // we will calculate the product of the current number with the minimum product, because if the current number is negative, then the minimum product will become the maximum product
            int n3 = mp*nums[i];
           
           min = Math.min(n1,Math.min(n2,n3)); // we will calculate the minimum product at each step, because if the current number is negative, then the maximum product will become the minimum product
           mp = Math.max(n1,Math.max(n2,n3));
            result = Math.max(result,mp);

            
        }
        return result;
        
    }
}