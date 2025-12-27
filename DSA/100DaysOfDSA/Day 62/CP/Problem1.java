/*
* Problem:Reorder Linked List
* Solution:https://leetcode.com/problems/reorder-list/submissions/1866288279/
*/
public class Problem1 {
    ListNode ListNode=new ListNode();
    public void reorderList(ListNode head) {
        ListNode thead=head,slow=head,fast=head;;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        // slow=(fast==null)?revList(slow):revList(slow.next);
        ListNode mid=revList(slow.next);
        slow.next=null;
        thead=head;
        while(mid!=null){
            ListNode next=thead.next;
            ListNode midnext=mid.next;
            thead.next=mid;
            mid.next=next;
            thead=next;
            mid=midnext;
        }
    }
    public ListNode revList(ListNode thead){
        ListNode prev=null,cur=thead;
        while(cur!=null){
            ListNode next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
}