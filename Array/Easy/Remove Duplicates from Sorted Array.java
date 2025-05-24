// Remove Duplicates from Sorted Array.

// Example 1:

// Input: nums = [1,1,2]
// Output: 2, nums = [1,2,_]
// Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
// It does not matter what you leave beyond the returned k (hence they are underscores).

// code:
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // Edge case
        
        int i = 0; // Pointer for placing unique elements
        
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) { // Found a new unique element
                i++; 
                nums[i] = nums[j]; // Place it at the next unique position
            }
        }
        return i + 1; // Number of unique elements
    }
}

// Time Complexity: O(n), where n is the length of the array.
// Space Complexity: O(1), since we are modifying the array in place.
