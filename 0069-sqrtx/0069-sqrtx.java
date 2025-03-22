class Solution {
    public int mySqrt(int x) {
          long start=0;
          long  end=x;
          while(start<=end){
            long m=start+(end-start)/2;
            
            if((m*m)==x) return (int)m;//perfect square
            else if((m*m)>x) end=m-1;
            else start=m+1;
          }
          return (int)end;//integer part
    }
}