class Solution {
public:
    int lengthOfLongestSubstring(string s) {
         int maxlen=0;
         unordered_map<char,int> map;
         int i=0;
         int j=0;
         while(j<s.length()){
            map[s[j]]++;
                while(map[s[j]]>1) {
                    map[s[i]]--;
                    i++;
                }
            int len=j-i+1;
            maxlen=max(len,maxlen);
            j++;
            
         }
         return maxlen;
    }
};