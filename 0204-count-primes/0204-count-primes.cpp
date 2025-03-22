class Solution {
public:
    int countPrimes(int n) {
         bool arr[n+1];
          for(int i = 0; i <= n; i++) {
            arr[i] = false;
        }
         for(int i=2;i*i<n;i++){
            if(arr[i]==false)//by default false means that no is prime
            {
                for(int j=i*i;j<n;j+=i){
                    arr[j]=true;
                }
            }
         }
         int count_prime=0;
         for(int i=2;i<n;i++){
            if(arr[i]==false) count_prime++;
    }
    return count_prime;
    }
};