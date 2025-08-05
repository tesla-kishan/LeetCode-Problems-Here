class Solution {
    public int majorityElement(int[] nums) {
        int me=0,count=0;
        for(int i=0 ; i<nums.length ; i++){
            if(count==0){
                me=nums[i];
                count++;
            }
            else if(nums[i]==me) count++;
            else count--;
        }
        return me;
    }
}