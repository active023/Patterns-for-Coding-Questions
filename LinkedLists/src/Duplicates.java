public class Duplicates {

    //LC83
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode right = head.next;
        ListNode left = head;

        while (right!=null){
            if (right.val != left.val) {
                left.next = right;
                left = right;
            }
            right= right.next;
        }
      left.next = null;
      return head;
    }
}
