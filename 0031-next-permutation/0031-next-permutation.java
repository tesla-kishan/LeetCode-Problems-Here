class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int golaidx = -1;
        for(int i=n-1 ; i>0 ; i--){
            if(nums[i-1]<nums[i]){
                golaidx = i-1;
                break;
            }
        }
        //swap
        if(golaidx != -1){
            int swapidx = golaidx;
            for(int i=n-1 ; i>=golaidx+1 ; i--){
                if(nums[i]>nums[golaidx]){
                    swapidx = i;
                    break;
                }
            }
            int temp = nums[golaidx];
            nums[golaidx] = nums[swapidx];
            nums[swapidx] = temp;
        }
        //rev
        int a = golaidx+1;
        int b = n-1;
        while(a<b){
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            a++;
            b--;
        }
    }
}