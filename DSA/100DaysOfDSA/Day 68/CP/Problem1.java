package CP;
/*
* Problem:Split Linked List in Parts
* Solution:https://leetcode.com/problems/split-linked-list-in-parts/submissions/1872265044/
*/
public class Problem1 {
    ListNode ListNode=new ListNode();
    public ListNode[] splitListToParts(ListNode head, int k) {//help taken
        ListNode[] list = new ListNode[k];
        ListNode thead = head;
        int len = 0;
        while (thead != null) {
            len++;
            thead = thead.next;
        }
        int size = len / k, leftover = len % k;
        thead = head;
        for (int i = 0; i < k; i++) {
            list[i] = thead;
            int extra = size + (leftover-- > 0 ? 1 : 0);
            for (int j = 1; j < extra && thead != null; j++) {
                thead = thead.next;
            }
            if (thead != null) {
                ListNode next = thead.next;
                thead.next = null;
                thead = next;
            }
        }
        return list;
    }
}
