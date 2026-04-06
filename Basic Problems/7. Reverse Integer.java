// https://leetcode.com/problems/reverse-integer

class Solution {
    public int reverse(int x) {

        int rn = 0;

        while (x != 0) {

            if (rn > Integer.MAX_VALUE / 10 || rn < Integer.MIN_VALUE / 10) {
                return 0;
            }
            rn = rn * 10 + x % 10;
            x = x / 10;

        }
        return rn;

    }
}