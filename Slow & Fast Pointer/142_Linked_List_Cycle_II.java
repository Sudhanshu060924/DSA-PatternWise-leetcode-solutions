//https://leetcode.com/problems/linked-list-cycle-ii?listId=552y65ke&page=1

// Definition for singly-linked list.
 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
 }

 class solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                slow = head; // reset slow to the head of the list
                while(slow != fast){ // move both pointers one step at a time until they meet again
                    slow =slow.next;
                    fast = fast.next;
                }
                return slow; // the node where they meet is the start of the cycle
            }
        }
        return null;
    }
}