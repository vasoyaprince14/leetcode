/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

        int l = len(head);
        if(l == -1){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;

        while(l!=0){
            fast = fast.next;
            l--;
        }
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public int len(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        int len = -1;
        while(fast!= null && fast.next !=null){
            fast= fast.next.next;
            slow = slow.next;
            if(fast==slow){
                break;
            }
        }
        if(fast == null || fast.next == null){
            return -1;
        }
        len = 1;
        fast= fast.next;
        while(slow !=fast){
            fast=fast.next;
            len++;
        }
        return len;
    }
}