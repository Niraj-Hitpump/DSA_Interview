// Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.

 

// Example 1:
// Input: heights = [2,1,5,6,2,3]
// Output: 10
// Explanation: The above is a histogram where width of each bar is 1.
// The largest rectangle is shown in the red area, which has an area = 10 units.

import java.util.*;

class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int [] left=new int[n];
        int [] right=new int[n];

    // calculate NSL
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
            left[i]=stack.isEmpty() ? -1:stack.peek();
            stack.push(i);
        }
        stack.clear();

        // calculate NSR
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
            right[i]=stack.isEmpty() ? n :stack.peek();
            stack.push(i);
        }

        int maxArea=0;
        for(int i=0;i<n;i++){
            int width=right[i]-left[i]-1;
            int Area=heights[i]* width;
            maxArea=Math.max(maxArea,Area);
        }
        return maxArea;
    }
}