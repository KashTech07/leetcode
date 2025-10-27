class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target)
               return new int[]{i,j}; 
            }
        } return new int[]{-1,-1};
    }
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int[] arr= new int[5];
    int n=sc.nextInt();
    Solution sol=new Solution();
    int[] result = sol.twoSum(arr,n);
    System.out.print(Arrays.toString(result));
    
    }
}