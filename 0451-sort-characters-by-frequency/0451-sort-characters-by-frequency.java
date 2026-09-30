class Solution {
    public String frequencySort(String s) {
//         int[] freq = new int[128] ;
//         for(int i = 0 ; i<s.length() ; i++){
//             freq[s.charAt(i)]++ ;
//         }
//         StringBuilder sb = new StringBuilder() ;
//         int n = s.length() ;
//         while(sb.length()<n){
//             int max = 0 ;
//             for(int i = 1 ; i<128 ; i++){
//                 if(freq[i]>freq[max]){
//                     max = i ;
//                 }
//             }
//             for(int i = 0 ; i<freq[max] ; i++){
//                 sb.append((char) max) ;
//             }
//             freq[max] = 0 ;
//         }
//         return sb.toString() ;
//     }
// }
int[] freq = new int[128] ;
for(int i = 0   ;i <s.length() ; i++){
    freq[s.charAt(i)]++ ;
}
StringBuilder sb = new StringBuilder() ;
 int max = 0 ;
while(sb.length()<s.length()){
     max = 0 ;
    for(int i = 0 ; i < 128 ; i++){
        if(freq[max]<freq[i]) max = i ;
    }
    while(freq[max]>0){
        sb.append((char) max) ;
        freq[max]-- ;
    }
    freq[max] = 0 ;
}
return sb.toString() ; }}