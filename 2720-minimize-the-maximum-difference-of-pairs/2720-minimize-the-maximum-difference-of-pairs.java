class Solution {
    public int minimizeMax(int[] nums, int p) {
        int n = nums.length;
        Arrays.sort(nums);
        int low = 0;
        int high = nums[n-1]-nums[0];
        int ans=0;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(isvalid(nums,p,mid)){
                ans = mid;
                high= mid-1;
            }else low= mid+1;
        }
        return ans;
    }
    boolean isvalid(int nums[] , int p , int mid){
        int n = nums.length;
        int countpairs = 0;
        int i=0;
        while(i<n-1){
            int ans = nums[i+1] - nums[i];
            if(ans<=mid){
                countpairs++;
                i = i+2;
            }else{
                i++;
            }
        }
        if(countpairs>=p) return true;
        else return false;
    }
}