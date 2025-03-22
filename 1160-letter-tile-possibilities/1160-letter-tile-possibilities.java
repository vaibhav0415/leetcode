class Solution {
    public int numTilePossibilities(String tiles) {
     List<String> a=new ArrayList<>();
        help(a,tiles,"");
        System.out.println(a);
        return a.size();
    }
    public void help(List<String> a,String s,String ans){
        if(ans.length()>0){
            if(a.contains(ans))
                return;
            a.add(ans);
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String s1=s.substring(0,i);
            String s2=s.substring(i+1);
            help(a,s1.concat(s2),ans+ch);
        }
    }
}