class Solution {
    public String capitalizeTitle(String title) {
        String[] arr = title.split(" ") ;
        int i = 0 ;
        for(String s : arr){
          String a = s.toLowerCase() ;
          if(s.length()==1 || s.length()==2){
            arr[i++] = a ;
          }
          else {
            String b = Character.toUpperCase(s.charAt(0))+a.substring(1) ;
            arr[i++] = b ;
          }
        }
        return String.join(" " , arr) ;
    }}
      