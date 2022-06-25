/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        while(a != null && b!= null){
            a = a.next;
            b = b.next;
        }
        ListNode startA = headA;
        ListNode startB = headB;
        if(a == null){
            while(b != null){
                b = b.next;
                startB = startB.next;
            }
        }else if(b == null){
             while(a != null){
                a = a.next;
                startA = startA.next;
            }
        }else{
            startA = headA;
            startB = headB;
        }
        if(startA == startB){
            return startA;
        }
        
        while(startA != null && startB != null){
            startA = startA.next;
            startB = startB.next;
            if(startA == startB){
                return startA;
            }
        }
        return null;
        
    }
}