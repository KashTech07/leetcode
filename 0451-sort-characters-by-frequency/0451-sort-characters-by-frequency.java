class pair{
    char c; 
    int freq = 0 ;
    pair( int freq , char c ){
        this.c = c ;
        this.freq = freq ;
    }
}

class Solution {
    public String frequencySort(String s) {
       HashMap<Character , Integer> map = new HashMap<>();
       String ans = "" ;
       PriorityQueue<pair> q = new PriorityQueue<>((a,b)->b.freq-a.freq) ;
       for(int i=0 ; i<s.length() ; i++){
       map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0)+1) ;
       } 
       for(char ch : map.keySet()){
        q.add(new pair(map.get(ch) , ch));
       }
       while(!q.isEmpty()){
        pair p = q.poll() ;
        while(p.freq>0){
        ans+=p.c ;
         p.freq--;
        // if(p.freq>0){
        //     q.add(new pair(p.freq , p.c));
        // }
       }}
       return ans ;

    }
}