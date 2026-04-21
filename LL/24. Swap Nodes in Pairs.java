// https://leetcode.com/problems/swap-nodes-in-pairs?listId=552y65ke&page=1

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
    public static void reverse(ListNode head , int size){
    ListNode curr = head;
    ListNode prev = null;
    for(int i =0;i<size;i++){
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
}
    public ListNode swapPairs(ListNode head) {

    if(head == null) return head;
    ListNode left = head;
    ListNode res = null;
    ListNode prevleft = null;
    
    int size =2;
    while(true){
      ListNode  right = left;
    for(int i = 0;i<size-1;i++){
        if(right == null){
            break;
        }
        right = right.next;
    }
    if(right != null){
        ListNode nextleft = right.next;
        reverse(left,size);
        if(prevleft != null){ // jab left phele ka hoga tbhi humko usko right se jodna hoga
            prevleft.next = right;
        } 
        prevleft = left;
        left = nextleft;
        if(res == null){ // jab first pair hoga tabhi humko res ko set karna hoga kyu ki whi naya head hoga
            res = right;
        }
    }
    else{ // jab odd hoga to last ke pair mai ek bchega uske liye h 
        if(prevleft != null){
            prevleft.next = left;
        }
        if(res == null){ // agr abhi bhi null hai to iska matlab hai ki list mai sirf ek node hai to res ko left se set kar do
            res = left;
        }
        break;

    }
    
    }
    return res;
        
    }
}