/*
* Problem:Find Stock Span Variant
* Solution:https://leetcode.com/problems/online-stock-span/
*/

import java.util.Stack;
public class Problem1
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

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
}