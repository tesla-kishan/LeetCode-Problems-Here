class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            int remain = target-nums[i];
            if(mp.containsKey(remain)){
                return new int []{i,mp.get(remain)};
            }
            else mp.put(nums[i],i);
        }
        return new int []{};
    }
}