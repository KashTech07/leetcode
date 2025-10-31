class Solution {
    public int minimumRecolors(String blocks, int k) {
        int mincount=Integer.MAX_VALUE;
       
    //    for(int i=0;i<blocks.length()-k;i++){
    //     int c=0;
    //     for(int j=i;j<i+k;j++){
    //         if(blocks.charAt(i)!='B'){
    //             break;
    //         }
    //         else{
    //             c++;
    //         }
    //     }
    //     if(c>=k){
    //         return 0;
    //     }
    //    }
       for(int i=0;i<=blocks.length()-k;i++){
        int c=0;
        for(int j=i;j<i+k;j++){
            if(blocks.charAt(j)!='B'){
                c++;
                }
            }
        mincount=Math.min(mincount,c);
        
       }
       return mincount;}}