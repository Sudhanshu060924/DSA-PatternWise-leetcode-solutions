// https://leetcode.com/problems/valid-perfect-square?envType=problem-list-v2&envId=binary-search

class Solution {
    public boolean isPerfectSquare(int num) {
        

        long l =1;
        long h = num;
        while(l<=h){
            long g = l+ (h-l)/2;
            long n = g*g;

            if(n == num){
                return true;
            }
            else if(n>num){
                h = g-1;
            }
            else{
                l = g+1;
            }
        }
        return false;
    }
}