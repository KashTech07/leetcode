class Solution {
    public int maxDepth(String s) {
        int c = 0 ;
        int maxcount = 0 ;
        int open = 0 ;
        int close = 0;
        for(char ch: s.toCharArray()){
            if(ch=='(') open++;
            else if(ch==')') close++;
            c = (open-close) ;
            maxcount = Math.max(c , maxcount) ;
        }
        return maxcount ;}}