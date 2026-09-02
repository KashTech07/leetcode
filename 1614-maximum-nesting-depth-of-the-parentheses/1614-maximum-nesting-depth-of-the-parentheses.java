class Solution {
    public int maxDepth(String s) {
       int oc = 0 ;
       int cc = 0 ;
       int c = 0 ;
       int maxc = 0 ;
       for(int i = 0 ; i<s.length() ; i++){
        char ch = s.charAt(i) ;
        if(ch=='(') oc++ ;
        else if(ch==')') cc++ ;
        int a = oc-cc ;
        maxc = Math.max(maxc , a) ;
       }
       return maxc ; }}