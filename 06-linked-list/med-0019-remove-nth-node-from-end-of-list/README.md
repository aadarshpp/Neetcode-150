# 19. Remove Nth Node From End of List

## Difficulty
Medium

## Complexity
- Time: O(L)
- Space: O(1)

> L = length of linked list

## Approach
Make a dummy node where dummy.next = head. Put start and end at dummy. Move end forward n + 1 times so there is a gap of n nodes between start and end. Then move both start and end together until end hits null. At this point, start.next is the node to remove, so set start.next = start.next.next. This handles all cases, including when the head needs to be removed. Finally, return dummy.next as the new head of the list.

## Links
- [LeetCode](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
- [NeetCode](https://neetcode.io/problems/reorder-linked-list)
