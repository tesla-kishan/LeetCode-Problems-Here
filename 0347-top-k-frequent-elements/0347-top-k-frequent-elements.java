class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int offset = 10000; // to handle negatives
        int freq[] = new int[20001]; // range -10000 to +10000

        // Count frequency
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i] + offset]++;
        }

        int ans[] = new int[k];
        int idx = 0;

        // Pick top k
        for (int i = 0; i < k; i++) {
            int best = 0;
            int count = 0;
            for (int j = 0; j < 20001; j++) {
                if (freq[j] > count || (freq[j] == count && j - offset > best)) {
                    count = freq[j];
                    best = j - offset;
                }
            }
            ans[idx++] = best;
            freq[best + offset] = 0; // reset chosen element
        }

        return ans;
    }
}