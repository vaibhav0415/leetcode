class Solution {
public:
    vector<int> deckRevealedIncreasing(vector<int>& deck) {
        int n=deck.size();
        sort(deck.begin(),deck.end());
        queue<int> q;
        vector<int> res(n);
        for(int i=0;i<n;i++){
            q.push(i);
        }
        for(int i=0;i<n;i++){
            int idx=q.front();
            q.pop();
            q.push(q.front());
            q.pop();
            res[idx]=deck[i];
        }
        return res;
    }
};