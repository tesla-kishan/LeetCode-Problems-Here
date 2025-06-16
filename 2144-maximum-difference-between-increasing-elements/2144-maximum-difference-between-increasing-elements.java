class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int min = nums[0];
        int maxdiff = -1;
        for(int i=1 ; i<n ; i++){
            if(min<nums[i]){
                maxdiff = Math.max(maxdiff,nums[i]-min);
            }else{
                min = nums[i];
            }
        }
        return maxdiff;
    }
}