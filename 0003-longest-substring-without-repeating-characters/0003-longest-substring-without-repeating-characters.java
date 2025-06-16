class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0;
        int right =0;
        int max=0;
        Map<Character,Integer> map = new HashMap<>();
        while(right<s.length()){
            if(map.containsKey(s.charAt(right))){
                left = Math.max(left,map.get(s.charAt(right))+1);
            }
            map.put(s.charAt(right),right);
            max = Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
}