class Solution {
    public int differenceOfSums(int n, int m) {
        int totalsum = n*(n+1)/2;
        int k = n/m;
        //divisible
        int num1 = m*k*(k+1)/2;
        //not divisible
        int num2 = totalsum - num1;
        return num2-num1;
    }
}