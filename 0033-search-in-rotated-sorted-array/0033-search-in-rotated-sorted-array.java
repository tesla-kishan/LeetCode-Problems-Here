class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int pivotidx = pivot(nums,n);
        int idx = binarysearch(0,pivotidx-1,nums,target);
        if(idx!=-1) return idx;
        idx = binarysearch(pivotidx,n-1,nums,target);
        return idx;
         
    }
    public int pivot(int nums[],int n){
        int l = 0, r=n-1;
        while(l<r){
            int mid = l+(r-l)/2;
            if(nums[mid]>nums[r]) l=mid+1;
            else r=mid;
        }
        return r;
    }
    public int binarysearch(int l, int r, int nums[], int target){
        int idx=-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]==target){
                idx=mid;
                break;
            }
            else if(nums[mid]<target) l=mid+1;
            else r=mid-1;
        }
        return idx;
    }
}