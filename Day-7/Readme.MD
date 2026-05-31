# Day 7 - Max Number of Operations

## Problem Statement
You are given an integer array `nums` and an integer `k`.  
In one operation, you can pick two numbers from the array whose sum equals `k` and remove them.  
Return the maximum number of operations you can perform.

---

## Example 1
**Input:** `nums = [1,2,3,4], k = 5`  
**Output:** `2`  
**Explanation:**  
- Remove (1,4) → nums = [2,3]  
- Remove (2,3) → nums = []  
Total operations = 2

## Example 2
**Input:** `nums = [3,1,3,4,3], k = 6`  
**Output:** `1`  
**Explanation:**  
- Remove (3,3) → nums = [1,4,3]  
No more valid pairs. Total operations = 1

---

## Intuition
We need to find pairs of numbers that sum up to `k`.  
Sorting the array and using two pointers helps us efficiently check pairs without removing elements manually.

---

## Approach
1. Sort the array.  
2. Use two pointers (`lp` at start, `rp` at end).  
3. If `nums[lp] + nums[rp] == k`, count one operation and move both pointers inward.  
4. If sum < k, move left pointer forward.  
5. If sum > k, move right pointer backward.  
6. Continue until pointers cross.

---

## Complexity
- **Time Complexity:** `O(n log n)` (due to sorting)  
- **Space Complexity:** `O(1)` (in-place two-pointer traversal)

---

## Code
```Go and look in MaxNumOfPairs.java
