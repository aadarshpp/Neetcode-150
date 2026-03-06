# 2. Add Two Numbers

## Difficulty
Medium

## Complexity
- Time: O(n)
- Space: O(n)

## Approach
Traverse both linked lists simultaneously while maintaining a carry. Add corresponding digits from both lists plus the carry, compute the digit (sum % 10) and update the carry (sum / 10). Append the digit to the result list and move forward. After traversal, append the remaining carry if it exists.

## Links
- [LeetCode](https://leetcode.com/problems/add-two-numbers/)
- [NeetCode](https://neetcode.io/problems/add-two-numbers/)
