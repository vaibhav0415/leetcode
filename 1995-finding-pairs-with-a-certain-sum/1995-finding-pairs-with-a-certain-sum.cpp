class FindSumPairs {
public:
    unordered_map<int,int> map;
    vector<int>a,b;
    FindSumPairs(vector<int>& nums1, vector<int>& nums2) {
        for(auto x: nums2){
            map[x]++;
        }
        a=nums1;
        b=nums2;
    }
    
    void add(int index, int val) {
        map[b[index]]--;
        b[index]+=val;
        map[b[index]]++;
    }
    
    int count(int tot) {
        int ans=0;
        for(int i=0;i<a.size();i++){
            int x=tot-a[i];
            if(map.find(x)!=map.end()){
                ans+=map[x];
            }
            
        }
        return ans;
    }
};

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs* obj = new FindSumPairs(nums1, nums2);
 * obj->add(index,val);
 * int param_2 = obj->count(tot);
 */