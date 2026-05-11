class Solution {
    public int longestContinuousSubstring(String s) {
        int j= 0 ; 
        int ans = 1 ;
        for(int i = 1 ; i<s.length() ; i++){
            char c1 = s.charAt(i-1) ;
            char c2 = s.charAt(i) ;
            if(c1-'a' + 1 != c2-'a'){
                j=i ;
            }
            ans = Math.max(ans , i-j+1) ;
        }
        return ans ;
    }
}