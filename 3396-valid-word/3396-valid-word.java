class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        boolean v=false, c=false;
        for(int i=0 ; i<word.length() ; i++){
            char ch = word.charAt(i);
            if(!Character.isLetterOrDigit(ch)) return false;
            if(Character.isLetter(ch)){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') v=true;
                else c=true;
            }
        }
        return v && c;
    }
}