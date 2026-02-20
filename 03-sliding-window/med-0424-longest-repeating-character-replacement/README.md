# 424. Longest Repeating Character Replacement

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
We use a sliding window where `i` at the right end and `start` is the left end. The `count` array stores the frequency of letters in the current window, and `maxFreq` keeps track of the most frequent character.To achieve `maxFreq`, we need to remove evrything else, if that is not possible with the given constraint (`(i - start + 1 - maxFreq) > k`), we need more than `k` replacements, so we move `start` forward to shrink the window.We keep updating the maximum valid window length during the process.

## Links
- [LeetCode](https://leetcode.com/problems/longest-repeating-character-replacement)
- [NeetCode](https://neetcode.io/problems/longest-repeating-substring-with-replacement)