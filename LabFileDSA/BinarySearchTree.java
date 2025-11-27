import java.lang.Math;

public class BinarySearchTree {
    private class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;
        public Node(int val) {
            this.value = val;
        }
        public int getValue() {
            return value;
        }
    }
    private Node root;
    public BinarySearchTree() {

    }
    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty() {
        return root == null;
    }
    public void display() {
        display(this.root, "Root Node: ");
    }
    private void display(Node node, String info) {
        if (node == null) {
            return;
        }
        System.out.println(info + node.getValue());//or node.value if ! private when created
        display(node.left, "Left child of " + node.getValue() + " : ");
        display(node.right, "Right child of " + node.getValue() + " : ");

    }
    public void insert(int val) {
        root = insert(val, root);
    }
    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value < node.value) {
            node.left = insert(value, node.left);
        }
        if (value > node.value) {
            node.right = insert(value, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }
    public void papulateSorted(int[] nums) {
        papulateSorted(nums, 0, nums.length - 1);
    }
    private void papulateSorted(int[] nums, int s, int e) {
        if (s > e) {
            return;
        }
        int mid = s + (e - s) / 2;
        this.insert(nums[mid]);
        papulateSorted(nums, s, mid - 1);
        papulateSorted(nums, mid + 1, e);
    }
    public boolean balanced() {
        return balanced(root);
    }
    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }
    public void inOrderTraversal() {
        inOrderTraversal(root);
    }
    private void inOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.getValue() + " ");
        inOrderTraversal(node.right);
    }
}
