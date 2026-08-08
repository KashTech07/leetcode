class Solution {
    public int maxLength(List<String> arr) {
        String temp = "" ;
        return solve(arr , temp , 0) ;
    }
    static int solve(List<String> arr , String temp , int idx){
        if(idx==arr.size()) {
            return temp.length() ;
        }
        int exclude = 0;
        int include = 0 ;
        int finaln = Integer.MIN_VALUE ;
        if(hasdup(arr.get(idx))) return solve(arr,temp,idx+1) ;
        exclude = solve(arr , temp , idx+1) ;
        if(nodup(arr.get(idx),temp)){
            include = solve(arr , temp+arr.get(idx) , idx+1) ;
        }
        int result = Math.max(include , exclude) ;
            //finaln = Math.max(result , finaln) ;
        
        return result ;
    }
    static boolean nodup(String a , String b){
        for(char c : a.toCharArray()){
            if(b.indexOf(c)!=-1) return false ;
        }
        return true ; }
        
        static boolean hasdup(String s){
            HashSet<Character> set = new HashSet<>() ;
            for(char c : s.toCharArray()){
                set.add(c) ;
            }
            if(set.size()<s.length()) return true ;
            return false ;
        }}
        