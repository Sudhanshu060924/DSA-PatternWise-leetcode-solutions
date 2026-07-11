// https://leetcode.com/problems/fibonacci-number?listId=552y65ke&page=1

class Solution {
    public int fib(int n) {
        if(n == 0) return 0;
        if (n ==1) return 1;

        int ans1 = fib(n-1);
        int ans2 = fib(n-2);

        return ans1+ans2;
        
    }
}