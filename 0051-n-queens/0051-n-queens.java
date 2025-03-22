class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
        board[i][j]='.';
        List<List<String>> ans=new ArrayList<>();
       
        nqueen(board,n,0,ans);
        return ans;
        }
        public void nqueen(char[][] board, int tq,int row, List<List<String>> ans ){
            
          
           if ( tq==0) {
           }
            
        if(row== board.length) {
            List<String> l=new ArrayList<>();
            for(int i=0;i<board.length;i++){
                String s="";
                for(int j=0;j<board.length;j++){
                    s+=board[i][j];
                }
                l.add(s);
            }
            ans.add(l);
            
            
            return;
        }

        for (int j = 0; j < board.length; j++) {
            if (ispossible(board, row, j)) {
                board[row][j] = 'Q';
               
                 nqueen(board, tq-1, row + 1, ans);
                board[row][j] = '.';
                
            }
        }
}
    public static boolean ispossible(char[][] board, int row, int col) {
        int r = row;
        int c = col;
        while (r >= 0) {
            if (board[r][col] == 'Q') return false;
            r--;
        }
        r = row;
        c = col;
        while (r >= 0 && c < board[0].length) {
            if (board[r][c] == 'Q') return false;
            r--;
            c++;
        }
        //right  diag
        r = row;
        c = col;
        while (r >= 0 && c >= 0) {
            if (board[r][c] == 'Q') return false;
            r--;
            c--;
        }


        return true;
    }
}