class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int n = digits.length;
        boolean [] used = new boolean[1000];
        List<Integer> ans = new ArrayList<>();
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                for(int k=0 ; k<n ; k++){
                    if(i==j || j==k || i==k) continue;
                    int num = digits[i]*100 + digits[j]*10 + digits[k];
                    if(num>=100 && num%2 ==0){
                        if(!used[num]){
                            used[num] = true;
                            ans.add(num);
                        }
                    }
                }
            }
        }
        int arr[] = new int[ans.size()];
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = ans.get(i);
        }
        Arrays.sort(arr);
        return arr;
    }
}