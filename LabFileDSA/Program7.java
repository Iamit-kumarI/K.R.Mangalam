/*
* Problem:Queue using Array – Implement enqueue and dequeue operations.
* Repo:
 */
public class Program7 {
    public static void main(String[] args) throws Exception {
        
        CustomQueue queue=new CustomQueue(6);
        queue.insert(10);
        queue.insert(12);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        System.out.println("pop from queue: "+queue.pop());// is removed from 0 so now 12 from 1 ll be at 0
        System.out.println("peek from queue: "+queue.peek());//12 is at 0 now
        System.out.print("Display Queue: ");
        queue.display();
         
    }
}
