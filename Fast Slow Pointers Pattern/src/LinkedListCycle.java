public class LinkedListCycle {

    // Given the head of a Singly LinkedList, write a function to determine if the LinkedList has a cycle in it or not.

    public static void main(String[] args) {
        LinkedListCycle sol = new LinkedListCycle();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        System.out.println("LinkedList has cycle: " + sol.hasCycle(head));

        head.next.next.next.next.next.next = head.next.next; // Creating a cycle by connecting the last node to the third node.
        System.out.println("LinkedList has cycle: " + sol.hasCycle(head));

    }

    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    static class ListNode {
        int val = 0;
        ListNode next;

        ListNode(int value) {
            this.val = value;
        }
    }
}
