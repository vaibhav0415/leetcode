class Solution {
public:
   bool check(vector<int>currBox,vector<int> newBox){
     if(currBox[0]>=newBox[0] && currBox[1]>=newBox[1] && currBox[2]>=newBox[2]) return true;
     return false;
   } 
  //lis
    int solve(int n,vector<vector<int>>& arr){
          vector<int> currRow(n+1,0);
          vector<int> nextRow(n+1,0);
          for(int curr=n-1;curr>=0;curr--){
            for(int prev=curr-1;prev>=-1;prev--){
                 int take=0;
                 if(prev==-1 || check(arr[curr],arr[prev])){
                    take=arr[curr][2]+nextRow[curr+1];
                 }
                 int nottake= 0 + nextRow[prev+1];
                 currRow[prev+1]=max(take,nottake);
            }
            nextRow=currRow;
          }
          return nextRow[0];
    }
    int maxHeight(vector<vector<int>>& cuboids) {
        // sort individual cuboids to get max height for it
          for(auto &cuboid:cuboids){
            sort(cuboid.begin(),cuboid.end());
          }
        // sort the cuboids on the basis of max width or length
          sort(cuboids.begin(),cuboids.end());
          return solve(cuboids.size(),cuboids);
    }
};