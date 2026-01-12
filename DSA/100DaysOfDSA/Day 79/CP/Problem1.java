/*
* Problem:Stock Span Problem
* Solution:https://leetcode.com/problems/online-stock-span/submissions/1882513330/
*/

import java.util.Stack;

public class Problem1{
    class StockSpanner {

    class obj{
        private int val;
        private int span;
        public obj(int val,int span){
            this.val=val;
            this.span=span;
        }
    }

    private Stack<obj> stack;
    public StockSpanner() {
        this.stack=new Stack<>();
    }
    
    public int next(int price) {
        int count=1;
        while(!stack.isEmpty()&&stack.peek().val<=price)count+=stack.pop().span;
        stack.push(new obj(price,count));
        return stack.peek().span;
    }
}

}