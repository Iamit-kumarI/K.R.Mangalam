package CP;
/*
* Problem:Insertion Sort List (linked list)
* Solution:https://leetcode.com/problems/insertion-sort-list/solutions/7452626/java-arraylist-linkedlist-beats-100-by-a-bg3z
*/
import java.util.ArrayList;

public class Problem1 {
    ListNode ListNode =new ListNode();
    public ListNode insertionSortList(ListNode head) {
        // I don't know how to do this insertion way but here is the  sorting way
        // we don't have prev value so we can't have track of next next smaller element how can we do that
        ArrayList<Integer>list=new ArrayList<>();
        ListNode thead=head;
        while(thead!=null){
            list.add(thead.val);
            thead=thead.next;
        }
        list.sort(null);
        thead=head;
        int index=0;
        while(thead!=null){
            thead.val=list.get(index++);
            thead=thead.next;
        }
        return head;
    }
}
