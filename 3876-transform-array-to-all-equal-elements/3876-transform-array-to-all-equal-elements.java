class Solution {
    public boolean canMakeEqual(int[] nums, int k) {
        return fn(nums.clone(),k,1) || fn(nums.clone(),k,-1);
    }
    private boolean fn(int nums[] , int k , int target){
        int n = nums.length;
        int count =0 ;
        for(int i=0 ; i<n-1 ; i++){
            if(nums[i] != target){
                count++;
                nums[i] = -nums[i];
                nums[i+1] = -nums[i+1];
            }
            if(count>k) return false;
        }
        return nums[n-1]==target;
    }
}