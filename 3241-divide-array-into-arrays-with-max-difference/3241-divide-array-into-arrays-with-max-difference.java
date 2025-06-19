class Solution {
    public int[][] divideArray(int[] nums, int k) {
       ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
       int n = nums.length;
       Arrays.sort(nums);
       for(int i=0 ; i<n ; i=i+3){
        if(nums[i+2]-nums[i]>k){
            return new int[0][0];
        }
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(nums[i]);
        temp.add(nums[i+1]);
        temp.add(nums[i+2]);
        ans.add(temp);
       }
       int res[][] = new int [ans.size()][3];
       for(int i=0 ;i<ans.size() ; i++){
        for(int j=0 ; j<3 ; j++){
            res[i][j] = ans.get(i).get(j);
        }
       }
       return res;
    }
}