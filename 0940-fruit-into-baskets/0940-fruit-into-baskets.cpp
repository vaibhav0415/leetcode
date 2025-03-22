class Solution {
public:
    int totalFruit(vector<int>& fruits) {
        int maxlen=0;
        unordered_map<int,int> map;
        int l=0,r=0;
        while(r<fruits.size()){
             map[fruits[r]]++;
             if(map.size()>2){
               
                    map[fruits[l]]--;
                    if(map[fruits[l]]==0) map.erase(fruits[l]);
                    l++;
                
             }
             if(map.size()<=2){
                 maxlen=max(r-l+1,maxlen);
             }
          r++;
        }
        return maxlen;
    }
};