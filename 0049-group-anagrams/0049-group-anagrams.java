class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , ArrayList<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for(String s : strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String a = new String(arr);
            if(map.containsKey(a)){
             map.get(a).add(s);
            }else{
                ArrayList<String> list = new ArrayList<>();
                list.add(s);
                map.put(a,list);
            }
        }
        for(String key : map.keySet()){
            ans.add(map.get(key));
        }
        return ans ; }}