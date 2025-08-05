class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> mp = new LinkedHashMap<>();
        for(int num: nums){
            mp.put(num,1);
        }
        int idx=0;
        for(int key:mp.keySet()){
            nums[idx++]=key;
        }
        return mp.size();
    }
}