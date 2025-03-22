class Solution {
public:
    void gameOfLife(vector<vector<int>>& board) {
        int n=board.size();
        int m=board[0].size();
        vector<int> temp(m*n,0);
        int k=0;
        for(int row=0;row<board.size();row++){
              for(int col=0;col<board[0].size();col++){
                   int live=0;
                   if(row-1>=0 && board[row-1][col]==1) live++;
                    if(col-1>=0 && board[row][col-1]==1) live++;
                     if(row+1<n && board[row+1][col]==1) live++;
                      if(col+1<m && board[row][col+1]==1) live++;
                      if(row-1>=0 && col-1>=0 && board[row-1][col-1]==1) live++;
                      if(row-1>=0 && col+1<m && board[row-1][col+1]==1) live++;
                      if(row+1<n && col-1>=0 && board[row+1][col-1]==1) live++;
                      if(row+1<n && col+1<m && board[row+1][col+1]==1) live++;



                      if(board[row][col]==1 &&(live==2 || live==3)) temp[k]=1;
                      if(board[row][col]==0 && live==3) temp[k]=1;
                      k++;
                }
            }
            k=0;
            for(int row=0;row<board.size();row++){
              for(int col=0;col<board[0].size();col++){
                     board[row][col]=temp[k];
                      k++;
                }
            }
           
            
    }
};