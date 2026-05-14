// https://leetcode.com/problems/guess-number-higher-or-lower?envType=problem-list-v2&envId=binary-search

/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return       -1 if num is higher than the picked number
 *                1 if num is lower than the picked number
 *                otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {

        int l = 1;
        int h = n;

        while (l <= h) {

            int g = l + (h - l) / 2;

            if (guess(g) == 0) {
                return g;
            }
            else if (guess(g) == -1) {
                h = g - 1;
            }
            else {
                l = g + 1;
            }
        }

        return -1;
    }
}