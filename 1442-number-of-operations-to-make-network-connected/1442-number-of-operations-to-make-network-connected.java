class Solution {
    int extras=0;
    int find(int[] parent,int x){
        return parent[x]=(parent[x]==x)? x:find(parent,parent[x]);
    }
    void union(int[] parent,int[] rank,int a,int b){
        a=find(parent,a);
        b=find(parent,b);
        if(a==b) {
            extras++;
            return;
            }

        if(rank[a]>=rank[b]){
            rank[a]++;
            parent[b]=a;
        }
        else{
            rank[b]++;
            parent[a]=b;
        }
    }
    public int makeConnected(int n, int[][] connections) {
        int[] parent=new int[n];
        int[] rank=new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        for(int [] edge:connections){
            int a=edge[0];
            int b=edge[1];
            union(parent,rank,a,b);
        }
        int nC=0;
        for(int i=0;i<n;i++){
            if(parent[i]==i) nC++;
        }
        int req=nC-1;
         if(extras>=req) return req;
         else return -1;

    }
}