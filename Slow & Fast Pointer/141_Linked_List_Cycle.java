//https://leetcode.com/problems/linked-list-cycle


//  * Definition for singly-linked list.
 class ListNode {
    int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 
class  solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){ // if there is only one node or no node, then there can't be a cycle
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){ // if there is a cycle, then fast will never be null and fast.next will never be null, so we can use this condition to stop the loop when there is no cycle
           slow = slow.next;
           fast = fast.next.next;
           if(slow == fast){ //
            return true;
           }
        }
        return false;
    }
}