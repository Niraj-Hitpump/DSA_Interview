// 42. Trapping Rain Water
// Your task is to find the water that can be trapped after rain.

// Input: height = [0,1,0,2,1,0,1,3,2,1,2,1].
// Output: 6

// Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1].
// In this case, 6 units of rain water (blue section) are being trapped.
 
// Code:-
class Solution {
    public int trap(int[] height) {
    int left=0;
    int right=height.length-1;
    int leftMax=0;
    int rightMax=0;
    int trappedWater=0;
    while(left<right){
        if(height[left]<height[right]){
            leftMax=Math.max(leftMax,height[left]);
            trappedWater+=leftMax-height[left];
            left++;
        }else{
            rightMax=Math.max(rightMax,height[right]);
            trappedWater+=rightMax-height[right];
            right--;
        }
    }
    return trappedWater;
    }
}
