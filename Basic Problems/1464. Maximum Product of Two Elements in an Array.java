// https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array?envType=daily-question&envId=2026-07-27&listId=552y65ke&page=1

class Solution {
    public int maxProduct(int[] nums) {
        int max1 = 0;
        int max2 = 0;

        for (int num : nums) {
            if (num >= max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        return (max1 - 1) * (max2 - 1);
    }
}