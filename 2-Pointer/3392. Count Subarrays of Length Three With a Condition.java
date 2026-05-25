// https://leetcode.com/problems/count-subarrays-of-length-three-with-a-condition?listId=552y65ke&page=1

class Solution {
    public int countSubarrays(int[] nums) {
        int l =0;
        int h = 2;
        int c=0;

        while(h<nums.length){
            if(2*(nums[l]+nums[h]) == nums[(l+h)/2]){
                c++;
            }
            l++;h++;
        }

        return c;
    }
}