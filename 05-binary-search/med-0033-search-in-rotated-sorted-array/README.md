# 33. Search in Rotated Sorted Array

## Difficulty
Medium

## Complexity
- Time: O(s * 1 + g * log(n))
- Space: O(s)

## Approach
Use a HashMap to store each key and its list of (timestamp, value) pairs.In get(), retrieve the list from the map and use binary search to find the value with the greatest timestamp less than or equal to the given timestamp.

## Links
- [LeetCode](https://leetcode.com/problems/search-in-rotated-sorted-array/)
- [NeetCode](https://neetcode.io/problems/time-based-key-value-store)
