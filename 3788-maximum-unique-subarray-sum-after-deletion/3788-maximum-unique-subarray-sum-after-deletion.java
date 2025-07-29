class Solution {
    public int maxSum(int[] nums) {
        int freq [] = new int[201];
        int sum=0 , maxneg=Integer.MIN_VALUE;
        for(int x: nums){
            if(x<=0) maxneg=Math.max(maxneg,x);
            else if(freq[x]==0){
                sum+=x;
                freq[x]=1;
            }
        }
        return sum==0 ? maxneg : sum;
    }
}