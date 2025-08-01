// Reverse String

// Write a function that reverses a string. The input string is given as an array of characters s.
// You must do this by modifying the input array in-place with O(1) extra memory.

 
// Example 1:
// Input: s = ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]

// code:-
// class Solution {
//     public void reverseString(char[] s) {
//         int left=0; int right=s.length-1;
//         while(left<right){
//             char temp=s[right];
//             s[right]=s[left];
//             s[left]=temp;
//             left++;
//             right--;
//         }
//     }
// }




import java.util.Arrays;

class Solution {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
    }
}
