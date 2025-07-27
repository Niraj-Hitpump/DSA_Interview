// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
// Note that you must do this in-place without making a copy of the array.

// Example 1:
// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]

// Example 2:
// Input: nums = [0]
// Output: [0]


// this solution valid like move zeroes to last or any number to last for this we can replace 0 with particular no.
class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;//stores the current value
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                if(i!=j){
                    // swap
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
                    j++;
            }
        }
    }
}
