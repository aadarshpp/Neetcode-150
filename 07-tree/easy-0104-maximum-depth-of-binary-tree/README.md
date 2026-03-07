# 104. Maximum Depth of Binary Tree

## Difficulty
Easy

## Complexity
- Time: O(n)
- Space: O(h)

## Approach
Use recursion to find the depth of the left and right subtrees of each node, take the maximum of the two, and add 1 for the current node. If the node is null, return 0. This propagates the maximum depth up to the root.

## Links
- [LeetCode](https://leetcode.com/problems/maximum-depth-of-binary-tree/)
- [NeetCode](https://neetcode.io/problems/depth-of-binary-tree/)
