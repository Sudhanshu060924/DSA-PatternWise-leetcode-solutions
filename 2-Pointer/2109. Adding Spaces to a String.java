// https://leetcode.com/problems/adding-spaces-to-a-string?listId=552y65ke&page=1

class Solution {
    public String addSpaces(String s, int[] spaces) {
        int i = 0;
        int j = 0;
        StringBuilder res = new StringBuilder();

        while (i < s.length() && j < spaces.length) {
            char c = s.charAt(i);

            if (i == spaces[j]) {
                res.append(' ');
                j++;
            }
            res.append(c);
            i++;

        }

        while (i < s.length()) {
            char c = s.charAt(i);
            res.append(c);
            i++;
        }
        return res.toString();

    }
}