class Solution {
    public int partitionArray(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int start=nums[0];
        int count=1;
        for(int i=1 ; i<n ; i++){
            if(nums[i]-start >k){
                count++;
                start = nums[i];
            }
        }
        return count;
    }
}