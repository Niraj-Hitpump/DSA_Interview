//  Find Greatest Common Divisor of Array
// HCF
// Euclid's Algorithm

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

