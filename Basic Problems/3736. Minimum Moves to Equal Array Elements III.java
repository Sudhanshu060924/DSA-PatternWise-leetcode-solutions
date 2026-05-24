//https://leetcode.com/problems/minimum-moves-to-equal-array-elements-iii

class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        

        for(int i = 0;i<n;i++){
            max = Math.max(nums[i],max);
        }
    int c = 0;
        for(int i =0;i<n;i++){
            while(nums[i]<max){
                nums[i]++;
                c++;
            }
        }
        return c;
        

        
        
    }
}