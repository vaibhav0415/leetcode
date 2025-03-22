class Solution {
    public int minFlips(String target) {
         char prev='0';
         int count=0;
         for(int i=0;i<=target.length()-1;i++){
                 if((target.charAt(i))!=prev){ count++;
                 prev=target.charAt(i);
                 }
         }
         return count;

    }
}