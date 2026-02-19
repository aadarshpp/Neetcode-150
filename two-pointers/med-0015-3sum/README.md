# 15. 3Sum

## Topics
- Array
- Two Pointers
- Sorting

## Difficulty
Medium

## Complexity
- Time: O(n ^ 2)
- Space: O(n ^ 2)

## Approach
1. **Sort the array** – Makes it easier to find triplets and skip duplicates.   Example: `[ -1, 0, 1, 2, -1, -4 ] → [ -4, -1, -1, 0, 1, 2 ]`.2. **Fix one number `a`** – Loop through the array, skipping duplicates.3. **Use two pointers `l` and `r`** – `l` after `a`, `r` at the end; move toward each other to find `b + c = -a`.4. **Skip duplicates for `b` and `c`** – After finding a triplet, advance pointers past duplicates.5. **Collect triplets** – Repeat for each `a` to get all unique triplets summing to zero.

## Links
- [LeetCode](https://leetcode.com/problems/3sum)
- [NeetCode](https://neetcode.io/problems/three-integer-sum)