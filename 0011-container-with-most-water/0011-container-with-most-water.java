class Solution {
    public int maxArea(int[] height) {
        int left=0, right=height.length-1;
        int maxArea = 0,currentArea=0;
        int currentWidth=0,currentHeight=0;


        while (left<right){
            currentWidth = right-left;
            currentHeight=Math.min(height[left],height[right]);
            currentArea=currentWidth*currentHeight;
            maxArea=Math.max(maxArea,currentArea);
            
             
           if (height[left]<height[right]){
                left++;
            }
            else if(height[left]==height[right]||height[left]>height[right]){
                right--;
            }
           
        
    }
    return maxArea;
}
}