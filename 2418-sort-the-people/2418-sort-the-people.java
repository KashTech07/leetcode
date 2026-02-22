class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
      String[] ans = new String[names.length];
      HashMap<Integer ,String> map = new HashMap<>();
      for(int i=0 ; i<names.length ; i++){
        map.put(heights[i],names[i]);
      }
       TreeMap<Integer, String> sorted =
                new TreeMap<>(Collections.reverseOrder());
        
        sorted.putAll(map);
        
        int index = 0;
        for(String name : sorted.values()){
            ans[index++] = name;
        }
        
        return ans;
    }
}