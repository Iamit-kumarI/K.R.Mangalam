/*
* Problem:Search Node in Linked List
* Solution:https://www.geeksforgeeks.org/problems/search-in-linked-list-1664434326/1
*/
public class Problem1 {
    public boolean searchKey(Node head, int key) {
        // Code here
        Node thead=head;
        while(thead!=null){
            if(thead.data==key)return true;
            thead=thead.next;
        }
        return false;
    }
    class Node {
        int data;
        Node next;

        Node(int d)  { data = d;  next = null; }
    }
}