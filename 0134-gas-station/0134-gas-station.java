class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int ans = 0 ;
        int totalgas = 0;
        int totalcost = 0 ;
        int tank = 0 ;
        for(int i = 0 ; i <gas.length ; i++){
             tank = tank+gas[i]-cost[i] ;
             totalcost+=cost[i] ;
             totalgas +=gas[i] ;
             if(tank<0) {
                tank = 0 ;
                ans = i+1 ;
             }
        }
        if(totalgas<totalcost) return -1 ;
        return ans ;
    }
}