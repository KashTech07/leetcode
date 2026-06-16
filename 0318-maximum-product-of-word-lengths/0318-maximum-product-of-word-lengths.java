class Solution {
    public int maxProduct(String[] words) {
        int ans = Integer.MIN_VALUE ;
        for(int i = 0 ; i<words.length-1 ; i++){
            for(int j = i+1 ; j<words.length ; j++){
                if(valid(words[i] , words[j])){
                    ans = Math.max(ans , words[i].length()*words[j].length()) ;
                }
            }
        }
        return ans==Integer.MIN_VALUE ? 0 : ans ;
    }
    static boolean valid(String a , String b){
        int[] as = new int[26] ;
        int[] bs = new int[26] ;
        for(int i = 0 ; i<a.length() ; i++){
            as[a.charAt(i)-'a']++ ;
        }
        for(int i = 0 ; i<b.length() ; i++){
            if(as[b.charAt(i)-'a']!=0) return false ;
        }
        return true ;}}