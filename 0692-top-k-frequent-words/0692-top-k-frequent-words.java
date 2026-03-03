class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String , Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        PriorityQueue<String> q = new PriorityQueue<>((a,b)->{if(map.get(a).equals(map.get(b))){
            return b.compareTo(a);}
            else return map.get(a)-map.get(b);
        });
        for(String s : words){
            map.put(s , map.getOrDefault(s,0)+1);
        }
        
        for(String key : map.keySet()){
            q.offer(key);
            if(q.size()>k){
                q.poll();
            }
        }
        while(!q.isEmpty()){
            list.add(q.poll());
        }
        Collections.reverse(list);
        return list ;
    }
}