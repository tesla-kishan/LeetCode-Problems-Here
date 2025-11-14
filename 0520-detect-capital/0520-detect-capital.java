class Solution {
    public boolean detectCapitalUse(String word) {
        return(allC(word) || allL(word) || titc(word));
    }
    public boolean allC(String word) {
        int c=0;
        for(int i=0 ; i<word.length() ; i++){
            char ch = word.charAt(i);
            if(Character.isUpperCase(ch)) c++;
        }
        if(c==word.length()) return true;
        return false;
    }
    public boolean allL(String word) {
        int c=0;
        for(int i=0 ; i<word.length() ; i++){
            char ch = word.charAt(i);
            if(Character.isLowerCase(ch)) c++;
        }
        if(c==word.length()) return true;
        return false;
    }
    public boolean titc(String word) {
        char ch= word.charAt(0);
        String sub_str = word.substring(1);
        if(Character.isUpperCase(ch) && allL(sub_str)) return true;
        return false;
    }
}