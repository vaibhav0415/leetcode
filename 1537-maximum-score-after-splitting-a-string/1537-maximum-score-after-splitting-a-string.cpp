class Solution {
public:
    int maxScore(string s) {
         int n=s.size();
         vector<int> prefix(n);
         vector<int> suffix(n);
         if(s[0]=='0') prefix[0]=1;
         for(int i=1;i<n;i++){
            int c=0;
            if(s[i]=='0') c++;
            prefix[i]=c+prefix[i-1];
        }
        if(s[n-1]=='1') suffix[n-1]=1;
         for(int i=n-2;i>=0;i--){
            int c=0;
            if(s[i]=='1') c++;
            suffix[i]=c+suffix[i+1];
        }
        int maxSum=0;
        for(int i=0;i<n-1;i++){
            int sum=prefix[i]+suffix[i+1];
            maxSum = std::max(maxSum, sum);
        }
       return maxSum;
        }
};