public class ReorderList {


    public void reorderList(ListNode head) {
        if (head.next == null) {
            return;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode previous = null;

        while (fast != null && fast.next != null) {
            previous = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode l2 = previous.next;
        previous.next = null;

        l2 = reverseList(l2);

        mergeLists(head, l2);

    }

    private void mergeLists(ListNode l1, ListNode l2) {
        while (l2 != null && l1 != null) {
            ListNode tmp1 = l1.next;
            ListNode tmp2 = l2.next;
            l1.next = l2;
            if (tmp1 == null) {
                break;
            } else {
                l2.next = tmp1;
            }
            l2 = tmp2;
            l1 = tmp1;
        }


    }

    private ListNode reverseList(ListNode l2) {

        ListNode previous = null;
        ListNode current = l2;

        while (current != null) {
            ListNode tmp = current.next;
            current.next = previous;
            previous = current;
            current = tmp;
        }

        return previous;
    }
}
