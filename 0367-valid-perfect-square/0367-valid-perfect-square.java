class Solution {
    public boolean isPerfectSquare(int num) {
          long start=0;
          long  end=num;
          boolean flag=false;
          while(start<=end){
            long m=start+(end-start)/2;
            
            if((m*m)==num) return true;//perfect square
            else if((m*m)>num) end=m-1;
            else start=m+1;
          }
          return flag;//integer part
    }
}