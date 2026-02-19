# 11. Container With Most Water

## Topics
- Array
- Two Pointers
- Greedy

## Difficulty
Medium

## Complexity
- Time: O(n)
- Space: O(1)

## Approach
Create two pointers, `left` and `right`, at the ends of the array. Compute the area between them and update `max_area` if it’s larger. Then check which line is shorter, and move that pointer inward. Keep repeating this until the pointers cross. This works because we are using a greedy approach, always trying to maximize the area by moving the smaller line.

## Links
- [LeetCode](https://leetcode.com/problems/container-with-most-water)
- [NeetCode](https://neetcode.io/problems/max-water-container)