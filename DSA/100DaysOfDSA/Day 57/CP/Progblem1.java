/*
* Problem:Reverse Linked List (recursive)
* Solution:https://www.geeksforgeeks.org/problems/reverse-a-linked-list/1
*/

package CP;

public class Progblem1 {
    Node node = new Node();//no args constructor of node class
    Node reverseList(Node head) {
        if(head==null)return head;
        Node prev=null,cur=head,next=head.next;
        while(cur!=null){
            cur.next=prev;
            prev=cur;
            cur=next;
            if(next!=null)next=next.next;
        }
        return prev;
    }
}