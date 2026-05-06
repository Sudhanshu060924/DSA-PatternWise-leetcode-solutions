// https://leetcode.com/problems/search-insert-position?envType=problem-list-v2&envId=binary-search

class Solution {
    public int searchInsert(int[] nums, int target) {

        int l = 0;
        int h = nums.length - 1;

        while (l <= h) {
            int g = (h + l) / 2;

            if (nums[g] == target) {
                return g;

            } else if (nums[g] < target) {
                l = g + 1;
            } else {
                h = g - 1;
            }
        }
        return l;

    }
}