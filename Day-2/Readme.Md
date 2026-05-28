# Day 2 - Container With Most Water

## Problem
Given an array `height` where each element represents the height of a vertical line on the x-axis.  
Find two lines that together with the x-axis form a container, such that the container holds the most water.  
Return the maximum amount of water a container can store.

---

## Intuition
The brute force way would be to check all pairs, but that’s inefficient.  
Instead, we use a **two-pointer approach**:
- Start with the widest container (left at 0, right at n-1).
- Calculate the area.
- Move the pointer at the shorter line inward, since the height limits the area.
- Repeat until pointers meet.

---

## Approach
- Initialize two pointers: `lp = 0`, `rp = n-1`.
- While `lp < rp`:
  - Compute width = `rp - lp`.
  - Compute height = `min(height[lp], height[rp])`.
  - Compute area = `width * height`.
  - Update `maxArea` if this area is larger.
  - Move the pointer at the shorter line inward.
- Return `maxArea`.

---

## Complexity
- **Time Complexity:** O(n) — each pointer moves at most once across the array.
- **Space Complexity:** O(1) — only a few variables are used.
