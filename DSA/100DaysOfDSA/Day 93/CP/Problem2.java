
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;
/*
* Problem:Level Order Traversal (queue practice)
* Solution:https://leetcode.com/problems/binary-tree-level-order-traversal/submissions/1897431019/
*/
public class Problem2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            List<Integer> cur = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                TreeNode curNode = queue.poll();
                cur.add(curNode.val);
                if (curNode.left != null) {
                    queue.offer(curNode.left);
                }
                if (curNode.right != null) {
                    queue.offer(curNode.right);
                }
            }
            list.add(cur);
        }
        return list;
    }
}
