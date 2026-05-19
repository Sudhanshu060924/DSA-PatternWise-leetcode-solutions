// https://leetcode.com/problems/power-of-two?listId=552y65ke&page=1

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<1) return false;
        while (n % 2 == 0) {

            n = n / 2;
        }
        if (n == 1)
            return true;
        return false;
    }
}