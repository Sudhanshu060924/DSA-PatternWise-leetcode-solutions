// https://leetcode.com/problems/sqrtx?envType=problem-list-v2&envId=binary-search

class Solution {
    public int mySqrt(int x) {
        int res = 0;

        int l = 1;
        int h = x;
        while (l <= h) {
            int g = l + (h - l) / 2;
            long num = (long) g * g;

            if (num <= x) {

                res = g;
                l = g + 1;
            }

            else {
                h = g - 1;
            }

        }
        return res;

    }
}