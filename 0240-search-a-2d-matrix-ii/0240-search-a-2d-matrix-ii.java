class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int row[]: matrix){
            if(fn(row,target)) return true;
        }
        return false;
    }
    public boolean fn(int row[],int target){
        int low =0, high=row.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(row[mid]==target) return true;
            else if (row[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return false;
    }
}