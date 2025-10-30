class Solution {
    public int maxArea(int[] height) {
       int left=0;
       int right=height.length-1;
       int maxarea=0;
       while(right>left){
        int length=Math.min(height[left],height[right]);
        int area=length*(right-left);
        maxarea=Math.max(maxarea,area);
        if(height[left]<height[right]){
            left++;
        }
        else{
            right--;
        }
       } 
       return maxarea;
    }
}