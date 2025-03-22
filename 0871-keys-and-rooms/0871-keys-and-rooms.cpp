class Solution {
public:
    bool canVisitAllRooms(vector<vector<int>>& rooms) {
        unordered_set<int> visited;
        queue<int> q;
        q.push(0);
        visited.insert(0);
        while(!q.empty()){
            int curr=q.front();
            q.pop();
            
            for(int neighbors:rooms[curr]){
                if(visited.count(neighbors)==0){
                     visited.insert(neighbors);
                     q.push(neighbors);
                }
            }
        }
        return visited.size()==rooms.size();
    }
};