class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
         int n=arr.length;
         int[] prefix=new int[n];
         prefix[0]=arr[0];
         for(int i=1;i<n;i++){
            prefix[i]=arr[i]^prefix[i-1];
         }
         int m=queries.length;
         int[] ans=new int[m];
         for(int i=0;i<m;i++){
           if(queries[i][0]==0) ans[i]=prefix[queries[i][1]];
           else  ans[i]=prefix[queries[i][1]]^prefix[queries[i][0]-1];
         }
         return ans;
    }
}