class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();  
        for(int val : arr){
            if(map.containsKey(val)){
                map.put(val,map.get(val)+1);
            }else{
                map.put(val,1);
            }
        }
        int ans =-1;
        for(Integer key : map.keySet()){
            int freq = map.get(key);
            if(freq == key){
                if(key > ans){
                    ans = key;
                }
            }
        }
        return ans;
    }
}