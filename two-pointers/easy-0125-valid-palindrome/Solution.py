class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = s.lower()
        n = len(s)
        i = 0
        j = n - 1

        while (i < j):
            while (i < n  and not s[i].isalnum()): i += 1
            while (j > -1 and not s[j].isalnum()): j -= 1

            if (i >= j): break

            if (s[i] != s[j]): 
                print(i, j, s[i], s[j])
                return False
            else:
                i += 1
                j -= 1

        return True