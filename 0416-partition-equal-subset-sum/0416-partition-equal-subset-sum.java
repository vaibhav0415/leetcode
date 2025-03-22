class Solution {
    public boolean subsetSum(int[] arr,int sum){
        int n=arr.length;
        boolean[][] dp=new boolean[n+1][sum+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(j==0) dp[i][j]=true; 
            }
        }
         for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
               if(arr[i-1]<=j) dp[i][j]=dp[i-1][j] || dp[i-1][j-arr[i-1]];
               else dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][sum];

    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        if(sum%2!=0){
            return false;
        }
        else{
            return subsetSum(nums,sum/2);
        }
      
    }
}