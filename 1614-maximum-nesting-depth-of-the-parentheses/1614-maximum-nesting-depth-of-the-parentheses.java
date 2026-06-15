class Solution {
    public int maxDepth(String s) {
       int c = 0 ;
       int maxC = 0;
       int open = 0 ; 
       int close = 0 ;
       for(int i = 0 ;i<s.length() ; i++){
        if(s.charAt(i)=='(') open++ ;
        else if(s.charAt(i)==')') close++ ;
        c = open-close ;
        maxC = Math.max(maxC , c) ;
       }
       return maxC ;}}