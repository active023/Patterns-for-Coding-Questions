public class ReorderList {

    public void reorderList(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;

        ListNode l2 = reverse(slow);

        merge(head, l2);

    }

    private void merge(ListNode l1, ListNode l2) {
        while (l1 != null) {
            ListNode n1 = l1.next;
            ListNode n2 = l2.next;
            l1.next = l2;
            if (n1 == null) {
                break;
            }
            l2.next = n1;
            l1 = n1;
            l2 = n2;
        }
    }

    private ListNode reverse(ListNode slow) {
        ListNode previous = null;
        while (slow != null) {
            previous = slow;
            ListNode tmp = slow.next;
            slow.next = previous;
            slow = tmp;
        }
        return previous;
    }

}
