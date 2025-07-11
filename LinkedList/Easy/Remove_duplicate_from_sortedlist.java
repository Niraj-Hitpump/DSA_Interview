
// 83. Remove Duplicates from Sorted List.....

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
 
 /**

// code:-
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null) return null;

        ListNode current=head;
        while(current!=null  &&current.next!=null){
            if(current.val==current.next.val){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }
        }
        return head;
    }
}
