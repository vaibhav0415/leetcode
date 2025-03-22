class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> ans;
        for(int i=1;i<=numRows;i++){
            vector<int> a(i);
            ans.push_back(a);
        }
        for(int i=0;i<numRows;i++){
            for(int j=0;j<ans[i].size();j++){
                if(i==j || j==0) ans[i][j]=1;
                else ans[i][j]=ans[i-1][j-1]+ans[i-1][j];
            }
    
        }
       return ans;
    }
};