class Solution {
    public List<List<String>> partition(String s) {
        ArrayList<String> list  = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        backtrack(s , ans , list , 0 );
        return ans ;
    }
    static void backtrack(String s , List<List<String>> ans ,  ArrayList<String> list , int index ){
        if(index == s.length()){
            ans.add(new ArrayList<>(list));
            return  ;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = index ; i<s.length() ; i++){
            sb.append(s.charAt(i)) ;
            if(isPalin(sb )){
                list.add(sb.toString()) ;
                backtrack(s , ans , list , i+1 );
                list.remove(list.size()-1);
            }
        }
    }
    static boolean isPalin(StringBuilder sb ){
        //sb.append(c);
        String s = sb.toString();
        String a = "" ;
        for(int i = s.length()-1 ; i>=0 ; i--){
            a+=s.charAt(i);
        }
        return (s.equals(a)) ;
    }
}