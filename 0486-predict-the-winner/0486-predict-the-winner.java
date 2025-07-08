class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        int sum = Arrays.stream(nums).sum();
        int player1 = solve(0,n-1,nums);
        int player2 = sum - player1;
        return player1>=player2;
    }
    public int solve(int i , int j , int nums[]){
        if(i>j) return 0;
        if(i==j) return nums[i];
        int take_i = nums[i] + Math.min(solve(i+1,j-1,nums),solve(i+2,j,nums));
        int take_j = nums[j] + Math.min(solve(i+1,j-1,nums),solve(i,j-2,nums));
        return Math.max(take_i,take_j) ;
    }
}