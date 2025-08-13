class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        List<Integer> li = new ArrayList<>();
        int topRow =0, rightCol=c-1, bottomRow=r-1, leftCol=0;
        int totalele =0;
        while(totalele<r*c){
            for(int j=leftCol; j<=rightCol && totalele<r*c ; j++){
                li.add(matrix[topRow][j]);
                totalele++;
            }
            topRow++;
            for(int i=topRow; i<=bottomRow && totalele<r*c ; i++){
                li.add(matrix[i][rightCol]);
                totalele++;
            }
            rightCol--;
            for(int j=rightCol; j>=leftCol && totalele<r*c ; j--){
                li.add(matrix[bottomRow][j]);
                totalele++;
            }
            bottomRow--;
            for(int i=bottomRow; i>=topRow && totalele<r*c ; i--){
                li.add(matrix[i][leftCol]);
                totalele++;
            }
            leftCol++;
        }
        return li;
    }
}