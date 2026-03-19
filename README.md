# DSA-PatternWise-leetcode-solutions

## Two Pointer Technique (DSA)

The **Two Pointer Technique** is an efficient approach used in arrays and strings where two indices move through the data structure to solve problems in linear time.

### When to Use
- When the problem involves **arrays or strings**
- When the array is **sorted**
- When searching for **pairs or subarrays**
- When trying to **optimize brute-force O(n²) solutions**

### Basic Idea
1. Initialize two pointers (e.g., `left = 0`, `right = n - 1`).
2. Compare elements based on the required condition.
3. Move pointers accordingly:
   - Increase `left`
   - Decrease `right`
4. Continue until the condition is satisfied or pointers meet.

### Common Applications
- Finding **pair with given sum**
- **Removing duplicates** from a sorted array
- **Reversing** an array or string
- **Checking palindrome**
- **Merging two sorted arrays**
- **Sliding window problems**

### Time Complexity
- **O(n)** in most cases

### Space Complexity
- **O(1)** (constant extra space)

## Sliding Window Technique (DSA)

The **Sliding Window Technique** is used to process **subarrays or substrings efficiently** by maintaining a window (range) that moves across the array or string.

Instead of recalculating values for every subarray, the window **slides forward** and updates the result in **O(n) time**.

### When to Use
- When the problem involves **subarrays or substrings**
- When working with **contiguous elements**
- When asked to find **maximum, minimum, or count of a subarray**
- When brute force solution is **O(n²)**

### Basic Idea
1. Initialize two pointers: `left` and `right`.
2. Expand the window by moving `right`.
3. Update the result while the window is valid.
4. Shrink the window by moving `left` if needed.
5. Continue until `right` reaches the end.

### Common Applications
- **Maximum sum subarray of size k**
- **Longest substring without repeating characters**
- **Minimum window substring**
- **Longest subarray with given sum**
- **Count of valid subarrays**

### Time Complexity
- **O(n)** because each element is visited at most twice.

### Space Complexity
- **O(1)** or **O(k)** depending on the problem.

## Fast and Slow Pointer Technique (Floyd’s Cycle Detection)

The **Fast and Slow Pointer Technique** uses two pointers moving at **different speeds** to solve problems related to cycles or middle elements in linked lists or arrays.

### When to Use
- When working with **linked lists**
- When detecting **cycles in a list**
- When finding the **middle of a linked list**
- When checking if a **number is a happy number**
- When finding the **start of a cycle**

### Basic Idea
1. Initialize two pointers:
   - `slow` moves **one step at a time**
   - `fast` moves **two steps at a time**
2. Traverse the data structure.
3. If there is a **cycle**, the pointers will eventually meet.
4. If `fast` reaches the end, then **no cycle exists**.

### Common Applications
- **Detect cycle in linked list**
- **Find middle of linked list**
- **Find start of cycle**
- **Happy number problem**
- **Remove cycle in linked list**

### Time Complexity
- **O(n)**

### Space Complexity
- **O(1)** (constant extra space)


# Kadane’s Algorithm (Max / Min Sum & Product Subarray)

Kadane’s Algorithm is used to solve problems related to **contiguous subarrays** efficiently in **O(n)** time.

---

## 📌 Key Concepts

- **Subarray** → Must be **contiguous**
- Array may contain:
  - Positive numbers
  - Negative numbers
  - Zeros
- At every index, we decide:
  - 👉 **Extend previous subarray**
  - 👉 **Start new subarray**

---

## 🧠 Core Idea (Index by Index)

At each index `i`, compute:

```java
v1 = best + arr[i];   // extend previous
v2 = arr[i];          // start new