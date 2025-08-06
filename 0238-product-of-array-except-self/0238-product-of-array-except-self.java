class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int res1[] = new int[n];
        res1[0] = 1;
        for(int i =1 ; i<n ; i ++){
            res1[i]= nums[i-1]*res1[i-1];
        }
        int sum=1;
        for(int i=n-1 ; i>=0 ; i--){
            res1[i] *= sum;
            sum *= nums[i]; 
        }
        return res1;
    }
}