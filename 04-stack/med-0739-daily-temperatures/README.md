# 739. Daily Temperatures

## Topics
- Array
- Stack
- Monotonic Stack

## Difficulty
Medium

## Complexity
- Time: O(n)
- Space: O(n)

## Approach
We keep track of days that are still waiting for a warmer temperature using a stack. As we go through each day, if the current temperature is warmer than the day on top of the stack, we know how long it took to get warmer and update the result. Then we add the current day to the stack. The stack helps us efficiently find the next warmer day for each day.

## Links
- [LeetCode](https://leetcode.com/problems/daily-temperatures/)
- [NeetCode](https://neetcode.io/problems/daily-temperatures/)