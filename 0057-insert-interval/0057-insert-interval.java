class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] ans = new int[intervals.length+1][2];
       Boolean inserted = false;
       int x = 0 ;
       for(int i =0 ; i<intervals.length ; i++){
        if(!inserted && newInterval[0]<intervals[i][0]){
            ans[x++] = newInterval ;
            inserted = true ;
        }
        ans[x++] = intervals[i];
       }
       if(!inserted){
        ans[x++] = newInterval ;
       }
       ans = merge(ans);
       return ans ;
        
    }
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
       int[][] res  = new int[intervals.length][2];
       
       int start1 = intervals[0][0];
       int end1 = intervals[0][1];
       int x=0;
       
       for(int i = 1 ; i<intervals.length ; i++){
        int start2 = intervals[i][0];
        int end2 = intervals[i][1];
        if(end1>=start2){ //merge
               start1 = start1 ;
               end1 = Math.max(end2,end1);
               continue;
        }
        res[x][0]=start1 ;
        res[x][1]=end1;
        x++;
        start1 = start2 ;
        end1 = end2 ;
       }
       res[x][0]=start1 ;
       res[x][1]=end1 ;
        return Arrays.copyOf(res,x+1);
    }
}
