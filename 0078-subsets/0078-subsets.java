class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ls=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
          print(nums,0,ans,ls);
          return ls;
    }
    public void print(int[] nums,int idx,ArrayList<Integer> ans, List<List<Integer>>  ls){
        if(idx==nums.length){
            ls.add(new ArrayList(ans));
            return;
        }
        ans.add(nums[idx]);
        print(nums,idx+1,ans,ls);
        ans.remove(ans.size()-1);
        print(nums,idx+1,ans,ls);

    }
}