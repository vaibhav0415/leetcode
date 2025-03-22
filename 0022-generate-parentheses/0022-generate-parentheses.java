class Solution {
    public List<String> generateParenthesis(int n) {
         List<String> list=new ArrayList<>();
        print(n,0,0,"",list);
         return list;
    }

    public static void print(int n,int open,int close,String ans,List<String> list) {
        if(close==n && open==n) {
            list.add(ans);
            return;}
        if(open<n){
            print(n,open+1,close,ans+"(",list);
        }
        if(close<open){
            print(n,open,close+1,ans+")",list);
        }
        
            
        
        
        
    }






    
}