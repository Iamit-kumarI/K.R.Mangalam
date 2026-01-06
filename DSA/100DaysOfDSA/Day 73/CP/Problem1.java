package CP;
/*
* Problem:Reverse Sublist (m to n)
* Solution:https://leetcode.com/problems/reverse-linked-list-ii/submissions/1876903488/
*/
public class Problem1 {
    ListNode ListNode=new ListNode();
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }
        ListNode thead = head, newhead = head, tail = head, tailhead = head;
        for (int i = 1; i < left - 1; i++) {
            newhead = newhead.next;
        }
        for (int i = 1; i < right; i++) {
            tail = tail.next;
        }
        //having tailhead for joining after revresing
        tailhead = tail.next;
        //cutting the list for reversing
        tail.next = null;
        ListNode anshead;
        if (left == 1) {
            anshead = revList(head);
            head = anshead;
        } else {
            anshead = revList(newhead.next);
            newhead.next = anshead;
        }
        //joining tail again
        thead = anshead;
        while (thead.next != null) {
            thead = thead.next;
        }
        thead.next = tailhead;
        return head;
    }

    public static ListNode revList(ListNode thead) {
        ListNode prev = null, cur = thead;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
