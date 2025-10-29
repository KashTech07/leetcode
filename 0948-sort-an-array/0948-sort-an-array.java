class Solution {
    public int[] sortArray(int[] nums) {
        int start=0;
        int end=nums.length-1;
        divide(nums,start,end);
        return nums;
        
    }
    public void divide(int[] arr, int start,int end){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
       divide(arr,start,mid);
       divide(arr,mid+1,end);
       conquer(arr,start,end,mid);
    }
    public void conquer(int[] arr,int start,int end,int mid){
        int[] merged=new int[end - start + 1];
        int idx1=start;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid&&idx2<=end){
            if(arr[idx1]<=arr[idx2]){
                merged[x++]=arr[idx1++];
            }
            else{
                merged[x++]=arr[idx2++];
            }
        }
        while(idx1<=mid){
            merged[x++]=arr[idx1++];
        }
        while(idx2<=end){
            merged[x++]=arr[idx2++];
        }
        for(int i=0;i<merged.length;i++){
            arr[start+i]=merged[i];

    }
}}