class Solution {
public:
    bool isIsomorphic(string s, string t) {
          if(s.length()!=t.length()) return false;
          vector<int> v(150,1000);
          for(int i=0;i<s.length();i++){
                        int ind=(int)s[i];
                        if(v[ind]==1000) v[ind]=s[i]-t[i];
                        else if(v[ind] !=(s[i]-t[i])) return false;
          }
          //emptying vector
          for(int i=0;i<150;i++){
            v[i]=1000;
          }
          //by t perspective
           for(int i=0;i<s.length();i++){
                        int ind=(int)t[i];
                        if(v[ind]==1000) v[ind]=t[i]-s[i];
                        else if(v[ind] !=(t[i]-s[i])) return false;
          }
          return true;
    }
};