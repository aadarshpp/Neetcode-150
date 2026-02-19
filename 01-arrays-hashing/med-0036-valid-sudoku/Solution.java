class Solution {

    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        // Check each row and column
        for (int r=0; r<9; r++) {
            for (int c=0; c<9; c++) {
                char n = board[r][c];
                if (n != '.') { 
                    int i = n - '1';
                    if (rows[r][i] || cols[c][i]) {
                        return false;
                    } else {
                        rows[r][i] = true;
                        cols[c][i] = true;
                    } 
                }
            }
        }

        // Check each box
        for (int b=0; b<9; b++) {
            for (int cell=0; cell<9; cell++) {
                int r = (b / 3) * 3 + (cell / 3);
                int c = (b % 3) * 3 + (cell % 3);
                char n = board[r][c];
                if (n != '.') { 
                    int i = n - '1';
                    if (boxes[b][i]) {
                        return false;
                    } else {
                        boxes[b][i] = true;
                    } 
                }
            }
        }

        return true;
    }
}