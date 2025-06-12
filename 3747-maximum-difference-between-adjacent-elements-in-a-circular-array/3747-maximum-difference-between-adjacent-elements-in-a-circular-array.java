class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n = nums.length;
        int first = nums[0];
        int last = nums[n-1];
        int ans = Math.abs(first - last);
        for (int i=1 ; i<n ; i++){
            ans = Math.max(Math.abs(nums[i]-nums[i-1]),ans);
        }
        return ans;
    }
}