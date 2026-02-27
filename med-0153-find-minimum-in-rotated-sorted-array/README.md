# 153. Find Minimum in Rotated Sorted Array

## Difficulty
Medium

## Complexity
- Time: O(log n) avg, O(n) worst
- Space: O(1)

## Approach
Compare the middle element with the rightmost element. If mid is greater than right, the minimum is in the right half, so move left = mid + 1. Otherwise, the minimum is in the left half (including mid), so move right = mid. When left equals right, that element is the minimum

## Links
- [LeetCode](https://neetcode.io/problems/find-minimum-in-rotated-sorted-array/)
- [NeetCode](https://neetcode.io/problems/find-minimum-in-rotated-sorted-array)
