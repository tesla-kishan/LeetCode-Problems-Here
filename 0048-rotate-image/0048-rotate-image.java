class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0 ;i<n ; i++){
            for(int j=i ; j<n ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0 ; i<n ; i++){
            reverse(matrix[i]);
        }
    }
    public void reverse(int row[]){
        int l=0, h=row.length-1;
        while(l<h){
            int temp=row[l];
            row[l]=row[h];
            row[h]=temp;
            l++;
            h--;
        }
    }
}