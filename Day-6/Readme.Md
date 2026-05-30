# String Compression

## Problem
Given an array of characters, compress it in place using the following rules:
- For each group of consecutive repeating characters:
  - If the group's length is 1, write the character.
  - If the group's length is greater than 1, write the character followed by the count.
- Return the new length of the compressed array.  
- Extra space usage must be constant.

---

## Intuition
Instead of building a new string, we can directly overwrite the input array.  
We just need to count consecutive characters and write the character plus its count back into the array.  
This way, we avoid using extra space and meet the problem’s constraints.

---

## Approach
1. Use two indices:
   - `i` → scans through the array.
   - `write` → position where we write the compressed result.
2. For each group of consecutive characters:
   - Count how many times the character repeats.
   - Write the character at `write`.
   - If count > 1, convert the count to string and write each digit separately.
3. Continue until the end of the array.
4. Return `write` as the new length.

---

## Complexity
- **Time Complexity:** `O(n)`  
  Each character is processed once.
- **Space Complexity:** `O(1)`  
  Only a few counters and pointers are used, no extra data structures.

---

## Example
Input: `["a","a","b","b","c","c","c"]`  
Output Length: `6`  
Compressed Array: `["a","2","b","2","c","3"]`
