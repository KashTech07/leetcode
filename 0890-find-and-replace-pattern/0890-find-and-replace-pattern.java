class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>() ;
        for(String s : words){
             if(check(s,pattern)) ans.add(s) ;
        }
        return ans ;
    }
    static boolean check(String s , String pattern){
HashMap<Character , Character> map = new HashMap<>() ;
for(int i = 0 ; i < s.length() ; i++){
    char a = s.charAt(i) ;
    char b = pattern.charAt(i) ;
    if(map.containsKey(a)){
        if(map.get(a)!=b) return false ;
    }
    else{
        if(map.containsValue(b)) return false ;
    }
    map.put(a,b) ;
}
return true ;
    }
}