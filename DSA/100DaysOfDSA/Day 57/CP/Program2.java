/*
* Problem:Reverse Linked List (iterative)
* Solution:https://www.geeksforgeeks.org/problems/reverse-a-linked-list/1
*/
package CP;
public class Program2 {
    Node node=new Node();
    Node reverseList(Node head) {
        // code here
        if (head == null) {
            return head;
        }
        Node prev = null, cur = head, next = head.next;
        while (cur != null) {
            cur.next = prev;
            prev = cur;
            cur = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }
}
