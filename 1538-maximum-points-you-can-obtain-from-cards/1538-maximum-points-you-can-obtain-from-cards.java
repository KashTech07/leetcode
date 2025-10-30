class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum=0;
        int maxsum=0;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }
         maxsum=sum;
        int idx=cardPoints.length-1;
        for(int j=k-1;j>=0;j--){
            sum=sum-cardPoints[j]+cardPoints[idx];
            maxsum=Math.max(sum,maxsum);
            idx--;
        }
        
        return maxsum;}}