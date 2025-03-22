class Solution {
    public int arrangeCoins(int n) {
       //k*(k+1)<=2n here  k is no of rows and n is no of coins
       //k**2+k-2n==0
       // assume 2n=t;
       //k**2+k-t=0;
       // to find root of qudratic eq we will use dharacharya method;
       long t=(long)(2*(long)n);
       long d=4*t+1;
       int k=(int )(-1 + Math.sqrt(d))/2;
       return k;
    }
}