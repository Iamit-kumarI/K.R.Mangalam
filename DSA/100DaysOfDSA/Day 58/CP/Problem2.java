/*
* Problem:Middle of a Linked List
* Solution:https://discuss.geeksforgeeks.org/comment/aad4ceb8-6426-4d76-a430-a79fa809475c/practice
*/
package CP;
class Solution {
    Node node=new Node();
    int getMiddle(Node head) {
        // code here
        Node fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }
}
