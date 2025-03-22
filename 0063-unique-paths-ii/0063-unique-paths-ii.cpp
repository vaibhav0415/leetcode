class Solution {
public:
    int n,m;
    vector<vector<long long int>> dp;
   
    int uniquePathsWithObstacles(vector<vector<int>>& grid) {
        
          n=grid.size();
          m=grid[0].size();
          dp.clear();
          dp.resize(105,vector<long long int>(105,0));
          if(grid[n-1][m-1]==1) return 0;//destination is blocked
          dp[n-1][m-1]=1;
          for(int i=n-2;i>=0;i--){
            if(grid[i][m-1]==1) dp[i][m-1]=0;
            else dp[i][m-1]=dp[i+1][m-1];
          }
            for(int i=m-2;i>=0;i--){
            if(grid[n-1][i]==1) dp[n-1][i]=0;
            else dp[n-1][i]=dp[n-1][i+1];
          }
          for(int i=n-2;i>=0;i--){
            for(int j=m-2;j>=0;j--){
                if(grid[i][j]==1) dp[i][j]=0;
                else dp[i][j]=dp[i][j+1]+dp[i+1][j];
            }
          }
          return dp[0][0];
    }
};