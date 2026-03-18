//https://leetcode.com/problems/find-the-duplicate-number

class Solution {
    public int findDuplicate(int[] nums) {

        int slow = 0;
        int fast = 0;

        while(true){ // we can use while(true) because we are guaranteed to have a duplicate number, so we will eventually find it
            slow = nums[slow];
            fast = nums[nums[fast]];

            if(slow == fast){ // we have found the duplicate number, now we need to find the index of the duplicate number
                slow = 0;
                while(slow != fast){
                    slow = nums[slow];
                    fast = nums[fast];

                }
                return slow;
            }
        }

        
    }

}