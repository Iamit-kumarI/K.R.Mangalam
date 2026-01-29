/*
* Problem: Queue Using Two Stacks (alternate)
* Solution:https://leetcode.com/problems/implement-queue-using-stacks/solutions/7523129/beats-100-java-solution-by-amitk300-7od2
*/

import java.util.Stack;

public class Problem2{ //name is MYQueue
    Stack<Integer>pushStack;
        Stack<Integer>popStack;
        public MyQueue() { // or everywhere change the const name
            pushStack=new Stack<>();
            popStack=new Stack<>();
        }

        public void push(int x) {
            pushStack.push(x);
        }

        public int pop() {
            while(!pushStack.isEmpty())popStack.push(pushStack.pop());
            int ans=popStack.pop();
            while(!popStack.isEmpty())pushStack.push(popStack.pop());
            return ans;
        }

        public int peek() {
            while(!pushStack.isEmpty())popStack.push(pushStack.pop());
            int ans=popStack.peek();
            while(!popStack.isEmpty())pushStack.push(popStack.pop());
            return ans;
        }

        public boolean empty() {
            return pushStack.isEmpty();
        }
}