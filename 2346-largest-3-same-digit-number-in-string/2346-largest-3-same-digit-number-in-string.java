class Solution {
    public String largestGoodInteger(String num) {
        String s = "";
        int mxd = -1;
        for(int i=0 ; i<num.length()-2 ; i++){
            char a = num.charAt(i);
            char b = num.charAt(i+1);
            char c = num.charAt(i+2);
            if(a==b && b==c){
                int digit = a-'0';
                if(digit>mxd){
                    mxd = digit;
                    s = "" + a + b + c;
                }
            }
        }
        return s;
    }
}