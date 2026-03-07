# 100. Same Tree

## Difficulty
Easy

## Complexity
- Time: O(n)
- Space: O(h)

## Approach
Use recursion to compare both trees simultaneously. If both nodes are null they are equal, and if only one is null they are different. Otherwise check that the current node values are equal and recursively verify that the left subtrees and right subtrees are also identical.

## Links
- [LeetCode](https://leetcode.com/problems/same-tree/)
- [NeetCode](https://neetcode.io/problems/same-binary-tree/)
