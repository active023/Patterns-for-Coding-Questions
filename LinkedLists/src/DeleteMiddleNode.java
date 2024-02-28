public class DeleteMiddleNode {

    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode previous = null;

        if (slow == null || slow.next == null) {
            return previous;

        }

        while (fast != null && fast.next != null) {
            previous = slow;
            slow = slow.next;
            fast = fast.next.next;

        }

        previous.next = slow.next;
        return head;

    }
}
