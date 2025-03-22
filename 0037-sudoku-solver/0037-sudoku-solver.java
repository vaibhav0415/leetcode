class Solution {
    public void solveSudoku(char[][] board) {
        char[][] grid=new char[9][9]; 
        solve(board,0,0,grid);
         for(int i=0;i<9;i++){
                        for(int j=0;j<9;j++){
                            board[i][j]=grid[i][j];
                        }
                    }
    }
    public static void solve(char[][] grid,int row,int col,char[][] board){
        if (col==9){//to go in the next row
            row+=1;
            col=0;
        }
                if(row==9){
                     for(int i=0;i<9;i++){
                        for(int j=0;j<9;j++){
                            board[i][j]=grid[i][j];
                        }
                    }
                   
            // display(grid);
            return;
        }

        if (grid[row][col]!='.'){//go to next no if presently filled
            solve(grid, row, col+1,board);
        }else {
            for (char i='1';i<='9';i++){
                if (check(grid,row,col,i)){
                    grid[row][col]=i;
                    solve(grid, row, col+1,board);
                    grid[row][col]='.';
                }
            }
        }

    }
    public static boolean check(char grid[][],int row,int col,int val){
        int r=row;
        int c=col;
        //for row
        for (int i=0;i<grid.length;i++){
            if (grid[i][c]==val){
                return false;
            }
        }
        for (int i=0;i<grid[0].length;i++){
            if (grid[r][i]==val){
                return false;
            }
        }
        //for 3x3 matrix
        r=row-row%3;
        c=col-col%3;
        for (int i=r;i< r+3;i++){
            for (int j=c;j<c+3;j++){
                if (grid[i][j]==val){
                     return false;
                }
            }
        }

        return  true;
    }
    // public static void display(char[][] grid) {
    //     List<List<Character>> result = new ArrayList<>();

    //     for (int i = 0; i < grid.length; i++) {
    //         List<Character> rowList = new ArrayList<>();
    //         for (int j = 0; j < grid[0].length; j++) {
    //             rowList.add(grid[i][j]);
    //         }
            
        
    //           for (List<Character> row : result) {
    //         System.out.println(row);
    //     }
    //     System.out.println();
    // }
    
    // }
}