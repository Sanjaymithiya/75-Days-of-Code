# Day 1  
- Reversed a LinkedList
# Intuition:
- We want to reverse the direction of links in the list so that the last node becomes the new head.

# Approach:
- Start with `prev = null`
- Set `curr = head`
- Initialize `next`
- While `curr != null`:
  - Save `next = curr.next`
  - Reverse link `curr.next = prev`
  - Move `prev` forward
  - Move `curr` forward
- Return `prev`

# Complexity:
Time Complexity: O(n), since we visit each node once.
Space Complexity: O(1), since we only use constant extra space.

# Code 
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
