// https://leetcode.com/problems/search-in-rotated-sorted-array?listId=552y65ke&page=1

class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int h = nums.length - 1;
        int n = nums.length - 1;
        while (l <= h) {
            int g = (l + h) / 2;
            if (nums[g] > nums[n]) { // part1 bdi values 
                if (nums[g] == target) {
                    return g;
                } else if (nums[g] < target) {
                    l = g + 1;
                } else { // jab bda guess milega tab confusion hoga ki choti value ke liye aage jye ki piche
                    if (nums[0] > target) { //pheli vallue bhi bdi h iska mtlb age jao 
                        l = g + 1;
                    } else {
                        h = g - 1;
                    }
                }

            } else {
                if (nums[g] == target) {
                    return g;
                } else if (nums[g] > target) {
                    h = g - 1;
                } else { // jab chota guess milega tab confusion hoga ki bdi value ke liye aage jye ki piche
                    if (nums[n] < target) { //pheli vallue bhi bdi h iska mtlb age jao 
                        h = g - 1;
                    } else {
                        l = g + 1;
                    }
                }
            }
        }
        return -1;

    }
}