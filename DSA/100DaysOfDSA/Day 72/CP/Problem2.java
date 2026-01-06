package CP;

import java.util.ArrayList;

/*
* Problem:Count Occurrences of a Value in Linked List
* Solution:https://discuss.geeksforgeeks.org/comment/1c84cc9c-f099-49d4-b164-6e7f242df780/practice
*/
public class Problem2 {
    public static int count(Node head, int key) {
        // code here
        Node node=new Node();
        if (head == null) {
            return 0;
        }
        Node thead = head;
        ArrayList<Integer> list = new ArrayList<>();
        while (thead != null) {
            list.add(thead.data);
            thead = thead.next;
        }
        return (int) list.stream().filter(x -> x == key).count();
    }
}
