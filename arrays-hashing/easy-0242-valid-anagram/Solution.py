class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if (len(s) != len(t)): return False

        letter_counts = [0] * 26
        a_ord = ord('a')

        for i in range(len(s)):
            letter_counts[ord(s[i])-a_ord] += 1
            letter_counts[ord(t[i])-a_ord] -= 1

        for count in letter_counts:
            if count != 0:
                return False

        return True
