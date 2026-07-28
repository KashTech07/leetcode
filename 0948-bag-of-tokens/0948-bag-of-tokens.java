class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens) ;
        int ans = 0 ;
        int j = tokens.length-1 ;
        int i = 0 ;
        int score = 0;
        while(i<=j){
            if(power>=tokens[i]){
                power-=tokens[i] ;
                score++ ;
                i++;
                ans = Math.max(ans, score) ;
            }
            else if(score>=1){
                    power+=tokens[j] ;
                    score-- ;
                    j-- ;
                }
                else return ans ;
            }
            return ans ;
        }
    
}