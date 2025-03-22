class Solution {
    public boolean closeStrings(String str1, String str2) {
        if(str1.length()!=str2.length()) return false;
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
         
          for(int i=0;i<str1.length();i++){
            map1.put(str1.charAt(i),map1.getOrDefault(str1.charAt(i),0)+1);
        
            map2.put(str2.charAt(i),map2.getOrDefault(str2.charAt(i),0)+1);
        }
        for(char ch:map1.keySet()){
            if(!map2.containsKey(ch)) return false;
        }
         Map<Integer,Integer> h1=new HashMap<>();
          Map<Integer,Integer> h2=new HashMap<>();
          for(int val:map1.values()){
            h1.put(val,h1.getOrDefault(val,0)+1);
          }
           for(int val:map2.values()){
            h2.put(val,h2.getOrDefault(val,0)+1);
          }
          if(h1.equals(h2)) return true;
          else return false;
    }
}