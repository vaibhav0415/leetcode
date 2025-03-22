class Solution {
public:
    int ladderLength(string beginWord, string endWord, vector<string>& wordList) {
          queue<pair<string,int>> q;
          q.push({beginWord,1});
          unordered_set<string> set(wordList.begin(),wordList.end());
          set.erase(beginWord);
          while(q.size()>0){
            string word=q.front().first;
            int steps=q.front().second;
            q.pop();
            if(word==endWord) return steps;
            for(int i=0;i<word.length();i++){
                  char original=word[i];
                  for(char ch='a';ch<='z';ch++){
                       word[i]=ch;
                       //if exist
                       if(set.find(word)!=set.end()){
                          set.erase(word);
                          q.push({word,steps+1});
                       }                  
                    }
                    word[i]=original;
            }
          }
          // array.length(n)*word.length()*26*logn(if ordered set)
          return 0;
    }
};