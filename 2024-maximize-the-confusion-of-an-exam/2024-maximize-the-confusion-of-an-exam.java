class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int ct = 0 ;
        int cf = 0;
        int j = 0 ;
        int ans1 = Integer.MIN_VALUE ;
        int ans2 = Integer.MIN_VALUE ;
        for(int i = 0 ; i<answerKey.length() ; i++){
            char c = answerKey.charAt(i) ;
            if(c=='T') ct++ ;
            while(ct>k) {
                if(answerKey.charAt(j)=='T') ct-- ;
                j++ ;
            }
            ans1 = Math.max(ans1 , i-j+1) ;
        }
        j = 0 ;
        for(int i = 0 ; i<answerKey.length() ; i++){
            char c = answerKey.charAt(i) ;
            if(c =='F') cf++ ;
            while(cf>k) {
                if(answerKey.charAt(j)=='F') cf-- ;
                j++ ;
            }
            ans2 = Math.max(ans2 , i-j+1) ;
        }
        return Math.max(ans1 , ans2) ;
    }
}