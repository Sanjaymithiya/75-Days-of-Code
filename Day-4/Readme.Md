# Day 4 - Kids With the Greatest Number of Candies

## Problem
There are `n` kids with candies.  
You are given an integer array `candies`, where `candies[i]` represents the number of candies the i-th kid has, and an integer `extraCandies`.  

Return a boolean array `result` of length `n`, where `result[i]` is true if, after giving the i-th kid all the `extraCandies`, they will have the greatest number of candies among all the kids, or false otherwise.

---

## Intuition
The key idea is to compare each kid’s candies + extraCandies with the **maximum candies** any kid currently has.  
If the sum is greater than or equal to the maximum, that kid can be the greatest.

---

## Approach
1. Find the maximum number of candies among all kids.
2. For each kid:
   - Add `extraCandies` to their current candies.
   - Compare with the maximum.
   - If greater or equal, mark `true`; otherwise, `false`.
3. Return the boolean list.

---

## Complexity
- **Time Complexity:** O(n) — one pass to find max, one pass to check each kid.
- **Space Complexity:** O(n) — result array of size `n`.
