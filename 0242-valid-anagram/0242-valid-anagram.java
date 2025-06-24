class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> mp1 = fn(s);
        HashMap<Character,Integer> mp2 = fn(t);
        return mp1.equals(mp2);
    }
    static HashMap<Character,Integer> fn(String str){
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }else{
                int freq = mp.get(ch);
                mp.put(ch,freq+1);
            }
        }
        return mp;
    }
}