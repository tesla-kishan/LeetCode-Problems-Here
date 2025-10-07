class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0 ; i<n ; i++){
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i],1);
            }else{
                mp.put(nums[i],mp.get(nums[i])+1);
            }
        }
        List<Integer> list = new ArrayList<>(mp.keySet());
        Collections.sort(list, (a, b) -> mp.get(b) - mp.get(a));
        int ans[] = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}