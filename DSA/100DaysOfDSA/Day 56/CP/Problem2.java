/*
* Problem:Count Nodes in Linked List
* Solution:https://discuss.geeksforgeeks.org/comment/fb5b0040-5b6c-4e6e-90be-3e64501c7e12/practice
*/
public class Problem2 {
    public int getCount(Node head) {
        // code here
        Node fast = head;//slow=head;
        int count = 0, count1 = 0;
        while (fast != null && fast.next != null) {
            count++;
            if (fast.next.next != null) {
                count1++;
            }
            fast = fast.next.next;
        }
        return count + count1 + 1;
    }
    class Node {

        int data;
        Node next;

        Node(int a) {
            data = a;
            next = null;
        }
    }
}
