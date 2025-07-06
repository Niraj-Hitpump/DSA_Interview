//  Find Greatest Common Divisor of Array
// HCF
// Euclid's Algorithm

Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.
The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.
    
Example 1:
Input: nums = [2,5,6,9,10]
Output: 2
Explanation:
The smallest number in nums is 2.
The largest number in nums is 10.
The greatest common divisor of 2 and 10 is 2.
    
class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        return gcd(min, max);
    }

    // EUCLID ALGORITHM
    private int gcd(int a, int b) {
        while(a > 0 && b > 0){
            if(a > b){
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return (a == 0) ? b : a;
    }
}

