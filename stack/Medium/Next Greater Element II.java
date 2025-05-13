// Given a circular integer array nums (i.e., the next element of nums[nums.length - 1] is nums[0]), return the next greater number for every element in nums.

// The next greater number of a number x is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, return -1 for this number.

 

// Example 1:

// Input: nums = [1,2,1]
// Output: [2,-1,2]
// Explanation: The first 1's next greater number is 2; 
// The number 2 can't find next greater number. 
// The second 1's next greater number needs to search circularly, which is also 2.


// Code:-
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int [] result=new int[n];
        Stack <Integer> stack=new Stack<>();
     
        Arrays.fill(result,-1);

        for(int i=2*n-1; i>=0;i--){
            int index=i%n;

            while(!stack.isEmpty() && stack.peek()<=nums[index]){
                stack.pop();
            }
            if(i<n){
                result[index]=stack.isEmpty() ? -1 :stack.peek();
            }
            stack.push(nums[index]);
        }
        return result;
    }
}
