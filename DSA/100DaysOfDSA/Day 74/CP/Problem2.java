package CP;
/*
* Problem:Move Last Element to Front
* Solution:https://discuss.geeksforgeeks.org/comment/0327a0fd-17a7-45c0-811a-7a9d035c7e10/practice
*/
public class Problem2 {
    Node Node=new Node();
    public static Node moveToFront(Node head) {
        // code here
        if (head == null || head.next == null) {
            return head;
        }
        Node thead = head, prev = head;;
        while (thead.next != null) {
            prev = thead;
            thead = thead.next;
        }
        thead.next = head;
        prev.next = null;
        return thead;
    }
}
