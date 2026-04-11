// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string?listId=552y65ke&page=1

class Solution {
    public int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();

        if (m == 0) return 0;

        int i = 0; // pointer for haystack

        while (i <= n - m) {
            int j = 0; // pointer for needle

            // compare characters
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            // full match
            if (j == m) return i;

            // move window forward
            i++;
        }
        return -1;
            
    }
}