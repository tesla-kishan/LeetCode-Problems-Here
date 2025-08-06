class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
        Stack<int[]> st = new Stack<>();
        for(int interval[]:intervals){
            if(st.isEmpty() || st.peek()[1] < interval[0]){
                st.push(interval);
            }else{
                st.peek()[1] = Math.max(st.peek()[1],interval[1]);
            }
        }
        return st.toArray(new int [st.size()][]);

    }
}