// https://leetcode.com/problems/permutations?listId=552y65ke&page=1

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int n = nums.length;

        fun(nums, temp, res);

        return res;

    }

    public void fun(int[] nums, List<Integer> temp, List<List<Integer>> res) {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!temp.contains(nums[i])) {
                temp.add(nums[i]);

                fun(nums, temp, res);
                temp.remove(temp.size() - 1);
            }

        }

        return;
    }

}