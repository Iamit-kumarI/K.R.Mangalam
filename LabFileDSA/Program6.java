/*
* Problem:Stack using Array – Implement push, pop, peek, and isEmpty operations.
* Repo:
*/
public class Program6 {
    public static void main(String[] args) throws StackE {
        CStack stack=new CStack(5);
        for(int i=0;i<5;i++){
            System.out.print("push "+i+" to stack,   ");
            stack.push(i);
        }
        System.out.println("peek from stack: "+stack.peek());
        System.out.println("pop From Stack: "+stack.pop());
        System.out.println("peek from stack: " + stack.peek());
    }
}
