class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
         List<Integer> list=new ArrayList<Integer>();
         print(0,candidates,target,list,ans);
         return ans;
         }
    public static void print(int idx,int[] arr,int target ,List<Integer> list,List<List<Integer>> ans){
        if(idx==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(arr[idx]<=target){
            list.add(arr[idx]);
            print( idx, arr, target-arr[idx] ,list,ans);
            list.remove(list.size()-1);

        }
          print( idx+1, arr, target ,list,ans);
        
    }
}