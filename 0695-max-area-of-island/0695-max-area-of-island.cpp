class Solution {
public:
    int maxAreaOfIsland(vector<vector<int>>& grid) {
        int rows=grid.size();
          int cols=grid[0].size();
          int maxi=0;
          for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                 if(grid[r][c]==0){
                    continue;
                 }
                 grid[r][c]=0;//mark it visited
                 queue<pair<int,int>> qu;
                 qu.push({r,c});//store the source code
                 int ans=0;
                 while(not qu.empty()){
                    auto curr=qu.front();//get one node from the queue
                    qu.pop();
                    //go to all unvisited neighbour of current node
                    int currRow=curr.first;
                    int currCol=curr.second;
                    ans++;
                    //check up
                    if(currRow-1>=0 and grid[currRow-1][currCol]==1){
                        qu.push({currRow-1,currCol});
                        grid[currRow-1][currCol]=0;
                    }
                    //check down
                    if(currRow+1<rows and grid[currRow+1][currCol]==1){
                        qu.push({currRow+1,currCol});
                        grid[currRow+1][currCol]=0;
                    }
                    //check left
                    if(currCol-1>=0 and grid[currRow][currCol-1]==1){
                        qu.push({currRow,currCol-1});
                         grid[currRow][currCol-1]=0;
                    }
                     //check right
                    if(currCol+1<cols and grid[currRow][currCol+1]==1){
                        qu.push({currRow,currCol+1});
                         grid[currRow][currCol+1]=0;
                    }

                 }

                maxi=max(ans,maxi);
            }
          }
          return maxi;
    }
};