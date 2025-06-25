class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        for(int num : nums){
            st.add(num);
        }
        int mxstrm =0;
        for(int num : st){
            if(!st.contains(num-1)){
                int currnum = num;
                int currentstrk = 1;
                while(st.contains(currnum+1)){
                    currentstrk++;
                    currnum++;
                }
                mxstrm = Math.max(mxstrm,currentstrk);
            }
        }
        return mxstrm;
    }
}