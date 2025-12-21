class Solution {
    public int largestAltitude(int[] gain) {
        int ans = 0;
        int n = 0;
        ans=Math.max(ans,gain[0]-ans);
        for(int i = 0; i<gain.length ; i++){
           n = n+gain[i];
           ans=Math.max(ans,n);
        }
        return ans;
    }
}