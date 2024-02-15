public class RemoveNthNode {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode left = head;
        ListNode right = head;

        while(n>0){
            right = right.next;
            n--;
        }
        ListNode previous = null;
        while(right!=null){
            previous = left;
            left= left.next;
            right= right.next;
        }

        if(previous!=null){
            previous.next = left.next;
        } else{
            head = left.next;
        }

      return head;
    }
}
