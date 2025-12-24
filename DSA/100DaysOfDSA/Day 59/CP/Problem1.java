/*
* Problem:Remove Cycle in Linked List
* Solution:https://discuss.geeksforgeeks.org/comment/4e067aea-fbcb-4ac7-94c6-9d0ce51a5aa3/practice
*/

package CP;
import java.util.HashSet;
import java.util.Set;
class Problem1 {
    Node node=new Node();
    public static void removeLoop(Node head) {
        // code here
        Node cur = head;
        Set<Node> set = new HashSet<>();
        while (cur != null) {
            set.add(cur);
            if (set.contains(cur.next)) {
                cur.next = null;
                break;
            }
            cur = cur.next;
        }
    }
}
