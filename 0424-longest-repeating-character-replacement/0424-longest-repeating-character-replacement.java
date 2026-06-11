class Solution {
    public int characterReplacement(String s, int k) {
//         int[] freq = new int[26];
//         int j = 0 ; 
//         int max=0;
//         int maxfreq=0;
//         for(int i = 0;i<s.length() ; i++){
//             freq[s.charAt(i)-'A']++;
//             maxfreq = Math.max(maxfreq,freq[s.charAt(i)-'A']);
//             int l = i-j+1;
//             while((i-j+1)-maxfreq>k){
//                 freq[s.charAt(j)-'A']--;
//                 j++;
//             }
//             // if((i-j+1)-maxfreq==k){
//             //     max = Math.max(max,i-j+1);
//             // }
//             max=Math.max(max,i-j+1);
//         }
//         return max;


int[] freq = new int[26] ;
int maxfreq = 0 ;
int ans = Integer.MIN_VALUE ;
int j = 0 ; 
for(int i = 0 ; i<s.length() ; i++){
  char c = s.charAt(i) ;
  freq[c - 'A']++ ; 
  maxfreq = Math.max(maxfreq , freq[c-'A']) ;
 // int l = i-j+1 ;
  while(i-j+1-maxfreq>k){
    freq[s.charAt(j)-'A']-- ;
    j++ ;
  }
  ans = Math.max(ans , i-j+1) ;
}
return ans ;}}















//     }
// }