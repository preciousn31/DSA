

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class IterativeReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode previousNode = null;
        while(head != null){
            ListNode newNode = new ListNode(head.val, previousNode);
            previousNode = newNode;
            head = head.next;
        }
        return previousNode;
    }
}
