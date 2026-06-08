class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> list = new ArrayList<>() ;
        int count = 0 ;
        for(int i = 0 ; i < s.length(); i++ ){
            char c = s.charAt(i) ;
            while(list.contains(c)){
                list.remove(0) ;
            }
            list.add(c) ;
            count = Math.max(count , list.size()) ;
        }
        return count ;}}