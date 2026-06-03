class Solution {
    public int[] twoSum(int[] numbers, int target) {
    //     int[] result = new int[2];
    //  int i = 0;
    //  int j = numbers.length-1;
    //  while(i!=j){
    //     if(numbers[i]+numbers[j]==target){
    //         result[0]=i+1;
    //         result[1]=j+1;
    //         return result;
    //     }
    //     else if(numbers[i]+numbers[j]>target){
    //         j--;
    //     }
    //     else{
    //         i++;
    //     }
    //  }
    //  return new int[]{-1,-1};}}
    int i = 0 ; 
    int j = numbers.length-1 ;
    while(i<j){
        int sum = numbers[i]+numbers[j] ;
        if(sum==target){
            return new int[]{i+1,j+1} ;
        }
        else if(sum>target){
            j-- ;
        }
        else{
            i++;
        }
    }
    return new int[]{-1,-1} ;}}
            