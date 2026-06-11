class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] pc = new int[26] ;
        int[] ps = new int[26] ;
        List<Integer> ans = new ArrayList<>() ;
        for(int i = 0 ; i<p.length() ; i++){
            pc[p.charAt(i)-'a']++;
        }
        int j = 0;
        for(int  i = 0 ; i<s.length() ; i++){
           ps[s.charAt(i)-'a']++;
           while(i-j+1 > p.length()){
            ps[s.charAt(j)-'a']-- ;
            j++ ;}
            if(i-j+1==p.length()){
                if(matches(ps , pc)){
                    ans.add(j) ;
                }
           }
        }
        return ans ;
    }
    static boolean matches(int[] a , int[] b){
        for(int i = 0 ; i<a.length ; i++){
            if(a[i]!=b[i]) return false ;
        }
        return true ;
    }
}