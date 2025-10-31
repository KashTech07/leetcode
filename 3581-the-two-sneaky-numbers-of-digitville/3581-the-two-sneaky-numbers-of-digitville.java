class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int j=0;
        Arrays.sort(nums);
        int[] res = new int[2];
     for(int i=0;i<nums.length-1;i++){
        if(nums[i]!=nums[i+1]){
            continue;
        }
        else{
            res[j]=nums[i];
            j++;
        }
     }
     return res;}}