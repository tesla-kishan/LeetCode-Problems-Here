class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> ans = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {
            StringBuilder temp = new StringBuilder();
            int cnt = 0;

            while (i < s.length() && cnt < k) {
                temp.append(s.charAt(i));
                i++;
                cnt++;
            }

            while (temp.length() < k) {
                temp.append(fill);
            }

            ans.add(temp.toString());
        }

        // Convert List<String> to String[]
        return ans.toArray(new String[0]);
    }
}