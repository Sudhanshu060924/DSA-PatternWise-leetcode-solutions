// https://leetcode.com/problems/power-of-four?listId=552y65ke&page=1

class Solution {
    public boolean isPowerOfFour(int n) {
        if (n < 1) return false;

        while (n % 4 == 0) {
            n /= 4;
        }

        return n == 1;
    }
}