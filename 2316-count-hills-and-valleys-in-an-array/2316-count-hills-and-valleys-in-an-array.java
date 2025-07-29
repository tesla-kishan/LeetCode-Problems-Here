class Solution {
    public int countHillValley(int[] nums) {
        List<Integer> fresh = new ArrayList<>();
        fresh.add(nums[0]);
        for(int i=1 ; i<nums.length ; i++){
            if(nums[i] != nums[i-1]) fresh.add(nums[i]);
        }
        int count=0;
        for(int i=1 ; i<fresh.size()-1 ; i++){
            if(fresh.get(i)>fresh.get(i-1) && fresh.get(i)>fresh.get(i+1)) count++;
            else if(fresh.get(i)<fresh.get(i-1) && fresh.get(i)<fresh.get(i+1)) count++;
        }
        return count;
    }
}