class Solution {
    public int numberOfSpecialChars(String word) {
       boolean[] arr1 = new boolean[26];
       boolean[] arr2 = new boolean[26];
       for(int i = 0 ; i<word.length() ; i++){
        char c = word.charAt(i) ;
        if(c>='a' && c<='z'){
            arr1[c-'a'] = true ;
         }
         else{
            arr2[c-'A'] =true ;
         }
       }
       int ans = 0 ;
       for(int i = 0 ; i<26 ; i++){
        if(arr1[i]&&arr2[i]) ans++ ;
       }
       return ans ; }}
