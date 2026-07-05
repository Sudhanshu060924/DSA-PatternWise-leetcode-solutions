// https://leetcode.com/problems/kth-largest-element-in-an-array?envType=problem-list-v2&envId=heap-priority-queue

import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = nums.length;

        for(int i=0;i<k;i++){
            pq.add(nums[i]);
        }
        for(int i=k;i<n;i++){
            if(nums[i]>pq.peek()){
                pq.poll();
                pq.add(nums[i]);
            }
        }        
        return pq.peek();
    }
}