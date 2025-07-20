class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean arr[] = new boolean[nums.length];
        helper(nums,ans,temp,arr);
        return ans;
    }
    public void helper(int[] nums,List<List<Integer>> ans,List<Integer> temp,boolean arr[]){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
        }
        for(int i=0 ;i<nums.length ; i++){
            if(!arr[i]){
                arr[i]=true;
                temp.add(nums[i]);
                helper(nums,ans,temp,arr);
                temp.remove(temp.size()-1);
                arr[i]=false;
            }
        }
    }
}