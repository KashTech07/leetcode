class Solution {
    public String reverseByType(String s) {
        int i = 0; 
        int j = s.length()-1 ;
        char[] arr = s.toCharArray() ;
        while(i<j){
            while(i<s.length()&&!Character.isLetter(arr[i])) i++ ;
            while(j>=0 && !Character.isLetter(arr[j])) j-- ;
            if(i<j){
            char temp = arr[i] ;
            arr[i] = arr[j] ;
            arr[j] = temp ;
            i++ ;
            j-- ;
        }}
        i = 0 ; 
        j = arr.length -1 ;
        while(i<j){
            while(i<s.length()&&Character.isLetter(arr[i])) i++ ;
            while(j>=0 &&Character.isLetter(arr[j])) j-- ;
            if(i<j){
            char temp = arr[i] ;
            arr[i] = arr[j] ;
            arr[j] = temp ;
            i++ ;
            j-- ;
        }}
        return new String(arr) ;
    }
}