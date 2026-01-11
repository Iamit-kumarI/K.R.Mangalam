/*
* Problem:Min Stack (getMin)Min Stack (getMin)
* Solution:https://leetcode.com/problems/min-stack/submissions/1881553068/
*/

import java.util.Stack;

public class Problem1 {
    class MinStack {
    Stack<MStack>minStack=new Stack<MStack>();
    public MinStack() {
    }
    
    public void push(int val) {
        if(minStack.isEmpty())minStack.push(new MStack(val,val));
        else minStack.push(new MStack(val,Math.min(minStack.peek().minValue,val)));
    }
    
    public void pop() {
        minStack.pop();
    }
    
    public int top() {
        return minStack.peek().val;
    }
    
    public int getMin() {
        return minStack.peek().minValue;
    }
}
class MStack{
    int val;
    int minValue;
    public MStack(int val,int minValue){
        this.val=val;
        this.minValue=minValue;
    }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
