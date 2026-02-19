class Solution:
    def isValidSudoku(self, board):
        rows = [[False] * 9 for _ in range(9)]
        cols = [[False] * 9 for _ in range(9)]
        boxes = [[False] * 9 for _ in range(9)]

        # Check each row and column
        for r in range(9):
            for c in range(9):
                n = board[r][c]
                if n != '.':
                    i = ord(n) - ord('1')
                    if rows[r][i] or cols[c][i]:
                        return False
                    else:
                        rows[r][i] = True
                        cols[c][i] = True

        # Check each box
        for b in range(9):
            for cell in range(9):
                r = (b // 3) * 3 + (cell // 3)
                c = (b % 3) * 3 + (cell % 3)
                n = board[r][c]
                if n != '.':
                    i = ord(n) - ord('1')
                    if boxes[b][i]:
                        return False
                    else:
                        boxes[b][i] = True

        return True
