class Solution {
    public char findTheDifference(String s, String t) {
        // t elements are randomly shuffled so we need to sort them
        char[] s1= s.toCharArray();
        char[] t1=t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        int i=0,j=0;
        while(i<s1.length && j<t1.length){
             if(s1[i]!=t1[j]) return t1[j];
             i++;
             j++;
        }
        return t1[j];
    }
}