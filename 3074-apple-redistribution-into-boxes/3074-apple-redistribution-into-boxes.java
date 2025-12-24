class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int asum = 0;
        int csum =0;
        int ans = capacity.length;
       for(int n : apple){
        asum=asum+n;
       }
       Arrays.sort(capacity);
       for(int j = capacity.length-1 ; j>=0 ; j--){
         csum = csum + capacity[j];
         if(csum>=asum){
            ans = capacity.length - j ;
            return ans ;
         }
       }
       return ans;}}