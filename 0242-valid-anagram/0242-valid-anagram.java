class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }else{
                int freq = mp.get(ch);
                mp.put(ch,freq+1);
            }
        }
        for(int j=0 ; j<t.length() ; j++){
            char chh = t.charAt(j);
            if(!mp.containsKey(chh)) return false;
            else{
                int freqq = mp.get(chh);
                mp.put(chh,freqq-1);
            }
        }
        for(Integer i : mp.values()){
            if(i != 0 ) return false;
        }
        return true;
    }
}