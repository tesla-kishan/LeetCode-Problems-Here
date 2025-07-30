class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            int remaining = target-nums[i];
            if(mp.containsKey(remaining)) return new int[]{i,mp.get(remaining)};
            else mp.put(nums[i],i);
        }
        return new int []{};
    }
}