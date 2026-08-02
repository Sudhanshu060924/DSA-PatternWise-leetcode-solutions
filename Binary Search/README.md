# 🔎 Binary Search

This folder contains LeetCode problems that can be solved efficiently using the **binary search** approach.

## 📌 When to Use Binary Search

- Sorted arrays or matrices
- Search for a target value
- Find boundary positions
- Optimize `O(n)` searches to `O(log n)`

## 🧠 Core Idea

Binary search repeatedly divides the search range in half until the target is found or the range is empty.

### Steps:

1. Define left and right pointers
2. Compute mid index
3. Compare target with value at mid
4. Move left or right accordingly
5. Repeat until found

## 🚀 Common Patterns

- Find element in sorted array
- Search in rotated array
- Find first/last occurrence
- Use binary search on answer range

## 📚 Included Problems

- Find Minimum in Rotated Sorted Array
- Search a 2D Matrix II
- First Bad Version
- Search in Rotated Sorted Array
- Find First and Last Position of Element in Sorted Array
- Search Insert Position
- Valid Perfect Square
- Guess Number Higher or Lower
- Kth Smallest Element in a Sorted Matrix
- Sqrt(x)
- Binary Search
- Search a 2D Matrix
- Find Smallest Letter Greater Than Target
- Peak Index in a Mountain Array
- Koko Eating Bananas

## ⏱️ Complexity

- Time: **O(log n)** for standard binary search
- Space: **O(1)**

---

## 🧩 Tips

- Handle edge cases for empty input.
- Use `mid = left + (right - left) / 2` to avoid overflow.
- Verify whether the search is inclusive or exclusive of endpoints.
