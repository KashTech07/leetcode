class Solution {
    public int compress(char[] chars) {
        int i = 0 ; 
        int index = 0 ;
        while(i<chars.length) {
            int count = 1 ;
            while(i<chars.length-1 && chars[i]==chars[i+1]){
                i++ ;
                count++ ;
            }
            chars[index] = chars[i] ;
            index++ ;
            if(count>1){
                String a = String.valueOf(count) ;
                for(char c : a.toCharArray()){
                   chars[index] = c ;
                   index++ ;
                }
            }
            i++;
        }
        return index ;
    }
}