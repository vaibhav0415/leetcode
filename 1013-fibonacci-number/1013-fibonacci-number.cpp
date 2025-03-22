class Solution {
public:
    vector<int> dp;
    // int fibo(int n){
    //     if(n==0) return n;
    //     dp[0]=0;
    //     dp[1]=1;
    //     for(int i=2;i<=n;i++){
    //         dp[i]=dp[i-1]+dp[i-2];
    //     }
    //     return dp[n];
    // }
    int fibo(int n){
        if(n<2) return  n;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=fibo(n-1)+fibo(n-2);
    }
    int fib(int n) {
        dp.clear();
        dp.resize(n+1,-1);
          return fibo(n);
    }
};