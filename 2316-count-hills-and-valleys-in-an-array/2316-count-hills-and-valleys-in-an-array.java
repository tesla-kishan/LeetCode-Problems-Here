class Solution {
    public int countHillValley(int[] nums) {
        int i=0,j=1,count=0;
        while(j+1<nums.length){
            if((nums[j]>nums[i] && nums[j]>nums[j+1]) || (nums[j]<nums[i] && nums[j]<nums[j+1] )){
                i=j;
                count++;
            }
            j++;
        }
        return count;
    }
}