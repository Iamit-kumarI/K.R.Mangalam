/*
* Problem:Singly Linked List (Insert at Beginning) – Insert a node at the beginning and display the list.
* Repo:
 */
public class Program8 {
    public static void main(String[] args) {
        LL list = new LL();
       for (int i = 0; i <= 5; i++) {
           list.inserFirst(i);
       }
        list.display();
    }
}
