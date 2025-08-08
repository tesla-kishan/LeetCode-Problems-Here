class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int a=0,b=0,c=0;
        for(int i=0 ; i<n ; i++){
            if(nums[i]==0) a++;
            else if(nums[i]==1) b++;
            else c++;
        }
        int index = 0;
        for (int i = 0; i < a; i++) nums[index++] = 0;
        for (int i = 0; i < b; i++) nums[index++] = 1;
        for (int i = 0; i < c; i++) nums[index++] = 2;
    }
}