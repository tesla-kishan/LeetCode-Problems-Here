class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> smallset = new HashSet<>();
        Set<Character> capitalset = new HashSet<>();
        for(char c : word.toCharArray()){
            if(c >= 'a' && c<= 'z'){
                smallset.add(c);
            }else{
                capitalset.add(c);
            }
        } 
        int ct=0;
        for(char c : smallset){
            if(capitalset.contains(Character.toUpperCase(c))){
                ct++;
            }
        }
        return ct;
    }
}