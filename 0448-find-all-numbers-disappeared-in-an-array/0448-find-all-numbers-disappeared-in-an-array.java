class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int arr[] = new int [nums.length+1];
        for(int i=0 ; i<nums.length ; i++){
            arr[nums[i]] = 1;
        }
        for(int i=1 ; i<arr.length ; i++){
            if(arr[i]==0){
                ans.add(i);
            }
        }
        return ans;
    }
}