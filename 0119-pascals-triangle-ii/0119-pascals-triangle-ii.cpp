class Solution {
public:
    vector<int> getRow(int rowIndex) {
         vector<vector<int>> ans;
        for(int i=1;i<=rowIndex+1;i++){
            vector<int> a(i);
            ans.push_back(a);
        }
        for(int i=0;i<=rowIndex;i++){
            for(int j=0;j<ans[i].size();j++){
                if(i==j || j==0) ans[i][j]=1;
                else ans[i][j]=ans[i-1][j-1]+ans[i-1][j];
            }
    
        }
       return ans[rowIndex];
    }
};