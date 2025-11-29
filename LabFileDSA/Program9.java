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
        System.out.print("____________________This Is preOrder Traversal___________________");
        System.out.println();
        bst.preOrderTraversal();
        System.out.println();     
        System.out.print("____________________This Is inorder Traversal______________________");
        System.out.println();
        bst.inOrderTraversal();
        System.out.println();
        System.out.print("_____________________This Is postOrder Traversal___________________");
        System.out.println();
        bst.postOrderTraversal();
        System.out.println();
        System.out.println();
        System.out.println("____________________View Of BST_____________________________");
        bst.display();
    }
}
