class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> mp = new HashMap<>();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);
        char chars[] = s.toCharArray();
        int ans=0;
        int i,j;
        for( i=0, j=1 ; j<chars.length ; i++,j++){
            if(mp.get(chars[i]) >= mp.get(chars[j])){
                ans += mp.get(chars[i]);
            }else{
                ans -= mp.get(chars[i]);
            }
        }
        ans += mp.get(chars[i]);
        return ans;
    }
}