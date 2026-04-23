# 🔁 Reverse Linked List (DSA Pattern)

This repository demonstrates the **Reverse Linked List** pattern, one of the most important concepts in **Data Structures & Algorithms (DSA)**.

---

## 📌 Problem Statement

Given the head of a singly linked list, reverse the list and return the new head.

---

## 🧠 Intuition

To reverse a linked list, we need to **change the direction of pointers**.

Instead of:
```
1 → 2 → 3 → 4 → NULL
```

We transform it into:
```
1 ← 2 ← 3 ← 4 ← NULL
```

Final result:
```
4 → 3 → 2 → 1 → NULL
```

---

## ⚙️ Approach

We use **three pointers**:

- `prev` → initially `null`
- `curr` → starts from `head`
- `next` → to store next node

### Steps:
1. Store next node
2. Reverse current pointer
3. Move `prev` and `curr` forward
4. Repeat until `curr == null`

---

## 💻 Code Implementation (Java)

```java
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next; // store next
            curr.next = prev;          // reverse link
            prev = curr;               // move prev
            curr = next;               // move curr
        }

        return prev;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.print("Original: ");
        printList(head);

        head = reverseList(head);

        System.out.print("Reversed: ");
        printList(head);
    }
}
```

---

## ⏱️ Complexity Analysis

| Type       | Complexity |
|------------|-----------|
| Time       | O(n)      |
| Space      | O(1)      |

---

## 🔁 Recursive Approach (Optional)

```java
public static ListNode reverseRecursive(ListNode head) {
    if (head == null || head.next == null) return head;

    ListNode newHead = reverseRecursive(head.next);

    head.next.next = head;
    head.next = null;

    return newHead;
}
```

---

## 📚 Pattern Recognition

This problem falls under:
- Linked List Manipulation
- Pointer Reversal Pattern
- In-place Algorithm

---

## 🚀 Related Problems

- Reverse Linked List II
- Reverse Nodes in K-Group
- Palindrome Linked List
- Detect Cycle in Linked List

---

## 🏁 Summary

- Use **3-pointer technique**
- Reverse links one by one
- Keep track of previous node
- Return `prev` as new head

---

## ⭐ Contribution

Feel free to fork this repo, improve explanations, or add more variations of linked list problems!

---

## 📬 Connect

Made with ❤️ for DSA practice.
