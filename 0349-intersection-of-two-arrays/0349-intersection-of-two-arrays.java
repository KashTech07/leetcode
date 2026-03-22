class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
     HashSet<Integer> arr1=new HashSet<>();
     HashSet<Integer> arr2=new HashSet<>();
     for(int i=0;i<nums1.length;i++){
        arr1.add(nums1[i]);
     }   
     for(int i=0;i<nums2.length;i++){
        arr2.add(nums2[i]);
     }   
     arr1.retainAll(arr2);
     int[] result=new int[arr1.size()];
     int j=0;
     for(int num : arr1){
        result[j++]=num;
     }
     return result;}}
     