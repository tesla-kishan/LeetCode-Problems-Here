class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> temp = new HashSet<>();
        for(int i=0 ; i<n-2 ; i++){
            int l=i+1, h=n-1;
            while(l<h){
                int sum = nums[l]+nums[h]+nums[i];
                if(sum==0){
                    temp.add(Arrays.asList(nums[i],nums[l],nums[h]));
                    l++;
                    h--;
                }
                else if(sum<0) l++;
                else  h--;
            }
        }
        return new ArrayList<>(temp);
    }
}