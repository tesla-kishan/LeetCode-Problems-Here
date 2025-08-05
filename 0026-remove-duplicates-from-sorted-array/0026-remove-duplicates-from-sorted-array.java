

class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>(); // preserves order
        
        for (int num : nums) {
            set.add(num); // only first occurrence is kept
        }
        
        int index = 0;
        for (int val : set) {
            nums[index++] = val; // overwrite nums
        }
        
        return set.size(); // length of unique elements
    }
}