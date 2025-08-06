class Solution {
    public int[][] merge(int[][] intervals) {
        Stack<int[]> stack = new Stack<>();
        Arrays.sort(intervals , (a,b)-> a[0]-b[0]);
        for (int[] interval : intervals) {
            if (stack.isEmpty() || stack.peek()[1] < interval[0]) {
                stack.push(interval);
            } else {
                stack.peek()[1] =Math.max(stack.peek()[1],interval[1]);
            }
        }
        return stack.toArray(new int[stack.size()][]);
    }
}