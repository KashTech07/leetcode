class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        final int MOD = 1_000_000_007;
        int l=0;
        int r=nums.length-1;
        int count=0;
        int[] power = new int[nums.length];
        power[0]=1;
        for(int i=1;i<power.length;i++){
            power[i]=(int)(power[i-1]*2 % MOD) ;
        }
        while(l<=r){
            if(nums[l]+nums[r]<=target){
                count= (count + power[r-l]) % MOD ;
                l++;
            }
            else{
                r--;
            }
        }
        return count;
    }
}