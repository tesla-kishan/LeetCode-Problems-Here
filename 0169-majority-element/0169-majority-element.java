class Solution {
    public int majorityElement(int[] nums) {
        int n =nums.length;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0 ;i<n ; i++){
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i],1);
            }else{
                mp.put(nums[i],mp.get(nums[i])+1);
            }
        }
        for(int key : mp.keySet()){
            if(mp.get(key)>n/2) return key;
        }
        return -1;
    }
    
}