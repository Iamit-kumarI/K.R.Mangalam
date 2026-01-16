/*
* Problem:Reverse Stack using Recursion
* Solution:https://www.geeksforgeeks.org/problems/reverse-a-stack/1
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Problem1 {
    public static Queue<Integer>queue=new LinkedList<>();
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        for(int i=1;i<5;i++)stack.push(i);
        reverseStack(stack);
    }
    public static void reverseStack(Stack<Integer> st) {
        // code here
        stackToQueeu(st);
        queueToStack(st);
    }

    public static void stackToQueeu(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }
        queue.offer(st.pop());
        stackToQueeu(st);
    }

    public static void queueToStack(Stack<Integer> st) {
        if (queue.isEmpty()) {
            return;
        }
        st.push(queue.poll());
        queueToStack(st);
    }
}
