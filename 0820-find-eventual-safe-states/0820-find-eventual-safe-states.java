class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<List<Integer>> revadj=new ArrayList<>();
        int n=graph.length;
        for(int i=0;i<n;i++){
            revadj.add(new ArrayList<>());
        }
        int[] indegree=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<graph[i].length;j++){
                revadj.get(graph[i][j]).add(i);
                indegree[i]++;
            }
        }
        Queue<Integer> q=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0) q.add(i);
        }
        List<Integer> ans=new ArrayList<>();
        while(q.size()>0){
            int curr=q.poll();
            ans.add(curr);
            for(int neigh:revadj.get(curr)){
                indegree[neigh]--;
                if(indegree[neigh]==0) q.add(neigh);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}