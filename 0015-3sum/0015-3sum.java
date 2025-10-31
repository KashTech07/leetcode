class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> outer=new ArrayList<>();
        Arrays.sort(nums);
        for(int i =0;i<nums.length-2;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int j=i+1;
            int k=nums.length-1;
        while(j<k){
            ArrayList<Integer> internal= new ArrayList<>();
            if(nums[i]+nums[j]+nums[k]>0){
                k--;
            }
            else if(nums[i]+nums[j]+nums[k]<0){
                j++;
            }
            else{
              outer.add(Arrays.asList(nums[i],nums[j],nums[k]));
              k--;
              j++;
              while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
            while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }  
            }
        }
        
    }
    return outer;}
}