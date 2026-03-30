// https://leetcode.com/problems/remove-element?envType=problem-list-v2&envId=two-pointers

class Solution {
    public int removeElement(int[] nums, int val) {
        int l = 0;
        int h = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[h] == val) {
                int temp = nums[i];
                h++;
            } else {
                nums[l] = nums[h];
                l++;
                h++;
            }
        }
        return l;

    }
}