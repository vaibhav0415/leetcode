class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String,ArrayList<String>> map=new HashMap<>();
         for(String str:strs){
            String key=find(str);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(str);
         }  
         return new ArrayList<>(map.values());
    }
    public String find(String key){
        int[] arr=new int[26];
        for(int i=0;i<key.length();i++){
            arr[key.charAt(i)-'a']+=1;
        }
        StringBuilder ans=new StringBuilder();
        for(int a:arr){
            ans.append(a).append("#");
        }
        return ans.toString();
    }
}