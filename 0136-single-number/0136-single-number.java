class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int val: nums){
            if(mp.containsKey(val)){
                mp.put(val,mp.get(val)+1);
            }else{
                mp.put(val,1);
            }
        }
        for(int key : mp.keySet()){
            if(mp.get(key)==1){
                return key;
            }
        }
        return -1;

    }
}