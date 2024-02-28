import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        int k = lists.length;
        Queue<ListNode> queue = new PriorityQueue<ListNode>(Comparator.comparingInt(node -> node.val));

        for (ListNode node : lists) {
            if (node != null) {
                queue.offer(node);
            }
        }
        ListNode head = new ListNode(0);
        ListNode previous = head;

        while (!queue.isEmpty()) {
            previous.next = queue.poll();
            previous = previous.next;
            if (previous.next != null) {
                queue.add(previous.next);
            }
        }
        return head.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
