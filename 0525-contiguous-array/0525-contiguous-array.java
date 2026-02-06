class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int cz = 0;
        int co = 0;
        int res = 0;
        for(int i = 0 ; i<nums.length ; i++){
           cz = (nums[i]==0)?cz+1 : cz ;
           co = (nums[i]==1)? co+1 : co;
           int diff  = cz-co;
           if(diff==0){
            res = Math.max(res,i+1);
           }
         if(map.containsKey(diff)){
            int l = i-map.get(diff);
            res= Math.max(res,l);
            
           }
           if(!map.containsKey(diff)) map.put(diff,i);
        }
        return res ;
    }
}