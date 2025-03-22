class Solution {
public:
    double myPow(double x, int n) {
          if(n==0) return 1;
          if(n==INT_MIN) return 1/myPow(x,INT_MAX)/x;
          if(n<0) return  1/myPow(x,-n);
          if(x<0 && n%2==0) return myPow(-x,n) ;// imp (x neg)
          if(x<0 && n%2!=0) return -myPow(-x,n);  // imp (x neg)
          double  ans=myPow(x,n/2);
          if(n%2==0) return ans*ans; // x^n where x is pos and n is pos+even
          else return ans*ans*x;     // x^n where x is pos and n is pos+odd
     }
};