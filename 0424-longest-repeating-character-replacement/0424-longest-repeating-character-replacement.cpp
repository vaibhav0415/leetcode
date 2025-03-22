class Solution {
public:
    int characterReplacement(string s, int k) {
         int l=0;
         int r=0;
         int maxlen=0;
         int maxf=0;
         unordered_map<char,int> map;
         while(r<s.size()){
            map[s[r]]++;
            maxf=max(maxf,map[s[r]]);
              if((r-l+1)-maxf>k ){
                    map[s[l]]--;
                    l++;
                }
                 maxlen=max(maxlen,r-l+1);
                 r++;
            }
                 return maxlen; 
         }
     
     
};