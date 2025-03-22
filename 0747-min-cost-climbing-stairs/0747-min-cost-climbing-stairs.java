class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length+1];
         Arrays.fill(dp,-1);
        return Math.min( td(cost,cost.length-1,dp),td(cost,cost.length-2,dp));
    }
     int td(int[] cost,int i,int[] dp){
            if(i<0) return 0;
            if(i==0|| i==1) return cost[i];
           if(dp[i]!=-1) return dp[i];
           return dp[i]=cost[i]+Math.min(td(cost,i-1,dp),td(cost,i-2,dp));
    }
}