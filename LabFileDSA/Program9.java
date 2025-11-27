/*
* Problem:Binary Search Tree – Insert nodes and perform inorder traversal.
* Repo:
 */
public class Program9 {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        bst.papulateSorted(nums);
        System.out.println();
        System.out.print("This Is inorder Traversal:");
        bst.inOrderTraversal();
        System.out.println();
        System.out.println();
        System.out.println("View Of BST");
        bst.display();
    }
}
