# 238. Product of Array Except Self

## Topics
- Array
- Prefix Sum

## Difficulty
Medium

## Complexity
- Time: O(n)
- Space: O(1)

## Approach
**Prefix Step**: Build the prefix product in the output array, so each element holds the product of all numbers before it. After this, `answer[i] = nums[0] * nums[1] * ... * nums[i-1]`.

**Suffix Integration Step**: Traverse from right to left using a suffix variable to multiply each element by all numbers after it. This gives the product of all elements except itself, without using division. At each step, `suffix = nums[n-1] * nums[n-2] * ... * nums[i+1]`.

## Links
- [LeetCode](https://leetcode.com/problems/product-of-array-except-self)
- [NeetCode](https://neetcode.io/problems/products-of-array-discluding-self)