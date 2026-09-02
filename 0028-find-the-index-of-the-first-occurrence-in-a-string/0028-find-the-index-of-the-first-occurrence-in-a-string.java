class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length()) return -1 ;
        if(haystack.equals(needle)) return 0 ;
        for(int i = 0 ; i<haystack.length()-needle.length()+1 ; i++){
            char c = haystack.charAt(i) ;
            if(c==needle.charAt(0)){
                //if(i+needle.length()<haystack.length()){
                if(needle.equals(haystack.substring(i,i+needle.length()))) return i ;
            }
        }
        return -1 ;
    }
}