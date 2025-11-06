class Solution {
    public String reversePrefix(String word, char ch) {
      if(!word.contains(String.valueOf(ch))){
        return word;
      }
     
      int idx =0;
      for(int i =0;i<word.length();i++){
       if(word.charAt(i)==ch){
         idx = i;
         break;
       }
      }
     String prefix = word.substring(0,idx+1);
     StringBuilder sb = new StringBuilder(prefix);
     sb.reverse();
     String s = sb.toString() + word.substring(idx+1);
     return s;}}