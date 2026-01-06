package CP;
/*
* Problem:Find Node from End (two-pointer)
* Solution:https://leetcode.com/problems/remove-nth-node-from-end-of-list/solutions/7138121/java-beats-100-on-by-amitk300-7dw0
*/
public class Problem1 {
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
