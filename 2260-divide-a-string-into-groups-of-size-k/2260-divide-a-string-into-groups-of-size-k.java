class Solution {
    public String[] divideString(String s, int k, char fill) {
        int len = s.length();
        List<String> ans = new ArrayList<>();
        int i=0 ;
        while(i<len){
            StringBuilder temp = new StringBuilder();
            int count=0;
            while(i<len && count<k){
                temp.append(s.charAt(i));
                i++;
                count++;
            }
            while(temp.length()<k){
                temp.append(fill);
            }
            ans.add(temp.toString());
        }
        return ans.toArray(new String[0]);
    }
}