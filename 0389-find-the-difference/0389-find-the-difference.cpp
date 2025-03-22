class Solution {
public:
    char findTheDifference(string s, string t) {
        // t elements are randomly shuffled so we need to sort them
        sort(s.begin(), s.end());
        sort(t.begin(), t.end());
        int i=0,j=0;
        while(i<s.length() && j<t.length()){
             if(s[i]!=t[j]) return t[j];
             i++;
             j++;
        }
        return t[j];
    }
};