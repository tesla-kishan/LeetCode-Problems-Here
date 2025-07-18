class Solution {
    public int climbStairs(int n) {
        int dp[] = new int [n+1];
        Arrays.fill(dp,-1);
        return fn(n,dp);
    }
    public int fn(int n , int dp[]){
        if(n<=2) return n;
        if(dp[n] != -1) return dp[n];
        return dp[n] = fn(n-1,dp) + fn(n-2,dp);
    }
}