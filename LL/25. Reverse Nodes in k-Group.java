// https://leetcode.com/problems/reverse-nodes-in-k-group

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
    public ListNode reverse(ListNode head, int size) {
        ListNode curr = head;
        ListNode prev = null;

        for (int i = 0; i < size; i++) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode left = head;
        ListNode res = null;
        ListNode prevleft = null;

        int size = k;
        while (true) {
            ListNode right = left;
            for (int i = 0; i < size - 1; i++) {

                if (right == null) {
                    break;
                }
                right = right.next;
            }
            if (right != null) {
                ListNode nextleft = right.next;
                reverse(left, size);
                if (prevleft != null) {
                    prevleft.next = right;
                }
                prevleft = left;
                left = nextleft;
                if (res == null) {
                    res = right;
                }

            }
            else{
                if(prevleft != null){
                    prevleft.next = left;
                }
                if(res == null){
                    res = left;
                    
                }
                break;
            }
        }
        return res;

    }
}