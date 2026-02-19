from typing import List

class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if not nums:
            return 0

        nums.sort()

        max_count = 1
        curr_count = 1

        for i in range(1, len(nums)):
            if nums[i] == nums[i - 1]:
                continue
            elif nums[i] == nums[i - 1] + 1:
                curr_count += 1
            else:
                max_count = max(max_count, curr_count)
                curr_count = 1

        max_count = max(max_count, curr_count)
        return max_count
