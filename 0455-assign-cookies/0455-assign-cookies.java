class Solution {
    public int findContentChildren(int[] g, int[] s) {
      Arrays.sort(g);
      Arrays.sort(s);
      int i = 0 ; 
      int j = 0;
      int maxsum = 0;
      while(i<g.length && j<s.length){
        if(g[i]<=s[j]){
            maxsum++;
            j++;
            i++;
        }
        else{
            j++;
        }
      }
      return maxsum ;  
    }
}