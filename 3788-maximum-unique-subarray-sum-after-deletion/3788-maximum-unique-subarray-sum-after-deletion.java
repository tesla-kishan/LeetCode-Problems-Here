class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sum=0 , maxneg=Integer.MIN_VALUE;
        for(int x: nums){
            if(x<=0) maxneg=Math.max(maxneg,x);
            else if(!set.contains(x)){
                sum+=x;
                set.add(x);
            }
        }
        return sum==0 ? maxneg : sum;
    }
}