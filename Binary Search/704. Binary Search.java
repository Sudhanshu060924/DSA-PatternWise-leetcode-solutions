// https://leetcode.com/problems/binary-search?envType=problem-list-v2&envId=binary-search

class Solution {
    public int search(int[] nums, int target) {

        int l =0;
        int h = nums.length-1;
        while(l<=h){
            int guess = (l+h)/2;
            if(nums[guess]== target){
                return guess;
            }
            else if(nums[guess]<target){
                l = guess+1;

            }
            else{
                h = guess-1;
            }
        }
        return -1;
        
    }
}