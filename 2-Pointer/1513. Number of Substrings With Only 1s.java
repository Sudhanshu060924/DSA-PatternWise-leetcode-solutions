// https://leetcode.com/problems/number-of-substrings-with-only-1s?listId=552y65ke&page=1

class Solution {
    public int numSub(String s) {

        long res = 0;
        long count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '1') {
                count += 1;
                res = (res + count) % 1000000007;

            } else {
                count = 0;
            }
        }
        return (int) res;

    }
}