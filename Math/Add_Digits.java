// 258. Add Digits
// Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

// Example 1:
// Input: num = 38
// Output: 2

// Explanation: 
  // The process is
// 38 --> 3 + 8 --> 11
// 11 --> 1 + 1 --> 2 
// Since 2 has only one digit, return it.

// Example 2:
// Input: num = 0
// Output: 0

class Solution {
    public int addDigits(int num) {
        if (num == 0) return 0;
        return 1 + (num - 1) % 9;
    }
}

// Dry Run
    // Dry Run with Examples
    // Example 1: 
    // num = 38
    // Step-by-step Execution:

    // num = 38

    // Applying the formula:
    // 1+(38−1)%9=1+37%9

    // Compute modulus:
    // 37%9=1(since 37÷9=4 remainder 1)

    // Result: 
       // 1+1=2
    

    

