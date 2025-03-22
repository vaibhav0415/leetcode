class Solution {
public:
    bool isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='o' || ch=='u' || ch=='i') return true;
        return false;
    }
    int maxVowels(string s, int k) {
          //pehli sbustring me kitne vowel hai pata karte hai 
          int n=s.size();
          int maxCount=0;
          for(int i=0;i<k;i++){
            if(isVowel(s[i])) maxCount++;
          }
          int count=maxCount;
          int i=0;
          int j=k-1;
            
          while(j<n){
               if(isVowel(s[i])) count--;
               i++;
               j++;
               if(isVowel(s[j])) count++;
               maxCount=max(count,maxCount);
               
          }
          return maxCount;
    }
};