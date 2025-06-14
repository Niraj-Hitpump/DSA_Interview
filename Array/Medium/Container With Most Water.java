// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

// Find two lines that together with the x-axis form a container, such that the container contains the most water.
// Return the maximum amount of water a container can store.
// Notice that you may not slant the container.

// Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49
// Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

class Solution {
    public int maxArea(int[] height) {
        if (height == null || height.length < 2) {
        return 0; // or throw IllegalArgumentException
        }
        int i=0; int j=height.length-1;
        int max_water=0;
        while(i<j){
            int width=j-i;
            int h=Math.min(height[i],height[j]);
            int curr_water=width*h;
            max_water=Math.max(max_water,curr_water);

            // move the pointer to the shorter side;
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max_water;
    }
}