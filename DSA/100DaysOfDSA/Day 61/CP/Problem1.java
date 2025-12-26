package CP;
/*
* Problem:Remove Duplicates from Sorted List
* Solution:https://leetcode.com/problems/remove-duplicates-from-sorted-list/solutions/7440887/java-node-beats-100-by-amitk300-7dr4
*/
public class Problem1 {
    ListNode ListNode=new ListNode();
    public ListNode deleteDuplicates(ListNode head) {
        ListNode thead = head, last = head;;
        int prev = 0;
        while (thead != null) {
            last = thead;
            prev = thead.val;
            while (thead != null && thead.val == prev) {
                thead = thead.next;
            }
            last.next = thead;
            if (thead != null) {
                prev = thead.val;
            }
            last = last.next;
        }
        return head;
    }
}
