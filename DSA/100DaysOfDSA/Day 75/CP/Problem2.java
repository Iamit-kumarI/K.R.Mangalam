package CP;
/*
* Problem:Implement Stack using Array
* Solution:https://discuss.geeksforgeeks.org/comment/2419a3c0-b8d2-4479-93f7-5efcfd410e0b/practice
*/
public class Problem2 {//use mystack
    private int[] arr;
    private int top = -1;

    public void myStack(int n) {//remove the return type its not required in constructor
        // Define Data Structures
        arr = new int[n];
    }

    public boolean isEmpty() {
        // check if the stack is empty
        return top == -1;
    }

    public boolean isFull() {
        // check if the stack is full
        return top == arr.length - 1;
    }

    public void push(int x) {
        // Inserts x at the top of the stack
        if (isFull()) {
            return;//we don'e need to double the size if its full it gives error

                }arr[++top] = x;
    }

    public void pop() {
        // Removes an element from the top of the stack
        if (isEmpty()) {
            return;//we don't need to return the top element

                }arr[top] = 0;
        top--;
    }

    public int peek() {
        // Returns the top element of the stack
        if (isEmpty()) {
            return -1;
        }
        return arr[top];
    }
}
