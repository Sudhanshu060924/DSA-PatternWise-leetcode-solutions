// https://leetcode.com/problems/jump-game?listId=552y65ke&page=1

class Solution {
    public boolean canJump(int[] nums) {
        int reach =0;
        for(int i =0 ;i<nums.length;i++){
            if(reach<i) return false;
            reach = Math.max(reach,i+nums[i]);
            if(reach>=nums.length-1) return true;
        }
        return true;
    }
}