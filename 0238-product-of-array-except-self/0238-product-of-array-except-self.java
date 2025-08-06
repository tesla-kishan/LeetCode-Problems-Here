class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int res1[] = new int[n];
        int res2[] = new int [n];
        res1[0] = 1;
        int j=0;
        for(int i =1 ; i<n ; i ++){
            res1[i]= nums[i-1]*res1[i-1];
        }
        res2[n-1] = 1;
        for(int i=n-2 ; i>=0 ; i--){
            res2[i] = res2[i+1]*nums[i+1]; 
        }
        for(int i=0 ; i<n ;i++){
            nums[i] = res1[i]*res2[i];
        }
        return nums;
    }
}