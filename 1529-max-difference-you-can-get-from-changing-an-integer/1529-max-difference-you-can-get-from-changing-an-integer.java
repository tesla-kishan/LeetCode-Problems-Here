class Solution {
    public int maxDiff(int num) {
        String str = Integer.toString(num);
        String str2 = new String(str);
        int idx =-1;
        for(int i=0 ; i<str.length() ; i++){
            if(str.charAt(i) != '9'){
                idx = i;
                break;
            }
        }
        if(idx != -1){
            str = str.replace(str.charAt(idx),'9');
        }
        int idx2= -1;
        if(str2.charAt(0) != '1'){
            idx2 = str2.charAt(0);
            str2 = str2.replace((char)idx2,'1');
        }else{
            for(int i=1 ; i<str2.length() ; i++){
                if(str2.charAt(i) != '0' && str2.charAt(i) != '1'){
                    idx2 = str2.charAt(i);
                    break;
                }
            }
            if(idx2 !=-1){
                str2 = str2.replace((char)idx2,'0');
            }
        }

        return Integer.parseInt(str) - Integer.parseInt(str2);
    }
}