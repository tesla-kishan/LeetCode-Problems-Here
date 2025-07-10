class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean arr[] = new boolean[nums.length];
        fn(nums,ans,temp,arr);
        return ans;
        
    }
    public void fn(int[] nums,List<List<Integer>> ans,List<Integer> temp,boolean arr[]){
        int n = nums.length;
        if(temp.size() == n){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0 ;i<n ; i++){
            if(!arr[i]){
                arr[i] = true;
                temp.add(nums[i]);
                fn(nums,ans,temp,arr);
                temp.remove(temp.size()-1);
                arr[i] = false;
            }
        }


    }
}
