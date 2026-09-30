class Solution {
    public boolean isIsomorphic(String s, String t) {
// HashMap<Character,Character> map = new HashMap<>() ;
// for(int i = 0 ; i<s.length() ; i++){
//     char a = s.charAt(i) ;
//     char b = t.charAt(i) ;
//     if(map.containsKey(a)){
//         if(map.get(a)!=b) return false ;
//     }
//     else{
//         if(map.containsValue(b)) return false ;
//     }
//     map.put(a,b) ;
// }
// return true ; }}
HashMap<Character , Character> map = new HashMap<>() ;
for(int i = 0 ; i<s.length() ; i++){
    char c1 = s.charAt(i) ;
    char c2 = t.charAt(i) ;
    if(map.containsKey(c1)){
        if(map.get(c1)!=c2) return false ;
    }
    else{
        if(map.containsValue(c2)) return false ;
    }
    map.put(c1,c2) ;
}
return true ; }}