class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        vector<int> ans(nums1.size());
        stack<int> st;
        unordered_map<int,int> map;
        for(int i=nums2.size()-1;i>=0;i--){
            while(st.size()>0 && st.top()<=nums2[i]){
                st.pop();
            }
            if(st.size()==0){
                map[nums2[i]]=-1;
            }
            else{
                map[nums2[i]]=st.top();
            }
            st.push(nums2[i]);
        }
        int j=0;
        for(int i:nums1){
            ans[j]=map[i];
            j++;
        }
        return ans;
    }
};