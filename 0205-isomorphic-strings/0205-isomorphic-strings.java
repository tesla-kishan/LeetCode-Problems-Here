class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> mp = new HashMap<>();
        HashSet<Character> st = new HashSet<>();
        for(int i=0 ; i<s.length(); i++){
            char sch = s.charAt(i);
            char tch = t.charAt(i);
            if(mp.containsKey(sch)){
                if(mp.get(sch) != tch) return false;
            }
            else if(st.contains(tch)){
                return false;
            }
            else{
                mp.put(sch,tch);
                st.add(tch);
            }
        }
        return true;
    }
}
