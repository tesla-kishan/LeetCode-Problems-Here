class Solution {
    public int longestPalindrome(String[] words) {
        int freq[][] = new int [26][26];
        int ans =0;
        for(int i=0 ; i<words.length ; i++){
            int a = words[i].charAt(0) - 'a';
            int b = words[i].charAt(1) - 'a';

            if(freq[b][a] >0){
                ans +=4;
                freq[b][a]--;
            }else freq[a][b]++;
        }
        for(int i=0 ; i<26 ; i++){
            if(freq[i][i] > 0){
                ans+=2; 
                break;
            }
        }
        return ans;
    }
}