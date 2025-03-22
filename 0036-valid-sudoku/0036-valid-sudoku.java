class Solution {
    public boolean isValidSudoku(char[][] board) {
       for(int i=0;i<9;i++){
           for(int j=0;j<9;j++){
               if(board[i][j]=='.') continue;
               char num=board[i][j];
               board[i][j]='.';
               if(check(board,i,j,num)==false) return false;
               board[i][j]=num;
           }
       }
       return true;
    }

    public static boolean check(char grid[][], int row, int col, char val) {
        int r = row;
        int c = col;
        // for row
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][c] == val) {
                return false;
            }
        }
        for (int i = 0; i < grid[0].length; i++) {
            if (grid[r][i] == val) {
                return false;
            }
        }
        // for 3x3 matrix
        r = row - row % 3;
        c = col - col % 3;
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (grid[i][j] == val) {
                    return false;
                }
            }
        }

        return true;
    }

}
