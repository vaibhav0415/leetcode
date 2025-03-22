class Solution {
public:
    typedef long long int ll;
    int numberOfArithmeticSlices(vector<int>& nums) {
        int n=nums.size();
        ll ans=0;
        vector<unordered_map<ll ,ll>> dp(n);// digit->diff
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                ll diff=(ll)nums[i]-(ll)nums[j];
                if(dp[j].find(diff)!=dp[j].end()){
                              //find the element
                              ans+=dp[j][diff];
                }
                dp[i][diff] += dp[j][diff]+1;
            }
        }
        return ans;
    }
};