public class MergeInBetween {

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int i = 0;
        ListNode previous = null;
        ListNode next = null;
        ListNode current = list1;
        while (i <= b && current != null) {
            if (a - 1 == i) {
                previous = current;
            }
            if (b == i) {
                next = current.next;
            }
            current = current.next;
            i++;
        }
        if (previous == null) {
            return list2;
        } else {
            previous.next = list2;
        }
        while (list2.next != null) {
            list2 = list2.next;
        }
        list2.next = next;
        return list1;
    }
}
