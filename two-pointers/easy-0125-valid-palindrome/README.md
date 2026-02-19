# 125. Valid Palindrome

## Topics
- Two Pointers
- String

## Difficulty
Easy

## Complexity
- Time: O(n)
- Space: O(n)

## Approach
Convert the string to lowercase. Use two pointers, i and j, at the ends. Skip non-alphanumeric characters, then compare the characters. If they match, move the pointers toward each other. If the pointers cross without mismatches, the string is a palindrome.

## Links
- [LeetCode](https://leetcode.com/problems/valid-palindrome)
- [NeetCode](https://neetcode.io/problems/is-palindrome)