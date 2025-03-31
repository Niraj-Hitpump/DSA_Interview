// 33. Search in Rotated Sorted Array

// Example 1:

// Input: nums = [4,5,6,7,0,1,2], target = 0
// Output: 4
// Example 2:

// Input: nums = [4,5,6,7,0,1,2], target = 3
// Output: -1

class Solution {
    public int search(int[] nums, int target) {
        int st = 0, end = nums.length - 1;
        
        while (st <= end) {
            int mid = st + (end - st) / 2;
            
            if (nums[mid] == target) return mid;       

            // Left sorted
            if (nums[st] <= nums[mid]) {
                if (nums[st] <= target && target <= nums[mid]) {
                    // Left
                    end = mid - 1;
                } else {
                    // Right
                    st = mid + 1;
                }
            } 
            // Right sorted
            else {
                if (nums[mid] <= target && target <= nums[end]) {
                    // Right
                    st = mid + 1;
                } else {
                    // Left
                    end = mid - 1;
                }
            }
        }
        
        return -1; // Target not found
    }
}
