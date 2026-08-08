// https://leetcode.com/problems/jump-game-ii

class Solution {
    public int jump(int[] nums) {
        if (nums.length == 1) return 0;

        int reach = 0;
        int ans = 0;
        int end = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            // farthest position we can reach
            reach = Math.max(reach, i + nums[i]);

            // current jump is finished
            if (i == end) {
                ans++;
                end = reach;
            }
        }

        return ans;
    }
}