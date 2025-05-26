class Solution {
    public long minCuttingCost(int n, int m, int k) {
        if(n<=k && m<=k) return 0;
        else if(n>k && m<=k){
            return (long)(n-k )* k;
        }
        else if(m>k && n<=k){
            return (long)(m-k) *k;
        }
        return Math.min((long)(n-k) * k , (long)(m-k) * k);
    }
}