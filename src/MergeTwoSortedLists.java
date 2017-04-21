import util.ListNode;

import java.util.List;

/**
 * Created by 36249 on 2017/1/19.
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1,ListNode l2){
        if(l1 == null){

            return l2;
        }
        if(l2 == null){

            return l1;
        }
        ListNode head;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        if(l1.val > l2.val){

            head = l2;
            temp2 = l2.next;
        }
        else{
            head = l1;
            temp1 = l1.next;
        }
        ListNode cur = head;

        while(temp1 != null && temp2 != null){

            if(temp1.val > temp2.val){

                cur.next = temp2;
                cur = cur.next;
                temp2 = temp2.next;
            }
            else{

                cur.next = temp1;
                cur = cur.next;
                temp1 = temp1.next;
            }
        }
        if(temp1 == null){

            cur.next =temp2;
        }
        else if(temp2 == null){

            cur.next = temp1;
        }

        return head;
    }

    public ListNode mergeTwoLists0(ListNode l1,ListNode l2){

        if(l1 == null){

            return l2;
        }
        if(l2 == null){

            return l1;
        }

        if(l1.val > l2.val){

            l2.next = mergeTwoLists0(l1,l2.next);
            return l2;
        }
        else{

            l1.next = mergeTwoLists0(l1.next,l2);
            return l1;
        }
    }
}
