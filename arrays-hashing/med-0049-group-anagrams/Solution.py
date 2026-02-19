from typing import List

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagram_dict = dict()

        for s in strs:
            letter_counts = [0] * 26
            
            for c in s:
                index = ord(c) - ord('a')
                letter_counts[index] += 1

            key = tuple(letter_counts)

            if key not in anagram_dict:
                anagram_dict[key] = []

            anagram_dict[key].append(s)

        return list(anagram_dict.values())
            