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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode current = dummy;
        
        for(int i = 0; i < n; i++){
            current = current.next;
        }
        
        ListNode start = dummy;
        while(current.next != null){
            current = current.next;
            start = start.next;
        }
        start.next  = start.next.next;
        if(start == dummy){
            head = start.next;
        }
        return head;   
    }
}