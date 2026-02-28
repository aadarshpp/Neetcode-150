# 33. Search in Rotated Sorted Array

## Difficulty
Medium

## Complexity
- Time: O(log(n))
- Space: O(1)

## Approach
Use two pointers l and r with middle m. If nums[m] is target, return m. If left side nums[l..m] is sorted and target is there, search left (r = m-1), else search right (l = m+1). If right side nums[m..r] is sorted, do the same symmetrically. Repeat until found or return -1.

## Links
- [LeetCode](https://leetcode.com/problems/search-in-rotated-sorted-array/)
- [NeetCode](https://neetcode.io/problems/find-target-in-rotated-sorted-array)
