class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        fn(candidates,target,0,ans,temp);
        return ans ;
    }
    public void fn(int[] candidates, int target , int idx , List<List<Integer>> ans ,List<Integer> temp ){
        int n = candidates.length;
        if(idx==n){
            if(target==0){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        if(candidates[idx]<=target){
            temp.add(candidates[idx]);
        fn(candidates,target-candidates[idx],idx,ans,temp);
            temp.remove(temp.size()-1);
        }
        fn(candidates,target,idx+1,ans,temp);
        return;
    }
}