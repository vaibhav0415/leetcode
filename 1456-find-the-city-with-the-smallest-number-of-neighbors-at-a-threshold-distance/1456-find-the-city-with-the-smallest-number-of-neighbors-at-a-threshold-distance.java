class Solution {
    public int findTheCity(int n, int[][] edges, int threshold) {
          int[][] dist=new int[n][n];
          for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dist[i][j]=Integer.MAX_VALUE;
            }
          }
        //   for(int i=0;i<edges.length;i++){
        //     int u=edges[i][0];
        //     int v=edges[i][1];
        //     int w=edges[i][2];
        //     dist[u][v]=w;
        //     dist[v][u]=w;
        //   }
        for(int[] arr:edges){
            int u=arr[0];
            int v=arr[1];
            int w=arr[2];
            dist[u][v]=w;
            dist[v][u]=w;
        }
        //flyood warshall
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                if(i==k) continue;
            for(int j=0;j<n;j++){
                if(j==k) continue; 
                if(dist[i][k]!=Integer.MAX_VALUE && dist[k][j]!=Integer.MAX_VALUE)
                dist[i][j]=Math.min(dist[i][j],dist[i][k]+dist[k][j]);
            }
          }
        }
        int mincount=Integer.MAX_VALUE;
        int mincity=-1;
        for(int i=0;i<n;i++){
            int count=0;
           
            for(int j=0;j<n;j++){
                if(i==j) continue;
                if(dist[i][j]<=threshold) count++;
            }
            if(count<=mincount){
                mincount=count;
                mincity=i;
            }
          }
          return mincity;

    }
}