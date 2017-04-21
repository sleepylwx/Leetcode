/**
 * Created by 36249 on 2017/1/13.
 */
public class RemoveDuplicatesFromSortedList {


    public ListNode deleteDuplicates(ListNode head){


        if(head == null){

            return null;
        }
        ListNode cur = head;
        int value = head.val;
        while(cur != null && cur.next != null){


            if(cur.next.val == value){

                cur.next = cur.next.next;
            }
            else{
                cur = cur.next;
                value = cur.val;
            }
        }

        return head;
    }

    private class ListNode{

        int val;
        ListNode next;
        ListNode(int x){

            val = x;
        }
    }
}
