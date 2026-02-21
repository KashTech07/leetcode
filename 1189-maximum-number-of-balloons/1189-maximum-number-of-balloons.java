class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character , Integer> map = new HashMap<>();
        int c = 0;
        String a = "balloon";
        if(text.equals(a)) return 1 ;
        for(char ch : text.toCharArray()){
            map.put(ch , map.getOrDefault(ch , 0)+1);
        }
        
        while(map.size()>=5){
          for(char ch : a.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch , map.get(ch)-1);
                if(map.get(ch)==0) map.remove(ch);
            }
            else{
                return c ;
            }
          }
          c++ ; 
        }
        return c ;
    }
}