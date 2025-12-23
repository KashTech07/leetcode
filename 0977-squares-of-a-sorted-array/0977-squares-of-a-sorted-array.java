class Solution {
    public int[] sortedSquares(int[] nums) {
       ArrayList<Integer> a = new ArrayList<>();
       ArrayList<Integer> b = new ArrayList<>();
       int[] ans = new int[nums.length];
       for(int n : nums){
        if(n<0){
            a.add(n);
        }
        else{
            b.add(n);
        }
       }
       if(a.size()==0){
        for(int i =0 ;i<nums.length ; i++){
            ans[i]=nums[i]*nums[i];
        }
       }
       else if(b.size()==0){
        for(int i =0 ;i<nums.length ; i++){
            ans[i]=nums[i]*nums[i];
        }
        Arrays.sort(ans);
       } 
       else{
        Collections.reverse(a);
        int i =0;
        int j =0;
        int x=0 ;
        while(i<a.size()&&j<b.size()){
            if (Math.abs(a.get(i)) < b.get(j))
{
                int val = a.get(i);
                ans[x++]=val*val;
                i++;
            }
            else{
                int val = b.get(j);
                ans[x++]=val*val;
                j++;
            }
        }
        while(i<a.size()){
          int val = a.get(i);
                ans[x++]=val*val;
                i++; 
        }
         while(j<b.size()){
           int val = b.get(j);
                ans[x++]=val*val;
                j++;
         }
       }
       return ans;
    }
}