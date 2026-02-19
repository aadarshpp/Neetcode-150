from typing import List

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        answer = [0] * n

        # Build prefix product (stored in answer array)
        answer[0] = 1
        for i in range(1, n):
            answer[i] = answer[i - 1] * nums[i - 1]

        # Multiply by suffix product on the fly
        suffix = 1
        for i in range(n - 1, -1, -1):
            answer[i] *= suffix  # prefix * suffix (excluding nums[i] itself)
            suffix *= nums[i]

        return answer