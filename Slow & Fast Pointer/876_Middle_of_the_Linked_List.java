//https://leetcode.com/problems/middle-of-the-linked-list

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
    public ListNode middleNode(ListNode head) {
        ListNode slow = head; // 1 step
        ListNode fast = head; // 2 steps

        while(fast != null && fast.next != null){ // fast reaches the end of the list
            slow = slow.next; 
            fast = fast.next.next; 
        }
        return slow; // slow will be at the middle of the list
        
    }
}