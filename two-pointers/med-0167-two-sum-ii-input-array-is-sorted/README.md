# 167. Two Sum II - Input Array Is Sorted

## Topics
- Array
- Two Pointers
- Binary Search

## Difficulty
Medium

## Complexity
- Time: O(n)
- Space: O(1)

## Approach
Initialize two pointers, `i` and `j`, at the ends of the array (`i` at the start, `j` at the end). Let `curr_sum` be the sum of the elements at indices `i` and `j`. If `curr_sum < target`, we need a bigger number, so increment `i`. If `curr_sum > target`, we need a smaller number, so decrement `j`. If `curr_sum == target`, return `[i+1, j+1]` as the answer in 1-based indexing.

## Links
- [LeetCode](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)
- [NeetCode](https://neetcode.io/problems/two-integer-sum-ii)