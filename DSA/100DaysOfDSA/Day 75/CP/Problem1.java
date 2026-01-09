/*
* Problem:Implement Stack using Linked List
* Solution:https://discuss.geeksforgeeks.org/comment/1f015e34-7740-48a8-baaa-fbb079f96aee/practice
*/
package CP;
public class Problem1{
    Node node=new Node(0);
    private Node top;
    public void myStack() {
        // Initialize your data members
        this.top = null;
    }

    public boolean isEmpty() {
        // check if the stack is empty
        return top == null;
    }

    public void push(int x) {
        // Adds an element x at the rear of the stack.
        Node node = new Node(x);
        node.next = top;
        top = node;
    }

    public void pop() {
        // Removes the front element of the stack.
        if (top == null) {
            return;
        }
        // int val=top.data;
        top = top.next;
        // return val;
    }

    public int peek() {
        // Returns the front element of the stack.
        // If stack is empty, return -1.
        if (isEmpty()) {
            return -1;
        }
        return top.data;

    }

    public int size() {
        // Returns the current size of the stack.
        int size = 0;
        Node ttop = top;
        while (ttop != null) {
            size++;
            ttop = ttop.next;
        }
        return size;
    }
}
