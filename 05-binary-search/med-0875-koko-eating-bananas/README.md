# 875. Koko Eating Bananas

## Topics
- Array
- Binary Search

## Difficulty
Medium

## Complexity
- Time: O(nlog(n))
- Space: O(1)

## Approach
This code finds the **minimum speed** Koko needs to eat all the bananas in `h` hours. It starts by setting the lowest speed to 1 and the highest to the biggest pile. Then it uses **binary search**: for each middle speed, it calculates how many hours it would take to finish all piles. If Koko can finish in time, it tries a slower speed; if not, it tries a faster speed. Finally, it returns the smallest speed that works.

## Links
- [LeetCode](https://leetcode.com/problems/koko-eating-bananas)
- [NeetCode]()
