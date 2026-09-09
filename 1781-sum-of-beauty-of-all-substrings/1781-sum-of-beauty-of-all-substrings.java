class Solution {
    public int beautySum(String s) {
//         int beauty = 0;
//         for(int j = 0 ; j<s.length() ; j++){
//             int[] freq = new int[26] ;
//             for(int i = j ; i<s.length() ; i++){
//             char c = s.charAt(i) ;
//             freq[c - 'a']++ ;
//             int maxfreq = Integer.MIN_VALUE ;
//             int minfreq = Integer.MAX_VALUE ;
//             for (int f : freq) {
//                     if (f > 0) { 
//                         maxfreq = Math.max(maxfreq, f);
//                         minfreq = Math.min(minfreq, f);
//                     }
//                 }
//                 beauty = beauty + (maxfreq - minfreq);
//             }
//         }
        
//         return beauty;
//     }
// }
 int beauty = 0 ;
 for(int i = 0 ; i<s.length() ; i++){
    int[] freq = new int[26] ;
    for(int j = i ; j<s.length() ; j++){
        freq[s.charAt(j)-'a']++ ;
    
    int maxx = Integer.MIN_VALUE ;
    int min = Integer.MAX_VALUE ;
    for(int k = 0 ; k<26 ; k++){
        if(freq[k]>maxx) maxx = freq[k] ;
        if(freq[k] > 0&&freq[k]<min) min = freq[k] ;
    }
    beauty = beauty + (maxx-min) ;
 }}
 return beauty ; }}