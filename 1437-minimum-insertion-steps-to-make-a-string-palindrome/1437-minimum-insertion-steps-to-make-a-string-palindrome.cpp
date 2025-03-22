class Solution {
public:
    int lcs(string a, string b) {
        int m=a.size(),n=b.size();
        vector<vector<int>> dp;
        dp.resize(m+1,vector<int>(n+1,0));
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(a[i-1]==b[j-1]) dp[i][j]=1+dp[i-1][j-1];
                else dp[i][j]=max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[m][n];
    }
    int lps(string a) {
        string b=a;// deep copy of a;
        reverse(b.begin(),b.end());
        int n=a.size();
         return lcs(a,b);
    }
    int minInsertions(string s) {
        int a=lps(s);
        return s.size()-a;
    }
};