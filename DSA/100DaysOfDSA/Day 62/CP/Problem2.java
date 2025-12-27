package CP;
import java.util.HashSet;
import java.util.Set;

/*
* Problem:Intersection of Two Linked Lists
* Solution:https://leetcode.com/problems/intersection-of-two-linked-lists/submissions/1866293591/
*/

public class Problem2 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode thead = headA;
        while (thead != null) {
            set.add(thead);
            thead = thead.next;
        }
        thead = headB;
        while (thead != null) {
            if (set.contains(thead)) {
                return thead;
            }
            thead = thead.next;
        }
        return null;
    }
}
