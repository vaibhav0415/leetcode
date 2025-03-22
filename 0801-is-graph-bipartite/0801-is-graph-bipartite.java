class Solution {
    public boolean isBipartite(int[][] graph) {
         int n=graph.length;
          int[] color = new int[n];
        Arrays.fill(color, -1);
         
         for(int i=0;i<n;i++){
            if(color[i]==-1) {
                if(bfs(i,color,graph)==false) return false;
            }
         }
         return true;
        
    }
    boolean bfs(int src,int[] color,int[][]graph){
        Queue<Integer> q = new LinkedList<>();
      
      
        q.add(src);
        color[src] = 0;
        
        while (q.size()>0) {
            int curr = q.poll();
             
             for (int neighbour : graph[curr]) {
                if (color[neighbour] == -1) {
                
                    color[neighbour] =color[curr]==1?0:1;
                    q.add(neighbour);
                } else if (color[curr] == color[neighbour]) {

                    return false;
                }
            }
        }
        return true;
    }
}
