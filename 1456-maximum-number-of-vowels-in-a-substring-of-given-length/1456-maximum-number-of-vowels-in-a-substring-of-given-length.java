class Solution {
    public int maxVowels(String s, int k) {
        int j = 0 ;
        int ans = 0 ;
        int count = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i) ;
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++ ;
            }
            while(i-j+1>k){
                char c2 = s.charAt(j) ;
                if(c2=='a'||c2=='e'||c2=='i'||c2=='o'||c2=='u') count-- ;
                j++ ;
            }
            if(i-j+1==k){
                ans = Math.max(ans , count) ;
            }
        }
        return ans ;
    }
}