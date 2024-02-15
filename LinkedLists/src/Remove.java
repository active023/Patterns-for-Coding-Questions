public class Remove {
   //LC203
    public ListNode removeElements(ListNode head, int val) {
        ListNode current = head;
        ListNode previous = null;
        while(current !=null){
            if(current.val==val) {
                if(current==head){
                    head = current.next;
                } else {
                    previous.next = current.next;
                }
            } else {
                previous = current;
            }
            current = current.next;
        }
      return head;
    }
}
