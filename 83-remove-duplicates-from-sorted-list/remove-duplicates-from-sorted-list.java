class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;

        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;  // delete duplicate
            } else {
                head = head.next;  // move only when no deletion
            }
        }

        return temp;
    }
}
