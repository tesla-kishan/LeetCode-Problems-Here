class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> mp = new HashMap<>();
        mp.put(0,1);
        int result =0;
        int cumsum =0;
        for(int i=0 ; i<n ; i++){
            cumsum += nums[i];
            if(mp.containsKey(cumsum-k)){
                result += mp.get(cumsum-k);
            }
            if(mp.containsKey(cumsum)){
                mp.put(cumsum,mp.get(cumsum)+1);
            }else{
                mp.put(cumsum,1);
            }
        }
        return result;
    }
}