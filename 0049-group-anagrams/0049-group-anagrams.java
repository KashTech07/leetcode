class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // HashMap<String , ArrayList<String>> map = new HashMap<>();
        // List<List<String>> ans = new ArrayList<>();
        // for(String s : strs){
        //     char[] arr = s.toCharArray();
        //     Arrays.sort(arr);
        //     String a = new String(arr);
        //     if(map.containsKey(a)){
        //      map.get(a).add(s);
        //     }else{
        //         ArrayList<String> list = new ArrayList<>();
        //         list.add(s);
        //         map.put(a,list);
        //     }
        // }
        // for(String key : map.keySet()){
        //     ans.add(map.get(key));
        // }
        // return ans ; }}
        HashMap<String , ArrayList<String>> map = new HashMap<>() ;
        List<List<String>> ans = new ArrayList<>() ;
        for(int i = 0 ; i<strs.length ; i++){
            char[] arr = strs[i].toCharArray() ;
            Arrays.sort(arr) ;
            String s = new String(arr) ;
            map.put(s , map.getOrDefault(s ,new ArrayList<String>())) ;
            map.get(s).add(strs[i]) ;
        }
        for(String k : map.keySet()){
          ans.add(map.get(k)) ;
        }
        return ans ; }}