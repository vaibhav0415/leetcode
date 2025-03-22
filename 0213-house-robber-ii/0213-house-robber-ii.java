class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int[] dp=new int[nums.length];
         Arrays.fill(dp,-1);
        int a=ftd(nums,dp,0,nums.length-2);
        Arrays.fill(dp,-1);
        int b=ftd(nums,dp,1,nums.length-1);
        return Math.max(a,b);
    }
    int ftd(int[] nums,int[] dp,int i,int j){
        if(i>j) return 0;
        if(dp[i]!=-1) return dp[i];
        return dp[i]=Math.max(nums[i]+ftd(nums,dp,i+2,j),ftd(nums,dp,i+1,j));
    }

}