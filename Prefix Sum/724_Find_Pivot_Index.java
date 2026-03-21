// https://leetcode.com/problems/find-pivot-index?listId=552y65ke&page=1

class Solution {
    public int pivotIndex(int[] nums) {
        // we will use 2 variables, left to store the sum of the left side of the current index, and right to store the sum of the right side of the current index, and we will iterate through the array and update the left and right variables, and if they are equal, we will return the current index, otherwise we will return -1

        int left = 0;
        int sum = 0;
        // we will calculate the sum of the array first, and then we will iterate through the array and update the left and right variables, and if they are equal, we will return the current index, otherwise we will return -1
        for(int i =0;i<nums.length;i++){
            sum +=nums[i];
        }

        for(int i = 0;i<nums.length;i++){
            int right = sum-left-nums[i];
            if(left == right){
                return i;
            }
            left +=  nums[i];

        }
        return -1;
        
    }
}