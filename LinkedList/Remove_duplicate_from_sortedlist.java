// 83. Remove Duplicates from Sorted List

// Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

// Input: head = [1,1,2,3,3]
// Output: [1,2,3]

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//  import java.util.*;
// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
//         LinkedHashSet<Integer> list = new  LinkedHashSet<>();
//         ListNode temp = head; // Start from the head node

//         // Traverse the linked list and add each node's value to ArrayList
//         while (temp != null) {
//             list.add(temp.val);
//             temp = temp.next;
//         }

//         ListNode dummy = new ListNode(0);
//         ListNode current = dummy;
        
//         for(int val : list){

//             current.next = new ListNode(val);
//             current = current.next;
//         }

//         return dummy.next;
//     }
//     }

