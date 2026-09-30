class Solution {
    public String minWindow(String s, String t) {
        int[] freq= new int[128] ;
        for(int i = 0 ; i<t.length() ; i++){
            freq[t.charAt(i)]++ ;
        }
        int j = 0 ; 
        int reqcount = t.length() ;
        int minLength = Integer.MAX_VALUE ;
        int start = 0 ;
        for(int i = 0 ; i <s.length() ; i++){
            char c = s.charAt(i) ;
            if(freq[c]>0) reqcount-- ;
            freq[c]-- ;
            while(reqcount==0){
                if(minLength>i-j+1){
                    minLength = i-j+1 ;
                    start = j ;
                }
                freq[s.charAt(j)]++ ;
                if(freq[s.charAt(j)]>0) reqcount++ ;
                j++ ;

            }

            }
            
        return minLength == Integer.MAX_VALUE ? "" : s.substring(start ,start+minLength );
    }
}