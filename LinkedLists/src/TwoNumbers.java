public class TwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode l1Reverse = reverse(l1);
        ListNode l2Reverse = reverse(l2);
        int carry = 0;
        ListNode l1Idx = l1Reverse;
        ListNode l2Idx = l2Reverse;

        ListNode result = null;
        while (l1Idx != null && l2Idx != null) {
            int base = (carry + (l1Idx.val + l2Idx.val)) % 10;
            carry = (carry + (l1Idx.val + l2Idx.val)) / 10;
            if (result == null) {
                result = new ListNode(base, null);
            } else {
                result = new ListNode(base, result);

            }
            l1Idx = l1Idx.next;
            l2Idx = l2Idx.next;
        }

        while (l1Idx != null) {
            int base = (carry + l1Idx.val) % 10;
            carry = (carry + l1Idx.val) / 10;
            if (result == null) {
                result = new ListNode(base, null);
            } else {

                result = new ListNode(base, result);

            }
            l1Idx = l1Idx.next;
        }

        while (l2Idx != null) {
            int base = (carry + l2Idx.val) % 10;
            carry = (carry + l2Idx.val) / 10;
            if (result == null) {
                result = new ListNode(base, null);
            } else {
                result = new ListNode(base, result);

            }
            l2Idx = l2Idx.next;
        }

        if (carry > 0) {
            result = new ListNode(carry, result);
        }
        return reverse(result);
    }

    public ListNode reverse(ListNode l1) {
        ListNode current = l1;
        ListNode prev = null;

        while (current != null) {
            ListNode tmp = current.next;
            current.next = prev;
            prev = current;
            current = tmp;
        }
        return prev;
    }
}
