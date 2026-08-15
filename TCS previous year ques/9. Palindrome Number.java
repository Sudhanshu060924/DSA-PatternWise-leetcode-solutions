// https://leetcode.com/problems/palindrome-number

class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int temp = x;
        int res = 0;
        while(x>0){
            res = res*10 + x%10;
            x /=10;
        }
        if(res==temp) return true;
        return false;
    }
}