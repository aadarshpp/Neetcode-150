from typing import List

class Solution:
    def encode(self, strs: List[str]) -> str:
        encoded = []
        for s in strs:
            # Store string length as a single char (length < 200)
            encoded.append(chr(len(s)))
            encoded.append(s)
        return ''.join(encoded)

    def decode(self, s: str) -> List[str]:
        result = []
        i = 0
        while i < len(s):
            length = ord(s[i])  # Read length (convert char to int)
            i += 1
            result.append(s[i:i + length])
            i += length
        return result