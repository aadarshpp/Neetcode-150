# 128. Longest Consecutive Sequence

## Topics
- Array
- Hash Table
- Union-Find

## Difficulty
Medium

## Complexity
- Time: O(n * log(n))
- Space: O(1)

## Approach
Sort the list, then iterate through it: skip duplicates; if the current number is consecutive, increase the current count; otherwise, reset it and update the maximum count. At the end, update maximum count again and return it.

## Links
- [LeetCode](https://leetcode.com/problems/longest-consecutive-sequence)
- [NeetCode](https://neetcode.io/problems/longest-consecutive-sequence)