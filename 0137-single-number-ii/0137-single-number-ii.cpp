class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int ans=0;
        
        for(int i=0;i<32;i++){
             int cnt=0;
            for(auto ele:nums){
                if(((ele>>i)&1)==1) cnt++;
            }
             if(cnt%3!=0){
            ans=ans|(1<<i);
        }
        }
       
        return ans;
    }
};