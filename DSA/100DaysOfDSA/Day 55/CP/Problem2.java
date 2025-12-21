/*
* Problem:Add Node at Position in Linked List
* Solution:https://discuss.geeksforgeeks.org/comment/e438653a-18b7-4313-82e4-609b774d4e37/practice
*/
public class Problem2 {
    public Node insertPos(Node head, int pos, int val) {
        // code here
        Node thead = head, next = head;
        if (pos == 1) {
            head = new Node(val);
            head.next = thead;
            return head;
        }
        while (pos-- > 2) {
            thead = thead.next;
        }
        next = thead.next;
        thead.next = new Node(val);
        thead.next.next = next;
        return head;
    }
    class Node {
        int data;
        Node next;
        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }
}
