class Solution {
public:
  
    int maxSizeSlices(vector<int>& slices) {
        int k=slices.size();
        vector<int> prev1(k+2,0);
        vector<int> curr1(k+2,0);
        vector<int> next1(k+2,0);
        for(int idx=k-2;idx>=0;idx--){
            for(int n=1;n<=k/3;n++){
                prev1[n]=max(slices[idx]+next1[n-1],0+curr1[n]);
            }
            next1=curr1;
            curr1=prev1;
        }
        int case1=curr1[k/3];
        vector<int> prev2(k+2,0);
        vector<int> curr2(k+2,0);
        vector<int> next2(k+2,0);
        for(int idx=k-1;idx>=1;idx--){
            for(int n=1;n<=k/3;n++){
                prev2[n]=max(slices[idx]+next2[n-1],0+curr2[n]);
            }
            next2=curr2;
            curr2=prev2;
        }
        int case2=curr2[k/3];
        return max(case1,case2);

    }
    
};