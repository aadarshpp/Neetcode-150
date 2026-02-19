from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        index_dict = dict()

        for i in range(len(nums)):
            required = target - nums[i]

            if (required in index_dict):
                index_of_required = index_dict[required]
                return [index_of_required, i]

            index_dict[nums[i]] = i

        return [-1, -1]