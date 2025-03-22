class Solution {
    int count = 0;

    public int totalNQueens(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2 || n == 3) {
            return 0;
        }
        char[][] board=new char[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = '.';
        nqueen(board, n, 0);
        return count;

    }

    public void nqueen(char[][] board, int tq, int row) {

        if (tq == 0) {
            count++;
            return;
        }

        if (row == board.length) {
            
            return;
        }

        for (int j = 0; j < board.length; j++) {
            if (ispossible(board, row, j)) {
                board[row][j] = 'Q';

                nqueen(board, tq - 1, row + 1);
                board[row][j] = '.';

            }
        }
    }

    public static boolean ispossible(char[][] board, int row, int col) {
        int r = row;
        int c = col;
        while (r >= 0) {
            if (board[r][col] == 'Q')
                return false;
            r--;
        }
        r = row;
        c = col;
        while (r >= 0 && c < board[0].length) {
            if (board[r][c] == 'Q')
                return false;
            r--;
            c++;
        }
        // right diag
        r = row;
        c = col;
        while (r >= 0 && c >= 0) {
            if (board[r][c] == 'Q')
                return false;
            r--;
            c--;
        }

        return true;
    }
}