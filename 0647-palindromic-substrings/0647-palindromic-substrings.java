class Solution {
    public int countSubstrings(String s) {
       int ans = 0;
        for(int i = 0 ; i<s.length() ; i++){
            int count1 = expand(s , i , i) ;
           int count2 = expand(s , i , i+1) ;
            ans += count1+count2 ;
        }
        return ans ;
    }
    static int expand(String s, int left , int right ){
        int count = 0 ;
        while(left>=0 && right<s.length()){
            if(s.charAt(left)==s.charAt(right)){
            left-- ;
            right++ ;
            count++ ;}
            else{
                break ;
            }
        }
        return count ;
    }
}