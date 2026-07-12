// https://leetcode.com/problems/letter-combinations-of-a-phone-number?envType=problem-list-v2&envId=string

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class Solution {
     private final Map<Character, char[]> keyboard = Map.of(
            '2', new char[] { 'a', 'b', 'c' },
            '3', new char[] { 'd', 'e', 'f' },
            '4', new char[] { 'g', 'h', 'i' },
            '5', new char[] { 'j', 'k', 'l' },
            '6', new char[] { 'm', 'n', 'o' },
            '7', new char[] { 'p', 'q', 'r', 's' },
            '8', new char[] { 't', 'u', 'v' },
            '9', new char[] { 'w', 'x', 'y', 'z' }
);
    public List<String> letterCombinations(String digits) {

         List<String> ans = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return ans;
        }

        backtrack(digits, 0, new StringBuilder(), ans);
        return ans;

       
        
    }

     private void backtrack(String digits, int index, StringBuilder sb, List<String> ans) {

        if (index == digits.length()) {
            ans.add(sb.toString());
            return;
        }

        char[] letters = keyboard.get(digits.charAt(index));

        for (char ch : letters) {
            sb.append(ch);
            backtrack(digits, index + 1, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}