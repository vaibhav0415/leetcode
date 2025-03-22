class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num%2!=0) return false;
        else{
        int sum=0;
        for(int i=1;i<=num/2;i++){
              if(num%i==0){
                  sum=sum+i;
                 
              } else continue;
        }
         return sum==num;}
      
    }
}