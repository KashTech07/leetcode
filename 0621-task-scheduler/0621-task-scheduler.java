class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26] ;
        for(int i = 0 ; i<tasks.length ; i++){
            int a = tasks[i]-'A' ;
            freq[a]++ ;
        }
        Arrays.sort(freq) ;
        int count = freq[freq.length-1] ;
        int extra = 0 ;
        int j = freq.length-1 ;
        while(j>=0&&freq[j]==count){
            extra++ ;
            j-- ;
        }
        int ans = (count-1)*(n+1) + extra ;
        return ans<tasks.length ? tasks.length : ans ;
        
    }
}