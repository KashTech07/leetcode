class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray() ;
        int i = 0 ;
        while(i<s.length()){
            if(arr.length-i >= k && arr.length-i< 2*k){
            reverse(arr , i , i+k-1) ;
        }
        else if(arr.length-i <k){
            reverse(arr , i , arr.length-1) ;
        }
        else {
             reverse(arr , i , i+k-1) ;
        }
         i += 2*k ;
    }
    return new String(arr) ;
}
    static void reverse(char[] arr , int start , int end){
        int i = start ; 
        int j= end ;
        while(i<j){
            char temp = arr[i] ;
            arr[i] = arr[j] ;
            arr[j] =temp ;
            i++ ;
            j-- ;
        }
    }}