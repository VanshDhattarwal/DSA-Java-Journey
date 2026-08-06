class Solution {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        while(left<right){
            int width = right -left;
            int waterHeight = Math.min(height[right],height[left]);
            int Area = width * waterHeight;
            maxArea = Math.max(Area , maxArea);

            if(height[left]<height[right]){
            left++;
        }else{
            right--;
        }
        } 
        return maxArea;
    }
}
