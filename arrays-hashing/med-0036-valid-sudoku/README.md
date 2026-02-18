# 36. Valid Sudoku

## Topics
- Array
- Hash Table
- Matrix

## Difficulty
Medium

## Complexity
- Time: O(1)
- Space: O(1)

## Approach
Initialize three boolean matrices of size 9×9 for rows, columns, and boxes. Each row of these matrices represents a row, column, or box, and each column represents the numbers 1–9 in that group.

Check each cell in the board. If a number already exists in the same row or column, return false. Otherwise, mark it as seen in the row and column matrices.

For each of the 9 boxes, calculate the row and column of each of the 9 cells. If a number already exists in the box, return false. Otherwise, mark it as seen.

## Links
- [LeetCode](https://leetcode.com/problems/valid-sudoku)
- [NeetCode](https://neetcode.io/problems/valid-sudoku) 