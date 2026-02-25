# 150. Evaluate Reverse Polish Notation

## Topics
- Array
- Math
- Stack

## Difficulty
Medium

## Complexity
- Time: O(n)
- Space: O(n)

## Approach
Iterate through the tokens
- If a token is a number, 
    - push it onto the stack. 
- If a token is an operator, 
    - pop the top two elements from the stack, apply the operator to them (second popped operator first popped), and push the result back onto the stack.

## Links
- [LeetCode](https://leetcode.com/problems/evaluate-reverse-polish-notation)
- [NeetCode](https://neetcode.io/problems/evaluate-reverse-polish-notation/)