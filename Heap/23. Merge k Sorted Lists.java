// https://leetcode.com/problems/merge-k-sorted-lists?listId=552y65ke&page=1

import java.util.PriorityQueue;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            (a,b)->{
                return a.val-b.val;
            }
        );

        for(ListNode node : lists){ //add head of node
            if(node != null ){
            pq.add(node);

            }
        }

        ListNode res = new ListNode(-1);
        ListNode pass = res;

        while(!pq.isEmpty()){
            ListNode curr = pq.poll();

            pass.next = curr;
            pass = pass.next;

            if(curr.next != null){
                pq.add(curr.next);
            }
        }

        return res.next;
        
    }
}