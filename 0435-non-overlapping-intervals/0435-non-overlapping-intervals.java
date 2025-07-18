class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals,(a,b) -> a[1]-b[1]);
        int lastEnd = intervals[0][1];
        int removed=0;
        for(int i=1 ; i<n ; i++){
            if(intervals[i][0]<lastEnd){ //overlap
                removed++;
            }else{
                lastEnd= intervals[i][1];
            }
        }
        return removed;
    }
}