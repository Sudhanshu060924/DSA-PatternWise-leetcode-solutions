// https://leetcode.com/problems/happy-number

class Solution {

    public int sqFun(int n){ // this function will return the sum of the squares of the digits of n
        int sum = 0;
        while(n>0){
            int d = n%10;
            n = n/10;
            sum = sum + d*d;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
// we can use while(fast != 1) because if fast becomes 1, then we have found a happy number, and we can return true
        while(fast !=1){
            slow = sqFun(slow);
            fast = sqFun(sqFun(fast));
            if(slow == fast && slow !=1){
                return false;
            }
        }
        return true;
    }
}