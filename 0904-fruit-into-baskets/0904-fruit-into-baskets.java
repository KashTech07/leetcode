class Solution {
    public int totalFruit(int[] fruits) {
       int count=0;
       int j = 0;
       if(fruits.length==1) return 1 ;
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i = 0;i<fruits.length ;i++){
        map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
        while(map.size()>2){
            int a = fruits[j];
            map.put(a , map.get(a)-1);
            if(map.get(a)==0) map.remove(a);
            j++;
            }
            // while(map.size()==2){
                count=Math.max(count , i-j+1);
            }
        
        return count ;
       } 
    
}