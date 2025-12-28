package CP;

/*
* Problem:430. Flatten a Multilevel Doubly Linked List
* Solution:https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/submissions/1867252725/
 */
public class Problem2 {
    Node Node=new Node();
    public Node flatten(Node head) {
        if (head == null) {
            return head;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(head);
        Node prev = null;
        while (!stack.isEmpty()) {
            Node cur = stack.pop();
            if (prev != null) {
                prev.next = cur;
                cur.prev = prev;
            }
            if (cur.next != null) {
                stack.push(cur.next);
            }
            if (cur.child != null) {
                stack.push(cur.child);
                cur.child = null;//backtracking concepts
            }
            prev = cur;
        }
        return head;
    }
}
