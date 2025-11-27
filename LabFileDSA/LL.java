
public class LL {
    private Node head;
    private Node tail;
    public void inserFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
    }    
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("List Finished");
    }
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        // public Node(int value, Node next) {
        //     this.value = value;
        //     this.next = next;
        // }
    }
}