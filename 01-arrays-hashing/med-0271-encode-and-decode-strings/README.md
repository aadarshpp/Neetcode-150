# 271. Encode and Decode Strings

## Topics
- Array
- String
- Design

## Difficulty
Medium

## Complexity
- Time:
    - Encoding: O(n + m)
    - Decoding: O(m)
- Space:
    - Encoding: O(m)
    - Decoding: O(n + m)

>n = number of strings   
>m = total characters in all strings.

## Approach
**Encoding**: Take each string from the list and store its length as a single character (this works because the length is guaranteed to be less than 200). Then, append the string itself. 
Basically, each string will be stored as `<char with unicode = length of string i><string i>`
Example: `["hi", "cat"]` is encoded as `"\u0002hi\u0003cat"`

**Decoding**: Read the first character to get the length of the string. Then, read that many characters as the string. Move the pointer to the next character after the string and repeat for all strings. Add all extracted strings to a list in the same order.

## Links
- [LeetCode](https://leetcode.com/problems/encode-and-decode-strings)
- [NeetCode](https://neetcode.io/problems/string-encode-and-decode)