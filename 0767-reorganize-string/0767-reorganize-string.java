 class pair{
    int freq ;
    char c ;
    pair(int freq , char c){
        this.freq = freq ;
        this.c=c ;
    }
}
class Solution {
    public String reorganizeString(String s) {
        PriorityQueue<pair> q = new PriorityQueue<>((a,b)->b.freq-a.freq);
        HashMap<Character , Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char key : map.keySet()){
            q.add(new pair(map.get(key),key));
        }
        int x = 0;
        String res = "";
        while(!q.isEmpty()){
            pair curr = q.poll();
            int a = curr.freq ;
            char ch = curr.c ;
            if(res.length()==0||res.charAt(x-1)!=ch){
                res=res+ch;
                x++ ;
                curr.freq--;
                if(curr.freq>0){
                    q.add(curr);
                }
            }
            else{
                if(q.isEmpty()) return "";
                pair curr2 = q.poll();
                char ch2 = curr2.c ;
                res+=ch2 ;
                x++;
                curr2.freq--;
                if(curr2.freq>0){
                    q.add(curr2);
                }
                q.add(curr);
            }
        }
        return res ;
    }
}