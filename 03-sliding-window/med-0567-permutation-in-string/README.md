# 567. Permutation in String

## Topics
- Hash Table
- Two Pointers
- String
- Sliding Window

## Difficulty
Medium

## Complexity
- Time: O(n)
- Space: O(1)

## Approach
Use sliding window with character frequency counting. First, we compute the frequency of each character in `s1` using an integer array of size 26 (since the problem involves lowercase English letters). Then, we slide a window of length `s1.length()` across `s2`. As the window moves, we maintain another frequency array that tracks the characters inside the current window. Instead of sorting substrings, we dynamically update the window’s frequency by adding the new character entering the window and removing the character leaving it.

At each step, we compare the frequency array of the current window with that of `s1`. If both arrays match, it means the current substring is a permutation of `s1`, and we return `true`. Because each character in `s2` is processed at most twice (once when added and once when removed), and the frequency comparison is constant time (fixed 26 letters).

## Links
- [LeetCode](https://leetcode.com/problems/permutation-in-string/)
- [NeetCode](https://neetcode.io/problems/permutation-string)