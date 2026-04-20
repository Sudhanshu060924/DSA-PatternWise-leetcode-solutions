// https://leetcode.com/problems/reverse-linked-list-ii?listId=552y65ke&page=1

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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode before = null;
        ListNode t = head;
        if(head == null) return head;
        if(left == right) return head;

        int count = 1;
   
        while(count < left){
            before = t;
            t = t.next;
            count++;
            continue;
        }
        ListNode curr = t;
        ListNode prev = null;
        int times = right-left+1;

        while(times-- >0){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        if(before != null){
            before.next = prev;
                }
                else{
                    head = prev;
                }
        t.next = curr;
        
    return head;
    
    }
}