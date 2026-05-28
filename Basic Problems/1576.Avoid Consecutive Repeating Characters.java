// https://leetcode.com/problems/replace-all-s-to-avoid-consecutive-repeating-characters

class Solution {
    public String modifyString(String s) {

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == '?') {

                for (char ch = 'a'; ch <= 'z'; ch++) {

                    char prev = (i > 0) ? arr[i - 1] : '#';
                    char next = (i < arr.length - 1) ? arr[i + 1] : '#';

                    if (ch != prev && ch != next) {
                        arr[i] = ch;
                        break;
                    }
                }
            }
        }

        return new String(arr);
    }
}