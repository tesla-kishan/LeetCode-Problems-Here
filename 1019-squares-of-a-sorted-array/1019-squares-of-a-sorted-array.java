class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0 ;i<nums.length ;i++){
            nums[i]=nums[i]*nums[i];
        }
        int low=0,high=nums.length-1;
        int arr[] = new int [nums.length];
        int idx=nums.length-1;
        while(low<=high){
            if(nums[low]>nums[high]){
                arr[idx]=nums[low];
                idx--;
                low++;
            }
            else{
                arr[idx]=nums[high];
                idx--;
                high--;
            }
        }
        return arr;
    }
}