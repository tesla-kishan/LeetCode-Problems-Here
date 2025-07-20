class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums,ans,0);
        return ans;
    }
    public void swap(int i, int j ,int nums[]){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void helper(int[] nums,List<List<Integer>> ans,int idx){
        int n = nums.length;
        if(idx==n-1){
            List<Integer> temp = new ArrayList<>();
            for(int x:nums){
                temp.add(x);
            }
            ans.add(temp);
            return;
        }
        for(int i=idx ; i<n ; i++){
            swap(i,idx,nums);
            helper(nums,ans,idx+1);
            swap(i,idx,nums);

        }
    }
}