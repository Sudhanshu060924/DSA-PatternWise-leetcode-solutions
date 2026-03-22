// https://leetcode.com/problems/subarray-sum-equals-k?listId=552y65ke&page=1

import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        // sum, count

        map.put(0,1);
        int sum = 0;
        int r = 0;
        for(int i =0;i<nums.length;i++){
            // sum of 0 to i
            sum += nums[i];
            if(map.containsKey(sum-k)){
                r += map.get(sum-k); // if sum-k is in map, then there are map.get(sum-k) subarrays that sum to k
            
            }
            // add sum to map
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return r;
        
    }
}