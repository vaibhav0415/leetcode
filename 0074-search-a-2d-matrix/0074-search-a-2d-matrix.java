class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
              int r=matrix.length;//no of row
              int c=matrix[0].length;// no of col
              int low=0;
              int high=(r*c)-1;//m*n-1
              while(low<=high){
                  int mid=low+(high-low)/2;
                  int row=mid/c;
                  int col=mid%c;
                  if(matrix[row][col]==target) return true;
                  else if(matrix[row][col]>target) high=mid-1;
                  else low=mid+1;

              }
              return false;
    }
}