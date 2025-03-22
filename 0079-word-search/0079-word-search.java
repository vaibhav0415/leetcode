class Solution {
    public boolean exist(char[][] board, String word) {
       
         for(int i=0;i<board.length;i++){
            for (int j=0;j<board[0].length;j++){
                char ch=word.charAt(0);
                if(board[i][j]== ch){
                      boolean b=solve(board,i,j,0,word);
                     if(b) return true;
                }
            }  
            
        }
         return false;
    }
        public static  boolean solve(char[][] board,int row,int col,int ix,String word){
        if(ix==word.length()) return true;
        if(row<0 || col<0 || row>=board.length || col>=board[0].length || board[row][col]!=word.charAt(ix))
            return false;
        int[] r={1,0,0,-1};
        int[] c={0,1,-1,0};
        boolean flag=false;
        for(int i=0;i<c.length;i++){
            char ch=board[row][col];
            board[row][col]='*';
            flag= solve(board, row+r[i], col+c[i], ix+1,word);
            if(flag) return flag;
            board[row][col]=ch;
        }
        return flag;
        
     }
}