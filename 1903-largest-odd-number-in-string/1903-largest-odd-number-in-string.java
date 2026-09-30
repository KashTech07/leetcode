class Solution {
    public String largestOddNumber(String num) {
//         if( (num.charAt(num.length()-1)-'0')%2!=0 ) return num ;
//         for(int i = num.length()-1 ; i>=0 ; i--){
//             int n = num.charAt(i)-'0' ;
//             if(n%2!=0) {
//             return num.substring(0,i+1) ;
//             }
            
//         }
//         return "" ;
       
//     }
// }
if((num.charAt(num.length()-1)-'0')%2!=0) return num ;
for(int i = num.length()-1 ; i>= 0 ; i--){
    int n = num.charAt(i)-'0' ;
    if(n%2!=0) return num.substring(0,i+1) ;
}
return "" ;}}