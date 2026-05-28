# Day 3 - Remove Stars From a String

## Problem
Given a string `s` containing lowercase letters and stars `*`.  
Each `*` removes itself and the closest non-star character to its left.  
Return the final string after all stars are removed.

---

## Intuition
Think of the string as a sequence where each star cancels out the character before it.  
This is similar to how a stack works — last in, first out.

---

## Approach
- Traverse the string from left to right.
- Use a stack-like structure:
  - Push letters into the stack.
  - On encountering `*`, pop the last letter (remove it) and skip the star.
- The stack at the end represents the final string.

---

## Complexity
- **Time Complexity:** O(n) — each character is processed once.
- **Space Complexity:** O(n) — stack/StringBuilder stores the result.
