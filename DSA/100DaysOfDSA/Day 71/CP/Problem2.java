package CP;
/*
* Problem:Add Node at Head and Tail (practice)
* Solution:https://leetcode.com/problems/design-linked-list/submissions/1875083934/
*/
class Problem2 {
    private class Node{
        int val;
        Node next;
        Node(int val){this.val=val;}
    }
    private Node head;
    public Problem2() {//MyLinkedList()
        head=null;
    }
    
    public int get(int index) {
        Node thead=head;
        while(thead!=null&&index-->0){
            thead=thead.next;
        }
        return thead==null?-1:thead.val;
    }
    
    public void addAtHead(int val) {
        Node node=new Node(val);
        node.next=head;
        head=node;
    }
    
    public void addAtTail(int val) {
        if(head==null){
            head=new Node(val);
            return;
        }
        Node thead=head;
        while(thead.next!=null)thead=thead.next;
        thead.next=new Node(val);
    }
    
    public void addAtIndex(int index, int val) {
        Node thead=head;
        if(index==0){
            addAtHead(val);
            return;
        }
        while(thead!=null&&index-->1){
            thead=thead.next;
        }
        if(thead==null)return;
        Node node=new Node(val);
        node.next=thead.next;
        thead.next=node;
    }
    
    public void deleteAtIndex(int index) {
        if(head==null)return;
        if(index==0){
            head=head.next;
            return;
        }
        Node thead=head;
        while(thead.next!=null&&index-->1)thead=thead.next;
        if(thead.next==null)return;
        thead.next=thead.next.next;
    }
}