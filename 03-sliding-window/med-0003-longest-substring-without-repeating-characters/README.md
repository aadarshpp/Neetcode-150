# 3. Longest Substring Without Repeating Characters

## Topics
- Hash Table
- String
- Sliding Window

## Difficulty
Medium

## Complexity
- Time: O(n)
- Space: O(1)

## Approach
Use a sliding window and a HashSet to track characters in the current substring. `start` is the start index of the window, `i` is the end index, and the set stores the characters in the window.Loop through the string with `i`. If the character is not in the set, add it. If it is a duplicate, update `maxCount`, remove characters from the start until the duplicate is gone, and move `start` forward.After the loop, check the set one last time to update `maxCount` and return the length of the longest substring without repeating characters.

## Links
- [LeetCode](https://leetcode.com/problems/longest-substring-without-repeating-characters)
- [NeetCode](https://neetcode.io/problems/longest-substring-without-duplicates)