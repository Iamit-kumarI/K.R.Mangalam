/*
* Problem:Singly Linked List (Insert at Beginning) – Insert a node at the beginning and display the list.
* Repo:
 */
public class Program8 {
    public static void main(String[] args) {
        LL list1 = new LL();
        LL list2 = new LL();
        System.out.println("___________________________________________________");
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println(i+" Inserted From Last To list1: ");
            list1.inserLast(i);
        }
        System.out.println("___________________________________________________");
        list1.display();
        System.out.println();
        System.out.println("___________________________________________________");
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " Inserted From First To list1: ");
            list2.inserFirst(i * 2);
        }
        System.out.println();
        System.out.println("___________________________________________________");
        list2.display();
        System.out.println("___________________________________________________");
        LL ans = LL.mergeLL(list1, list2);
        System.out.println();
        System.out.print("merge both list"+" list1 "+"+"+" list2");
        ans.display();
        System.out.println();
        System.out.println("___________________________________________________");
        System.out.println();
        System.out.println("Deleted From First Head: "+list1.deleteFirst());
        System.out.println("___________________________________________________");
        System.out.println("Deleted From Last Tail: " + list1.deleteLast());
        System.out.println("___________________________________________________");
        System.out.println("Deleted From Index: " + list1.deleteFromIndex(2));
        System.out.println("___________________________________________________");
        System.out.println("Search: "+list2.searchByValue(3));
        System.out.println("___________________________________________________");

    }
}
