class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0 ; i<n ; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        int max =0;
        for(int value : map.values()){
            max = Math.max(max,value);
        }
        int ans=0;
        for(int value : map.values()){
            if(max==value){
                ans+=value;
            }
        }
        return ans;
    }
}