class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i=1 ; i<n ; i++){
            for(int j=1 ; j<n ; j++){
                if(i+j==n){
                    if (!String.valueOf(j).contains("0")) {
                        if (!String.valueOf(i).contains("0")) {
                            return new int[]{i,j};
                        }
                    }
                }
            }
        }
        return new int []{};
    }
}