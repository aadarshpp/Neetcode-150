from typing import List

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        result = []

        for i in range(len(nums) - 2):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            a = nums[i]
            l, r = i + 1, len(nums) - 1

            while l < r:
                curr_sum = a + nums[l] + nums[r]
                if curr_sum < 0:
                    l += 1
                elif curr_sum > 0:
                    r -= 1
                else:
                    result.append([a, nums[l], nums[r]])
                    l_val, r_val = nums[l], nums[r]
                    while l < r and nums[l] == l_val:
                        l += 1
                    while l < r and nums[r] == r_val:
                        r -= 1

        return result
