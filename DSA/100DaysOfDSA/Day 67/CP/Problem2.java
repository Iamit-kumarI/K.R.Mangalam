package CP;

import java.util.PriorityQueue;

/*
* Problem:Sort List (merge sort linked list)
* Solution:https://leetcode.com/problems/sort-list/submissions/1870989114/
*/ 
public class Problem2 {
    ListNode ListNode=new ListNode();
    public ListNode sortList(ListNode head) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        ListNode thead = head;
        ListNode nhead = new ListNode(0);
        ListNode ans = nhead;
        while (thead != null) {
            pq.add(thead);
            thead = thead.next;
        }
        while (!pq.isEmpty()) {
            nhead.next = pq.poll();
            nhead = nhead.next;
        }
        nhead.next = null;
        return ans.next;
    }
}
