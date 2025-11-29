public class LL {

    private Node head;
    private Node tail;
    private int size;
    public void inserIndex(int val, int index) {
        if (index == 0) {
            inserFirst(val);
            return;
        }
        if (index == size) {
            inserLast(val);
            return;
        }
        Node tempindex = head;
        for (int i = 1; i < index; i++) {
            tempindex = tempindex.next;
        }
        Node node = new Node(val, tempindex.next);
        tempindex.next = node;
        size += 1;

    }

    public void inserFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void inserLast(int val) {
        if (tail == null) {
            inserFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {//checking if all the items are deleted then head goes to null then
            tail = null;  //tail also should go to null
        }
        size -= 1;
        return val;
    }

    public int deleteFromIndex(int index) {
        if (index == 0) {
            deleteFirst();
        }
        if (index == size - 1) {
            deleteLast();
        }
        Node preIndex = findLastNode(index - 1);
        int val = preIndex.next.value;//this is being deleted
        preIndex.next = preIndex.next.next;//now pointing next to next
        return val;
    }

    public Node findLastNode(int index) {
        Node node = head;//we don't have method to go previous we have to go there by iteratively
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = findLastNode(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("List Finished");
    }

    public int searchByValue(int val) {
        Node tempNode = head;
        while (tempNode != null) {
            if (tempNode.value == val) {
                return val;
            }
            tempNode = tempNode.next;
        }
        return -1;
    }

    public static LL mergeLL(LL list1, LL list2) {
        Node f = list1.head;
        Node s = list2.head;
        LL ans = new LL();//creating this to store answers
        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.inserLast(f.value);
                f = f.next;
            } else {
                ans.inserLast(s.value);
                s = s.next;
            }
        }
        while (f != null) {
            ans.inserLast(f.value);
            f = f.next;
        }
        while (s != null) {
            ans.inserLast(s.value);
            s = s.next;
        }
        return ans;
    }

    private class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
