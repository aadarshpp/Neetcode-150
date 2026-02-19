# 121. Best Time to Buy and Sell Stock

## Topics
- Array
- Dynamic Programming

## Difficulty
Easy

## Complexity
- Time: O(n)
- Space: O(1)

## Approach
Iterate from left to right, keep track of the minimum value seen so far. For each iteration, calculate the profit if sold on that day and bought at the minimum day, then compare and update the maximum profit. Return the maximum profit at the end.

## Links
- [LeetCode](https://leetcode.com/problems/best-time-to-buy-and-sell-stock)
- [NeetCode](https://neetcode.io/problems/buy-and-sell-crypto)