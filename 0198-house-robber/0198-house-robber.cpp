class Solution {
public:
    vector<int> dp;
    int f(vector<int> arr,int i){
        if(i==arr.size()-1) return arr[i];//single house
        if(i==arr.size()-2) return max(arr[i],arr[i+1]);//two house
        return max(arr[i]+f(arr,i+2),0+f(arr,i+1));
    }
    int ftd(vector<int> arr,int i){
        if(i==arr.size()-1) return arr[i];//single house
        if(i==arr.size()-2) return max(arr[i],arr[i+1]);//two house
        if(dp[i]!=-1) return dp[i];// ith state already computed
        //if dp was -1 ith state not computed
        return dp[i]=max(arr[i]+ftd(arr,i+2),0+ftd(arr,i+1));   
    }
    int fbu(vector<int> &arr){
        int n=arr.size();
        dp.resize(n);
        if(n==1) return arr[0];
        dp[n-1]=arr[n-1];
        dp[n-2]=max(arr[n-2],arr[n-1]);
        for(int i=n-3;i>=0;i--){
            dp[i]=max(dp[i+2]+arr[i],0+dp[i+1]);
        }
        return dp[0];
    }

    int rob(vector<int>& nums) {
        // dp.clear();
        // dp.resize(105,-1);
        //  return ftd(nums,0);
        return fbu(nums);
    }
};