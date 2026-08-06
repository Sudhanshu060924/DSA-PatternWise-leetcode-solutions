// https://leetcode.com/problems/smallest-divisible-digit-product-i?envType=daily-question&envId=2026-08-06&listId=552y65ke&page=1

class Solution {
    public int smallestNumber(int n, int t) {
        while (true) {
            int temp = n;
            int prod = 1;

            while (temp > 0) {
                prod *= (temp % 10);
                temp /= 10;
            }

            if (prod % t == 0) {
                return n;
            }

            n++;
        }
    }
}