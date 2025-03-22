class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
           List<List<Integer>> ls=new  ArrayList<>();
           solve(ls,new ArrayList<>(),nums,new boolean[nums.length]);
           return ls;
    }
    public void solve(List<List<Integer>> ls,ArrayList<Integer> ans, int[] nums,boolean[] used){
           if(nums.length==ans.size() && !ls.contains(ans)){
                ls.add(new ArrayList(ans));
                return;
           }
           for(int i=0;i<nums.length;i++){
            if(used[i]) continue;
            used[i]=true;
            ans.add(nums[i]);
            solve(ls,ans,nums,used);
            used[i]=false;
            ans.remove(ans.size()-1);
           }
           
    }
}