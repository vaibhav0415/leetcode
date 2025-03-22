class Solution {
    ArrayList<int[]> ar=new ArrayList<>();
    int find(int[] parent,int x){
        return parent[x]=parent[x]==x?x:find(parent,parent[x]);
    }
    void union(int[] parent,int[] rank,int a,int b){
        int x=find(parent,a);
        int y=find(parent,b);
        if(x==y) {
            ar.add(new int[]{a,b});
            return;
            }
        
        if(rank[x]>=rank[y]){
            rank[x]++;
            parent[y]=x;
        }
        else{
            rank[y]++;
            parent[x]=y;
        }
    }
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        int[] parent=new int[n+1];
        int[] rank=new int[n+1];
        for(int i=0;i<=n;i++){
            parent[i]=i;
            rank[i]=0;
        }
        for(int i=0;i<edges.length;i++){
            int a=edges[i][0];
            int b=edges[i][1];
           
            union(parent,rank,a,b);
        }
        
        return ar.get(ar.size()-1);
        
       
    }
}