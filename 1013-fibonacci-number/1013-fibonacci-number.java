class Solution {
    public int fib(int n) {
        if(n<2) return n;
        int a=0,b=1;
        int temp=0;
        for(int i=2 ; i<=n ; i++){
            temp = a+b;
            a=b;
            b=temp;
        }
        return temp;
    }
}