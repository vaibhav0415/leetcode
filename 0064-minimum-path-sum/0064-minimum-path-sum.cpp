class Solution {
public:
    int m,n;
    vector<vector<int>> arr,dp;
    int f(int i,int j){
        if(i==m-1 and j==n-1) return arr[i][j];
        if(i>=m or j>=n or i<0 or j<0) return INT_MAX;
        if(dp[i][j]!=-1) return dp[i][j];
        return dp[i][j]=arr[i][j]+min(f(i,j+1),f(i+1,j)); 
    }
    int minPathSum(vector<vector<int>>& grid) {
         arr=grid;
         m=grid.size();
         n=grid[0].size();
         dp.clear();
         dp.resize(205,vector<int>(205,-1));
         return f(0,0);
         
    }
};