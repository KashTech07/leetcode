class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] arr = paragraph.toLowerCase().split("[^a-zA-Z]+") ;
        HashMap<String , Integer> map = new HashMap<>() ;
        for(String s : arr){
            map.put(s , map.getOrDefault(s,0)+1) ;
        }
        String ans ="" ;
        for(String s : banned){
            if(map.containsKey(s))
             map.remove(s) ;
        }
        int max = 0 ;
        for(String s : map.keySet()){
           if(map.get(s)>max){
            max = map.get(s) ;
            ans = s ;
           }
        }
        return ans ;
    }
}