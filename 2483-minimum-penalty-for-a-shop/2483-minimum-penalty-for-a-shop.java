class Solution {
    public int bestClosingTime(String customers) {
        int p = 0;
        for(char c : customers.toCharArray()){
          if(c== 'Y'){
            p++;
          }
        }
        int minPenalty = p;
        int bestTime = 0;
        for(int j = 0 ;j<customers.length() ; j++){
            char c = customers.charAt(j);
            if(c == 'Y'){
                p--;
            }
            else{
                p++;
            }
            if(minPenalty>p){
                minPenalty = p;
                bestTime = j+1;
            }

        }
        return bestTime;}}