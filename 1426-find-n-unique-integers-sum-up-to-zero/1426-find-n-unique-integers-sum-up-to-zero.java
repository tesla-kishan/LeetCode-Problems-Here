class Solution {
    public int[] sumZero(int n) {
        int arr[] = new int[n];
        int i=0,j=n-1;
        int start =1;
        while(i<j){
            arr[i] = start;
            arr[j] = -start;
            start++;
            i++;
            j--;
        }
        if(i==j) arr[i]=0;
        return arr;
    }
}