class Solution {
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character , Integer> map = new HashMap<>() ;
        int count  = 0 ;
        for(char c : s.toCharArray()){
            map.put(c , map.getOrDefault(c , 0)+1) ;
        }
        while(!map.isEmpty()){
            for(char c : target.toCharArray()){
                if(map.containsKey(c)){
                    map.put(c , map.get(c)-1) ;
                    if(map.get(c)==0) map.remove(c) ;
                }
                else{
                    return count  ;
                }
            }
            count++ ;
        }
        return count ;
    }
}