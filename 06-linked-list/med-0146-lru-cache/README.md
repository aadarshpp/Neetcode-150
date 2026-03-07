# 146. LRU Cache

## Difficulty
Medium

## Complexity
- Time: O(1)
- Space: O(1)

## Approach
Use a HashMap to quickly access nodes by key and a doubly linked list to maintain usage order. Recently used items are moved to the tail, while the least recently used item stays near the head. On get, move the accessed node to the tail. On put, update existing nodes or insert new ones, evicting the LRU node (head.next) if capacity is full.

## Links
- [LeetCode](https://leetcode.com/problems/lru-cache/)
- [NeetCode](https://neetcode.io/problems/lru-cache/)
