public class LinkedListMiddle {

    public static void main(String[] args) {
        // Given the head of a Singly LinkedList, write a method to return the middle node of the LinkedList.
        LinkedListMiddle sol = new LinkedListMiddle();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.println("Middle Node: " + sol.findMiddle(head).val);

        head.next.next.next.next.next = new ListNode(6);
        System.out.println("Middle Node: " + sol.findMiddle(head).val);

        head.next.next.next.next.next.next = new ListNode(7);
        System.out.println("Middle Node: " + sol.findMiddle(head).val);
    }

    public ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static class ListNode {
        int val = 0;
        ListNode next;

        ListNode(int value) {
            this.val = value;
        }
    }
}
