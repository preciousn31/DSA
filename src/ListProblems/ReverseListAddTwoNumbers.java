package ListProblems;

class ListNode {
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
public class ReverseListAddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder number1 = new StringBuilder();
        int carryOver = 0;
        int remainder = 0;
        while (l1 != null || l2 != null) {
            int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carryOver;

            remainder = sum % 10;
            carryOver = sum / 10;
            number1.append(remainder);
            l1 = l1 != null ? l1.next : l1;
            l2 = l2 != null ? l2.next : l2;

        }
        if (carryOver > 0) {
            number1.append(carryOver);
        }


        char[] ch = number1.toString().toCharArray();
        ListNode answerNode = null;
        for (int i = ch.length - 1; i >= 0; i--) {

            answerNode = new ListNode(Character.getNumericValue(ch[i]), answerNode);

        }
        return answerNode;
    }
    public ListNode bestAddTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}