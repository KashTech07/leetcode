class Solution {
    public boolean wordPattern(String pattern, String s) {
       HashMap<Character , String > map = new HashMap<>();
//        HashMap<String , Character > map2 = new HashMap<>();
//        String[] arr = s.split(" +");
//        if(pattern.length()!=arr.length){
//         return false;
//        }
//        for(int i = 0 ;i<pattern.length() ; i++){
//         if(map.containsKey(pattern.charAt(i))){
//             if(!map.get(pattern.charAt(i)).equals(arr[i])){
//                 return false ;
//             }
//         }
//         if(map2.containsKey(arr[i])){
//             if(map2.get(arr[i])!=pattern.charAt(i)){
//                 return false ;
//             }
//         }
//         map.put(pattern.charAt(i),arr[i]);
//         map2.put(arr[i],pattern.charAt(i));
//        } 
//        return true ;
//     }
// }

String[] arr = s.split(" ") ;
if(pattern.length()!=arr.length) return false ;
for(int i = 0 ; i<arr.length ; i++){
    char c = pattern.charAt(i) ;
    String word = arr[i] ;
    if(map.containsKey(c)){
        if(!map.get(c).equals(word)) return false ;
    }
    else{
        if(map.containsValue(word)) return false ;
    }
    map.put(c , word) ;
}
return true ; }}