/*
i think i have make this mistake in past many time if problem link dosent lead to 
problem directly of on the page if i don't found the button says try this 
problem so i never tried to visit on the links present on the table so this
time i searches for the problem because i have solved this problem earlier and 
i was knowing that there is a problem by this name so i found yes the links on
that same page have nested links and there i can found the problem i hope 
trainer won't cur my marks but from next time i will search for the problem by 
and what ever mean possible not assuming that its a curpted link :(

* Problem:Detect Cycle in Linked List (Floyd)
* Solution:https://discuss.geeksforgeeks.org/comment/f8781f32-fefd-47f9-8bd0-83dfa1e58ab6/practice
*/

package CP;
public class Problem2 {
    Node node=new Node();
    public boolean detectLoop(Node head) {
        // code here
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
