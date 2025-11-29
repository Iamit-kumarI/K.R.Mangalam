/*
* Problem:Stack using Array – Implement push, pop, peek, and isEmpty operations.
* Repo:
*/
public class Program6 {
    public static void main(String[] args) throws StackE {
        CStack stack=new CStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        /**
         * size is five but inserting 6 didn't give exception because now its
         * doubling its size so here now its size should be 10
         */
        stack.push(6);
        System.out.println("peek from stack: "+stack.peek());
        System.out.println("pop From Stack: "+stack.pop());
        System.out.println("peek from stack: " + stack.peek());
    }
}
