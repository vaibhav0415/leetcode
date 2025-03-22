class Solution {
    public List<List<Integer>> permute(int[] nums) {
           List<List<Integer>> ls=new  ArrayList<>();
           solve(ls,new ArrayList<>(),nums);
           return ls;
    }
    public void solve(List<List<Integer>> ls,ArrayList<Integer> ans, int[] nums){
           if(nums.length==ans.size()){
                ls.add(new ArrayList(ans));
                return;
           }
           for(int i:nums){
            if(ans.contains(i)) continue;
            ans.add(i);
            solve(ls,ans,nums);
            ans.remove(ans.size()-1);
           }
           
    }
}