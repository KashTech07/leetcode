class Solution {
    public boolean repeatedSubstringPattern(String s) {
//      for(int i=0;i<s.length();i++){
//         if(s.charAt(i)==s.charAt(0)){
//     if(s.substring(0,i)==s.substring(i+1,2*i+1))
//     {return true;}
//         }
//      } return false;  
//     }
// }
// if(s.length()%2!=0){
//    return false;
// }
// for(int i=1;i<s.length();i++){
//         if(s.charAt(i)==s.charAt(0)){
//     if(s.substring(0,i).equals(s.substring(i,2*i)))
//     {return true;}}}
//     return false;}}
String doubled = s+s;
String sub = doubled.substring(1,doubled.length()-1);
if(sub.contains(s)){
    return true;
}
return false;}}