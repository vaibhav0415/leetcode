class Solution {
public:
    vector<vector<int>> grid;
    vector<vector<int>> dp; 
    int minimumTotal(vector<vector<int>>& triangle) {
        dp.clear();
        dp.resize(205,vector<int> (205,-1));
        grid=triangle;
        int row=grid.size();
        for(int i=0;i<grid[row-1].size();i++){
            dp[row-1][i]=grid[row-1][i];
        }
        for(int r=row-2;r>=0;r--){
            for(int c=0;c<grid[r].size();c++){
                dp[r][c]=grid[r][c]+min(dp[r+1][c],dp[r+1][c+1]);
            }
        }
        return dp[0][0];
    }
};