package CP;
/*
* Problem:Remove Nth Node From End of List
* Solution:https://leetcode.com/problems/remove-nth-node-from-end-of-list/submissions/1867224422/
*/
public class Problem1 {
    ListNode ListNode=new ListNode();
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode thead = head;
        while (thead != null) {
            len++;
            thead = thead.next;
        }
        if (n == len) {
            return head.next;
        }
        thead = head;
        for (int i = 0; i < len - n - 1; i++) {
            thead = thead.next;
        }
        thead.next = thead.next.next;
        return head;
    }
}
