class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
//         HashMap<Character ,Integer> map1 = new HashMap<>();
//        // HashMap<Characeter , Integer> map2 = new HashMap<>();
//         if(ransomNote.length()>magazine.length()) return false;
//         for(char c : magazine.toCharArray()){
//             map1.put(c , map1.getOrDefault(c , 0)+1);
//         }
//         for(char ch : ransomNote.toCharArray()){
//             if(map1.containsKey(ch)){
//                 map1.put(ch , map1.get(ch)-1);
//                 if(map1.get(ch)==0) map1.remove(ch);
//             }
//             else {
//                 return false;
//             }
//         }
//         return true;
//     }
// }
int[] freq1 = new int[26] ;
int[] freq2 = new int[26] ;
for(int i = 0 ; i<magazine.length() ; i++){
    freq1[magazine.charAt(i)-'a']++ ;
}
for(int i = 0 ; i<ransomNote.length() ; i++){
    if(freq1[ransomNote.charAt(i)-'a']==0) return false ;
    else {
        freq1[ransomNote.charAt(i)-'a']-- ;
    }
}
return true ; }}