
import java.util.ArrayDeque;
import java.util.Deque;

/*
* Problem:Implement Stack using Queues
* Solution:https://leetcode.com/problems/implement-stack-using-queues/submissions/1888597418/
*/
class MyStack {

    Deque<Integer> queue;

    public MyStack() {
        queue = new ArrayDeque<>();
    }

    public void push(int x) {
        queue.addFirst(x);
    }

    public int pop() {
        return queue.removeFirst();
    }

    public int top() {
        if (!queue.isEmpty()) {
            return queue.peekFirst();
        }
        return -1;
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
