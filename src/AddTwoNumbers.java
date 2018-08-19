import util.ListNode;

public class AddTwoNumbers {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        int forward = 0;
        ListNode current = null;
        ListNode head = null;
        while(l1!=null || l2 != null || forward > 0){

            int leftValue = l1 == null?0:l1.val;
            int rightValue = l2 == null?0:l2.val;
            int res = (leftValue+rightValue+forward);
            if(current == null){

                current = new ListNode(res%10);
                head = current;
            }
            else{

                current.next = new ListNode(res%10);
                current = current.next;
            }

            forward = res/10;

            l1 = l1 ==null?null:l1.next;
            l2 = l2 == null?null:l2.next;

        }

        return head;
    }


}
