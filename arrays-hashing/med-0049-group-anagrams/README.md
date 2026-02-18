# 49. Group Anagrams

## Topics
- Array
- Hash Table
- String
- Sorting

## Difficulty
Medium

## Complexity
- Time: O(n * k)
- Space: O(n * k)

>n = number of strings in list   
>k = length of longest string

## Approach
All anagrams have the same letter counts. Represent each word as a string of its letter counts, separated by `#`, and use this string as a key in a HashMap, where the value is a list of words sharing the same key.

## Links
- [LeetCode](https://leetcode.com/problems/group-anagrams)
- [NeetCode](https://neetcode.io/problems/anagram-groups)