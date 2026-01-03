package CP;
/*
* Problem:Rotate Right by K Places (alt)
* Solution:https://leetcode.com/problems/rotate-list/solutions/7440907/java-mod-beats-100-by-amitk300-4j0w
*/
public class Problem2 {
    ListNode ListNode=new ListNode();
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode thead = head;
        int len = 1;
        while (thead.next != null) {
            len++;
            thead = thead.next;
        }
        ListNode lastNode = thead;;
        k %= len;
        if (k == 0) {
            return head;
        }
        thead = head;
        for (int i = 1; i < len - k; i++) {
            thead = thead.next;
        }
        ListNode newHead = thead.next;
        thead.next = null;
        lastNode.next = head;
        return newHead;
    }
}
