// https://leetcode.com/problems/factorial-trailing-zeroes?listId=552y65ke&page=1

class Solution {
    public int trailingZeroes(int n) {
        int count = 0;

while(n > 0){
    n = n / 5;
    count += n;
}
return count;
    }
}