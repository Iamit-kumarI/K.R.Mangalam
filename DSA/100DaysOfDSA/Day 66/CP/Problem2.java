package CP;
/*
* Problem:Partition List around x
* Solution:https://leetcode.com/problems/partition-list/submissions/1870033382/
*/
public class Problem2 {
    ListNode ListNode=new ListNode();
    public ListNode partition(ListNode head, int x) {
        ListNode thead = head;
        ListNode smaller = new ListNode(0);
        ListNode bigger = new ListNode(0);
        ListNode bpointer = bigger, spointer = smaller;
        while (thead != null) {
            if (thead.val < x) {
                smaller.next = thead;
                smaller = smaller.next;
            } else {
                bigger.next = thead;
                bigger = bigger.next;
            }
            thead = thead.next;
        }
        bigger.next = null;
        smaller.next = bpointer.next;
        return spointer.next;
    }
}
