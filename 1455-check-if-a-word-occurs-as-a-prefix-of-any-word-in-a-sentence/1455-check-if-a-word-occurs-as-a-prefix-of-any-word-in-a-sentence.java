class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] arr = sentence.split(" +") ;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i].charAt(0)==searchWord.charAt(0)){
                if(isPrefix(searchWord , arr[i])){
                    return i+1 ;
                }
            }
        }
        return -1 ;
    }
    static boolean isPrefix(String s , String a){
        int n = Math.min(s.length() , a.length()) ;
        if(a.length()<s.length()) return false; 
        for(int i = 0 ; i<n ; i++){
            if(s.charAt(i)!=a.charAt(i)) return false ;
        }  
        return true ;  
}}