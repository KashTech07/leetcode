class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        String prev = "";
        for(String s : words){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String a = new String(arr);
            if(!a.equals(prev)){
                ans.add(s);
                prev = a ;
            }
        }
        return ans ;}}