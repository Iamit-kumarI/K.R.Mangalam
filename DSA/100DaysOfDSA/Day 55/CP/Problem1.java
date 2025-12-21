/*
* Problem:Delete Node at Position in Linked List
* Solution:https://discuss.geeksforgeeks.org/comment/732fc498-3f62-46a6-b0f8-d7edddfa1989/practice
*/
// package DAY 55.CP;
class Problem1 {
    Node deleteNode(Node head, int x) {
        // code here
        Node thead=head;
        Node prev=head;
        if(x==1)return head.next;
        while(x-->1){//thead!=null no need to check
            prev=thead;
            thead=thead.next;
        }
        prev.next=thead.next;
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