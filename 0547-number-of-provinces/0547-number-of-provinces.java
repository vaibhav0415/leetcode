class Solution {
    void bfs(int[][] isConnected,int i,boolean[] marked,int n){
         marked[i]=true;
        Queue<Integer> q=new ArrayDeque<>();
        q.add(i);
        while(q.size()>0){
            int curr=q.remove();
            for(int j=0;j<n;j++){
                if(isConnected[curr][j]==1 && !marked[j]){
                    q.add(j);
                    marked[j]=true;
                }
            }
        }
         }
    
    public int findCircleNum(int[][] isConnected) {
         int n=isConnected.length;
         boolean[] marked=new boolean[n];
         int ans=0;
         for(int i=0;i<n;i++){
            if(!marked[i]){
                bfs(isConnected,i,marked,n);
                ans++;
            }
         }
         return ans;
    }
}