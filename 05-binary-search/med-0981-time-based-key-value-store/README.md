# 981. Time Based Key-Value Store

## Difficulty
Medium

## Complexity
- Time: O(s * 1 + g * log(n))
- Space: O(s)

> `s` is the number of set operations
> `g` is the number of get operations
> `n` is the maximum number of timestamps associated with a single key

## Approach
The main HashMap maps each key to a list, where the list contains Pair objects (timestamp, value). On get, use the HashMap to retrieve the list, then perform a binary search on the list to find the value with the largest timestamp less than or equal to the given timestamp.

## Links
- [LeetCode](https://leetcode.com/problems/time-based-key-value-store/)
- [NeetCode](https://neetcode.io/problems/time-based-key-value-store)
