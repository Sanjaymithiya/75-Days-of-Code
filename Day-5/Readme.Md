# Reverse Vowels in a String

## Problem Statement
Given a string `s`, reverse only all the vowels in the string and return it.  
The vowels are `a, e, i, o, u` (both lowercase and uppercase).

### Example 1
**Input:** `s = "IceCreAm"`  
**Output:** `"AceCreIm"`

### Example 2
**Input:** `s = "leetcode"`  
**Output:** `"leotcede"`

---

## Intuition
We need to reverse only the vowels while keeping consonants in place.  
This suggests a two-pointer approach: one pointer from the left, one from the right, swapping vowels when found.

## Approach
1. Convert the string into a character array for easy swapping.
2. Use two pointers (`lp` and `rp`) starting from both ends.
3. Move pointers until they point to vowels.
4. Swap the vowels and continue until pointers meet.
5. Return the modified string.

## Time Complexity
- **O(n)** — each character is visited at most once.

## Space Complexity
- **O(n)** — due to character array conversion.
