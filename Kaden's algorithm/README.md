# 📈 Kadane’s Algorithm

Used to find **maximum/minimum subarray sum**.

## 📌 Key Concepts
- Subarray must be contiguous
- Decide:
  - Extend
  - Start new

## 🧠 Idea
At each index:
- `current = max(num, current + num)`
- `max = max(max, current)`

## ⏱️ Complexity
- Time: **O(n)**
- Space: **O(1)**