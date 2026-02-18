# 347. Top K Frequent Elements

## Topics
- Array
- Hash Table
- Divide and Conquer
- Sorting
- Heap (Priority Queue)
- Bucket Sort
- Counting
- Quickselect

## Difficulty
Medium

## Complexity
- Time: O(n * log(k))
- Space: O(n)

## Approach
Count the frequency of each number in the array using a hashmap. Iterate over the hashmap entries and add them to a min-heap (the heap is ordered by frequency). If the min-heap size exceeds `k`, remove the smallest element to keep the heap size at `k`. At the end, extract all numbers from the min-heap and store them in the result array.

## Links
- [LeetCode](https://leetcode.com/problems/top-k-frequent-elements)
- [NeetCode](https://neetcode.io/problems/top-k-elements-in-list)