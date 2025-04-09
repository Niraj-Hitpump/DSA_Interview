// 53. Maximum Subarray.

// Kandane's Algorithm
// Kadane's Algorithm is a dynamic programming technique used to efficiently find the maximum sum of a contiguous subarray within a given array of numbers, solving the maximum subarray problem in linear time complexity (O(n)). It is also known as the maximum sum subsequence problem.

// Given an integer array nums, find the subarray with the largest sum, and return its sum.

 
// Example 1:

//     Input:nums = [-2,1,-3,4,-1,2,1,-5,4]
//     Output: 6
//     Explanation: The subarray [4,-1,2,1] has the largest sum 6.

// Example 2:
//     Input: nums = [1]
//     Output: 1
//     Explanation: The subarray [1] has the largest sum 1.

// Code:-

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
            maxSum=Math.max(currSum,maxSum);
            if(currSum<0){
                currSum=0;
            }
        }
        return maxSum;
    }
}

