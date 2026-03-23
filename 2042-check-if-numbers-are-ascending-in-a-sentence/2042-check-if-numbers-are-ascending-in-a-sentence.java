class Solution {
    public boolean areNumbersAscending(String s) {
        int i = 0 ;
        int prev = -1 ;
        int n = s.length();
        while(i<n){
            if(Character.isDigit(s.charAt(i))){
                int ans = 0 ;
                while(i<n && Character.isDigit(s.charAt(i))){
                    ans = ans*10 + s.charAt(i)-'0' ;
                    i++ ;}
                if(prev==-1){
                    prev = ans ;
                    i++ ;
                    continue ;
                }
                else{
                    if(prev>=ans) return false ;
                    prev = ans ;
                }
            }
            i++ ;
        }
        return true ;
    }
}