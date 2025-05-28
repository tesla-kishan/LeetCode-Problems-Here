class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length();
        while(i>0){
            i--;
            char c = s.charAt(i);
            if(c != ' ') length++;
            else if(length >0) break;
        }
        return length;
    }
}