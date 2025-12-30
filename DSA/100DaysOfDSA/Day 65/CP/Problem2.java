/*
* Problem:Delete Node given only access to that node.
* Solution:https://leetcode.com/problems/delete-node-in-a-linked-list/submissions/1869004581/
*/
public class Problem2 {
    public void deleteNode(ListNode node) {
        //we don't had head so its not possible to delete this node but we can delete the node next to to just delete that one
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
