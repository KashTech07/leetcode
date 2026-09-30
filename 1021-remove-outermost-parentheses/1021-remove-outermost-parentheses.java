class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0 ;
        StringBuilder sb = new StringBuilder() ;
//         for(int i = 0 ; i<s.length() ; i++){
//             if(s.charAt(i)=='('){
//                 if(count>0) {
//                   sb.append(s.charAt(i)) ;
//                 }
//                 count++ ;
//             }
//             else{
//                 count-- ;
//                 if(count>0) sb.append(s.charAt(i)) ;
//             }
//         }
//         return sb.toString() ;
//     }
// }
for(int i = 0 ; i < s.length() ; i++){
    char c = s.charAt(i) ;
    if(c=='(' && count>0){
        count++ ;
        sb.append(c) ;
    }
    else if(c=='('){
        count++ ;
    }
    else if(c==')'&&count>1){
        count-- ;
        sb.append(c) ;
    }
    else if(c==')') count-- ;
}
return sb.toString() ; }}