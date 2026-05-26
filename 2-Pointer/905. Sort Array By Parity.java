// https://leetcode.com/problems/sort-array-by-parity?listId=552y65ke&page=1

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int l = 0;
        int h = nums.length-1;

        while(l<=h){
            if(nums[l]%2 !=0){
                  int temp =  nums[h];
               nums[h] = nums[l];
               nums[l] = temp;
             
               h--;
            }
            else{
             l++;
            }
        }
        return nums;





    }
}