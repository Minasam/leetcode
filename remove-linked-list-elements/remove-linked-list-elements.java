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
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = new ListNode();
        prev.next = head;
        ListNode dummy = prev;
        ListNode current = head;
        while(current != null){
            if(current.val == val){
                prev.next = current.next;
            }else{
                prev = prev.next;
            }
            current = current.next;
            
        }
        return dummy.next;
    }
}