class Solution {
    public String longestPalindrome(String s) {
        
        if (s.length() <= 1) {
            return s;
        }
        String ans = s.substring(0,1) ;
        for(int i = 0 ; i<s.length()-1 ; i++){
            String odd = expand(s , i , i) ;
            String even = expand(s , i , i+1) ;
            if(odd.length()>ans.length()){
                ans = odd ;
            }
            if(even.length()>ans.length()){
                ans = even ;
            }
        }
        return ans ;
    }
    static String expand(String s, int left , int right ){
        while(left>=0 && right<s.length()){
            if(s.charAt(left)==s.charAt(right)){
            left-- ;
            right++ ;}
            else{
                break ;
            }
        }
        return s.substring(left+1 , right) ;
    }
}