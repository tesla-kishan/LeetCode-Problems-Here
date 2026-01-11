class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^0-9A-Za-z]","").toLowerCase();
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }   
        return true;  
    }
}