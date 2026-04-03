// https://leetcode.com/problems/trapping-rain-water

class Solution {
    public int trap(int[] height) {

        int l = 0;
        int r = height.length - 1;

        int maxl = 0;
        int maxr = 0;
        int res = 0;

        while (l < r) {
            if (height[l] <= height[r]) {
                if (maxl > height[l]) {
                    res += maxl - height[l];
                } else {
                    maxl = height[l];
                }
                l++;
            } else {
                if (maxr > height[r]) {
                    res += maxr - height[r];
                } else {
                    maxr = height[r];
                }
                r--;
            }
        }
        return res;

    }
}