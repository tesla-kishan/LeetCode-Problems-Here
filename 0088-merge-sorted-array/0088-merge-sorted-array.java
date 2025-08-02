class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m;
        int j=n-1;
        while(j>=0){
            nums1[i]=nums2[j];
            i++;
            j--;
        }
        Arrays.sort(nums1);
    }
}