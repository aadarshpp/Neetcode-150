# 74. Search a 2D Matrix

## Difficulty
Medium

## Complexity
- Time: O(log(n * m))
- Space: O(1)

> n = number of rows in the matrix
> m = number of columns in the matrix

## Approach
Since the matrix is sorted row-wise and each row’s first element is greater than the previous row’s last element, we can treat the matrix as a single sorted array and apply binary search by mapping 1D indices back to 2D.

## Links
- [LeetCode](https://leetcode.com/problems/search-a-2d-matrix)
- [NeetCode](https://neetcode.io/problems/search-2d-matrix)
