# 572. Subtree of Another Tree

## Difficulty
Easy

## Complexity
- Time: O(n * m)
- Space: O(h)

## Approach
Traverse the main tree and at each node check if the subtree starting there is identical to subRoot. If the current nodes match, recursively verify both trees using isSame. If not, continue searching in the left and right subtrees until a matching subtree is found or all nodes are checked.

## Links
- [LeetCode](https://leetcode.com/problems/subtree-of-another-tree/)
- [NeetCode](https://neetcode.io/problems/subtree-of-a-binary-tree/)
