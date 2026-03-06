# 287. Find the Duplicate Number

## Difficulty
Medium

## Complexity
- Time: O(n)
- Space: O(1)

## Approach
Treat the array as a linked list where index → next index (nums[i]). Use Floyd’s cycle detection with slow and fast pointers to find a meeting point inside the cycle. Start another pointer from the beginning and move both one step at a time. Their meeting point is the duplicate number (cycle entrance).

## Links
- [LeetCode](https://leetcode.com/problems/find-the-duplicate-number/)
- [NeetCode](https://neetcode.io/problems/find-duplicate-integer)
