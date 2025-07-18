// Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
// You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

 
// Example 1:
// Input: nums = [1,2,0]
// Output: 3
// Explanation: The numbers in the range [1,2] are all in the array.

// Example 2:
// Input: nums = [3,4,-1,1]
// Output: 2
// Explanation: 1 is in the array but 2 is missing.


class Solution {
    public int firstMissingPositive(int[] nums) {
        int missingNumber=1;
        Arrays.sort(nums);
        for(int number:nums){
            if(number>0){
                if(number==missingNumber){
                    missingNumber++;
                }
                else if(number>missingNumber){
                    break;
                }
            }
        }
            return missingNumber;
    }
}