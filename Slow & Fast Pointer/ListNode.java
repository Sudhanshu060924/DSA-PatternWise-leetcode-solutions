//https://leetcode.com/problems/remove-nth-node-from-end-of-list?envType=problem-list-v2&envId=two-pointers


  // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
 
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
//
        ListNode first = new ListNode(0); // creating a dummy node
        first.next = head;
        head = first;
        // we will move the fast pointer n times ahead of the slow pointer
        ListNode slow = first;
        ListNode fast = first;

        for (int i = 0; i < n; i++) {
            fast = fast.next;

        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        return first.next;

    }
}