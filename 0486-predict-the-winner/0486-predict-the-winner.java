class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        int dp[][] = new int[n][n];
        for(int row[]: dp) Arrays.fill(row,-1);
        int sum = Arrays.stream(nums).sum();
        int player1 = solve(0,n-1,nums,dp);
        int player2 = sum - player1;
        return player1>=player2;
    }
    public int solve(int i , int j , int nums[],int dp[][]){
        if(i>j) return 0;
        if(i==j) return nums[i];
        if (dp[i][j] != -1) return dp[i][j];
        int take_i = nums[i] + Math.min(solve(i+1,j-1,nums,dp),solve(i+2,j,nums,dp));
        int take_j = nums[j] + Math.min(solve(i+1,j-1,nums,dp),solve(i,j-2,nums,dp));
        return dp[i][j] = Math.max(take_i,take_j) ;
    }
}


//tc 2 power n
// memoisation