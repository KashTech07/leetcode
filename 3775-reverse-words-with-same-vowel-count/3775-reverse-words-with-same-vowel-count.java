class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" +");
        int n = count(arr[0]) ;
        for(int i = 1 ; i<arr.length ; i++){
            if(count(arr[i])==n){
                arr[i]= reverse(arr[i]) ;
            }
        }
       return String.join(" " , arr) ;
    }
    static int count(String s){
        int n = 0 ;
        for(char c: s.toCharArray()){
            if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u'){
                n++ ;
            }
        }
        return n ;
    }
    static String reverse(String s){
        int i = 0 ;
        char[] arr = s.toCharArray() ;
        int j = arr.length-1 ;
        while(i<j){
            char t = arr[i] ;
            arr[i] = arr[j] ;
            arr[j] = t ;
            i++ ;
            j-- ;
        }
        return new String(arr) ;
    }
}