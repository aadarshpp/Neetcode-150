# 155. Min Stack

## Topics
- Stack
- Design

## Difficulty
Medium

## Complexity
- Time: O(1) [for each function]
- Space: O(n)

## Approach
Each node stores the value and the minimum value up to that point. When pushing, we compare the new value with the current minimum and store the smaller one. So `push`, `pop`, `top`, and `getMin` all run in **O(1)** time.

## Links
- [LeetCode](https://leetcode.com/problems/min-stack)
- [NeetCode](https://neetcode.io/problems/minimum-stack)
