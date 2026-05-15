// https://leetcode.com/problems/find-smallest-letter-greater-than-target?envType=problem-list-v2&envId=binary-search

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l=0;
        int h = letters.length-1;
        char res = letters[0];

        while(l<=h){
            int g = (h+l)/2;
            char c = letters[g];

            if(c > target){
                res  = c;
                h = g-1;
            }
            else{
                l = g+1;
            }
        }
        return res;
        
    }
}