class Solution {
    public int minMaxDifference(int num) {
        ArrayList<Integer> ans = new ArrayList<>();
        int original = num;
        while(num>0){
            int ld = num%10;
            ans.add(ld);
            num /= 10;
        }
        Collections.reverse(ans);
        ArrayList<Integer> maxlist = new ArrayList<>(ans);
        ArrayList<Integer> minlist = new ArrayList<>(ans);
        int x = -1;
        for(int d : maxlist){
            if(d != 9){
                x=d;
                break;
            }
        }
        if(x != -1){
        for(int i=0 ; i<ans.size() ; i++){
            if(maxlist.get(i)==x){
                maxlist.set(i,9);
            }
        }
        }
        int largenum = 0;
        for(int digits : maxlist){
            largenum = largenum * 10 + digits;
        }
        int y = minlist.get(0);
        for(int i=0 ; i<minlist.size() ; i++){
            if(minlist.get(i)==y ){
                minlist.set(i,0);
            }
        }
        int smallnum = 0;
        for(int digits : minlist){
            smallnum = smallnum * 10 + digits;
        }
        return largenum-smallnum;
    }
}