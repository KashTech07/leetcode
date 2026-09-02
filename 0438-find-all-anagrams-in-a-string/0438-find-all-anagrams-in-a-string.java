class Solution {
    public List<Integer> findAnagrams(String s, String p) {
//         int[] pc = new int[26] ;
//         int[] ps = new int[26] ;
//         List<Integer> ans = new ArrayList<>() ;
//         for(int i = 0 ; i<p.length() ; i++){
//             pc[p.charAt(i)-'a']++;
//         }
//         int j = 0;
//         for(int  i = 0 ; i<s.length() ; i++){
//            ps[s.charAt(i)-'a']++;
//            while(i-j+1 > p.length()){
//             ps[s.charAt(j)-'a']-- ;
//             j++ ;}
//             if(i-j+1==p.length()){
//                 if(matches(ps , pc)){
//                     ans.add(j) ;
//                 }
//            }
//         }
//         return ans ;
//     }
//     static boolean matches(int[] a , int[] b){
//         for(int i = 0 ; i<a.length ; i++){
//             if(a[i]!=b[i]) return false ;
//         }
//         return true ;
//     }
// }
// int j = 0 ;
// int[] pp = new int[26] ;
// int[] ps = new int[26] ;
// for(int i = 0 ; i<p.length() ; i++){
//     pp[p.charAt(i)-'a']++ ;
// }
// List<Integer> list = new ArrayList<>() ;
// for(int i = 0 ; i<s.length() ; i++){
//     ps[s.charAt(i)-'a']++ ;
//     while(i-j+1>p.length()){
//         ps[s.charAt(j)-'a']-- ;
//         j++ ;
//     }
//     if(i-j+1==p.length()){
//         if(matches(pp,ps)){
//             list.add(j) ;
//          }
//     }
// }
// return list ;}
// static boolean matches(int[] pp , int[] ps){
//     for(int i = 0 ; i<pp.length ; i++){
//         if(pp[i]!=ps[i]) return false ;
//     }
//     return true ;
// }}
 List<Integer> ans = new ArrayList<>() ;
//        int j = 0 ;
//        for(int i = 0 ; i<s.length() ; i++){
//            while(i-j+1 > p.length()) j++ ;
//            if(i-j+1 == p.length()){
//                if(isAnangram(s,i+1,j,p)){
//                    ans.add(j) ;
//                    //j++ ;
//                }
//            }
//        }
//         return ans ;
//     }
//     static boolean isAnangram(String s , int i , int j , String p){
//         char[] arr = s.substring(j,i).toCharArray() ;
//         char[] arr2 = p.toCharArray() ;
//         Arrays.sort(arr2) ;
//         Arrays.sort(arr) ;
//         String st = new String(arr) ;
//          String st2 = new String(arr2) ;
//         return st2.equals(st) ;
//     }
// }
int j = 0 ;
int[] arr1 = new int[26] ;
int[] arr2 = new int[26] ;
for(int i = 0 ; i<p.length() ; i++){
    arr1[p.charAt(i)-'a']++ ;
}
for(int i = 0 ; i<s.length() ; i++){
    arr2[s.charAt(i)-'a']++ ;
    while(i-j+1>p.length()){
        arr2[s.charAt(j)-'a']-- ;
        j++ ;
    }
    if(i-j+1 == p.length()){
        if(equal(arr1 ,arr2)) ans.add(j) ;
    }
}
return ans ; }
static boolean equal(int[] arr1 , int[] arr2){
    for(int i = 0 ; i<arr1.length ; i++){
        if(arr1[i]!=arr2[i]) return false ;
    }
    return true ;
}}






















