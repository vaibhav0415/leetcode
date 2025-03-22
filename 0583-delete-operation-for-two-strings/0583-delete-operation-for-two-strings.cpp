class Solution {
public: 
    vector<vector<int>> dp;
    int lcs(string &a, string &b,int i,int j){
         if(i<0 || j<0) return 0;
         if(dp[i][j]!=-1) return dp[i][j];
         if(a[i]==b[j]) return dp[i][j]=1+lcs(a,b,i-1,j-1);
         else return dp[i][j]=max(lcs(a,b,i-1,j),lcs(a,b,i,j-1));
    }
    int minDistance(string a, string b) {
        int m=a.size(),n=b.size();
        dp.resize(m,vector<int>(n,-1));
        int ans=lcs(a,b,m-1,n-1);
        return a.size()-ans+b.size()-ans;
    }
};