package CP;
/*
* Problem:237. Delete Node in a Linked List
* Solution:https://leetcode.com/problems/remove-linked-list-elements/submissions/1873967817/
*/
public class Problem1 {
    ListNode ListNode=new ListNode();
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode thead = head, prev = head;
        while (thead != null) {
            prev = thead;
            if (thead.next != null && thead.next.val == val) {
                prev.next = thead.next.next;
                // prev=prev.next;
                continue;
            }
            thead = thead.next;
        }
        return head;
    }
}
