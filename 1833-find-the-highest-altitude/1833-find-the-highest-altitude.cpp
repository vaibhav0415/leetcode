class Solution {
public:
    int largestAltitude(vector<int>& gain) {
         int n=gain.size();
         vector<int> v(n);//v is prefix array
         v[0]=gain[0];
         int max=0;
         if(v[0]>max) max=v[0];
         for(int i=1;i<n;i++){
            v[i]=v[i-1]+gain[i];
            if(v[i]>max) max=v[i];
            
         }
         return max;

    }
};