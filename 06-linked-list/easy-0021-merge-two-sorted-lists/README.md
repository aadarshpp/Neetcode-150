# 21. Merge Two Sorted Lists

## Difficulty
Easy

## Complexity
- Time: O(n + m)
- Space: O(1)

> n and m are the lengths of the two input lists

## Approach
We use a dummy node to simplify handling the head of the merged list. Two pointers traverse the input lists (ptr1 and ptr2). At each step, we compare the current node values and attach the smaller node to the merged list, then move that pointer forward. Once one list is exhausted, we attach the remaining nodes from the other list. This method merges the lists in-place without extra memory for new nodes.

## Links
- [LeetCode](https://leetcode.com/problems/merge-two-sorted-lists/)
- [NeetCode](https://neetcode.io/problems/merge-two-sorted-linked-lists)
