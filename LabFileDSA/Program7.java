/*
* Problem:Queue using Array – Implement enqueue and dequeue operations.
* Repo:
 */
public class Program7 {
    public static void main(String[] args) throws Exception {
        
        CustomQueue queue=new CustomQueue(6);
        System.out.print("push 10 to queue,  ");
        queue.insert(10);
        System.out.print("push 12 to queue,  ");
        queue.insert(12);
        System.out.print("push 3 to queue,  ");
        queue.insert(3);
        System.out.print("push 4 to queue,  ");
        queue.insert(4);
        System.out.print("push 5 to queue,  ");
        queue.insert(5);
        System.out.println("pop from queue: "+queue.pop());// is removed from 0 so now 12 from 1 ll be at 0
        System.out.println("peek from queue: "+queue.peek());//12 is at 0 now
        System.out.print("Display Queue: ");
        queue.display();
         
    }
}
