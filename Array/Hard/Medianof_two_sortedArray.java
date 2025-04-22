// Median of Two Sorted Arrays

// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

// The overall run time complexity should be O(log (m+n)).

 

// Example 1:
// Input: nums1 = [1,3], nums2 = [2]
// Output: 2.00000
// Explanation: merged array = [1,2,3] and median is 2.

// Example 2:

// Input: nums1 = [1,2], nums2 = [3,4]
// Output: 2.50000
// Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;
        int mid = total / 2;

        int[] mergedArr = mergedArray(nums1, nums2, mid);
        
        if (total % 2 != 0) {
            return (double) mergedArr[mid];
        } else {
            return (mergedArr[mid] + mergedArr[mid - 1]) / 2.0;
        }
    }

    private int[] mergedArray(int[] n1, int[] n2, int mid) {
        int[] merged = new int[mid + 1];
        int ptr1 = 0, ptr2 = 0, ptr3 = 0;

        while (ptr1 < n1.length && ptr2 < n2.length && ptr3 <= mid) {
            if (n1[ptr1] < n2[ptr2]) {
                merged[ptr3++] = n1[ptr1++];
            } else {
                merged[ptr3++] = n2[ptr2++];
            }
        }

        while (ptr1 < n1.length && ptr3 <= mid) {
            merged[ptr3++] = n1[ptr1++];
        }

        while (ptr2 < n2.length && ptr3 <= mid) {
            merged[ptr3++] = n2[ptr2++];
        }

        return merged;
    }
}
