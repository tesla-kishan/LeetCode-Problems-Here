class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int num = x;
        int sum=0;
        while(x>0){
            int ld= x % 10;
            sum = sum*10 + ld;
            x = x/10;
        }
        if(num==sum) return true;
        else return false;
    }
}