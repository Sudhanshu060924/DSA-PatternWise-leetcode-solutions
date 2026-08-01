// https://leetcode.com/problems/power-of-three?listId=552y65ke&page=1

class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<1) return false;
        
        while(n%3==0){
            n=n/3;
        }
       return n==1;
    }
}