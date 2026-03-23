class Solution {
    public int myAtoi(String s) {
    int i = 0 ;
    int n = s.length() ;
    int sign = 1 ;
    if(s.length()==0) return 0 ;
    while(i<n && s.charAt(i)==' '){
        i++ ;
    } 
    //if(i==n-1) return 0;
    if(i<n && (s.charAt(i)=='+' || s.charAt(i)=='-')){
        sign = s.charAt(i)=='-'? -1 : 1 ;
        i++ ;
    }
    int ans = 0  ;
    while(i<n && Character.isDigit(s.charAt(i))){
         int digit = s.charAt(i) - '0' ;
         if(ans > (Integer.MAX_VALUE - digit) /10){
            return sign==-1 ? Integer.MIN_VALUE : Integer.MAX_VALUE ;
         }
         ans = ans*10 + digit ;
         i++ ;
    }
    return sign*ans ;
    }
}