import util.ListNode;

import java.util.HashSet;
import java.util.Set;


/**
 * Created by 36249 on 2017/3/5.
 */
public class LinkedListCycle {



    public boolean hasCycle(ListNode head){

        if(head == null){

            return false;
        }

        ListNode ptr1 = head;
        ListNode ptr2 = head;
        while(ptr2.next != null && ptr2.next.next != null){

            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;

            if(ptr1 == ptr2){

                return true;
            }
        }


        return false;
    }
}
