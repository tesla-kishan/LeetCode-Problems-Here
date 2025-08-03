class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            int sum=0;
            for(int j=i ; j<n ; j++){
                sum+= nums[j];
                if(maxsum<sum){
                    maxsum=sum;
                }
            }
        }
        return maxsum;
    }
}