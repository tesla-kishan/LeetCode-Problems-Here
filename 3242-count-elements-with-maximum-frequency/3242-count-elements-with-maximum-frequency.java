class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n = nums.length;
        int arr[] = new int [101];
        for(int i=0 ; i<n ; i++){
            arr[nums[i]]++;
        }
        int max=0;
        for(int num : arr){
            max=Math.max(num,max);
        }
        int ans=0;
        for(int num : arr){
            if(num==max){
                ans+=max;
            }
        }
        return ans;
    }
}