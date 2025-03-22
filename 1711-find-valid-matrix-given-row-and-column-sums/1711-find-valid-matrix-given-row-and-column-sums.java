class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int n=rowSum.length;
          int m=colSum.length;
          int[][] arr=new int[n][m];
          
          for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                 int temp=Math.min(rowSum[i],colSum[j]);
                 rowSum[i]-=temp;
                 colSum[j]-=temp;
                 arr[i][j]=temp;
            }
          }
          return arr;
    
    }
}