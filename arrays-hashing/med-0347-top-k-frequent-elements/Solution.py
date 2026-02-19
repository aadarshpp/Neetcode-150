from typing import List
import heapq
from collections import Counter

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        # Count frequency
        freq_map = Counter(nums)

        # Min-heap to keep top k frequent elements
        min_heap = []
        for num, freq in freq_map.items():
            heapq.heappush(min_heap, (freq, num))
            if len(min_heap) > k:
                heapq.heappop(min_heap)  # remove least frequent

        # Build result array (from least frequent in heap to most frequent)
        result = [0] * k
        for i in range(k - 1, -1, -1):
            result[i] = heapq.heappop(min_heap)[1]

        return result
