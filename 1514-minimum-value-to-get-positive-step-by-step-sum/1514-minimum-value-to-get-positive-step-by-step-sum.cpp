class Solution {
public:
    int minStartValue(vector<int>& nums) {
        int n=nums.size();
        vector<int> v(n);
        v[0]=nums[0];
        int min=0;
        if(min>v[0]) min=v[0];
        for(int i=1;i<n;i++){
            v[i]=nums[i]+v[i-1];
            if(v[i]<min) min=v[i];
        }

        return 1+(-min);
    
    }
};