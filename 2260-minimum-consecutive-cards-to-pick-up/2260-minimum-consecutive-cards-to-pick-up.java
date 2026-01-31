class Solution {
    public int minimumCardPickup(int[] cards) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int j = 0 ;
        int min=Integer.MAX_VALUE;
        for(int i = 0 ; i<cards.length ; i++){
            while(map.containsKey(cards[i])){
                min=Math.min(min,i-j+1);
                map.put(cards[j],map.get(cards[j])-1);
                if(map.get(cards[j])==0){
                    map.remove(cards[j]);
                }
                j++;}
            
            map.put(cards[i],map.getOrDefault(cards[i],0)+1);
        }
        return (min==Integer.MAX_VALUE)?-1:min;
    }
}