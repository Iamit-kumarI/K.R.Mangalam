/*
* Problem:Merge Two Sorted Linked Lists
* Solution:https://discuss.geeksforgeeks.org/comment/db2cca66-f3e8-46d3-8dac-9ffc0ae817d9/practice
*/
package CP;//
class Solution {
    Node node=new Node();
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node merge = new Node(0);
        Node ans = merge;
        Node thead1 = head1, thead2 = head2;
        while (thead1 != null && thead2 != null) {
            /*if(thead1.data==thead2.data){
                thead1=thead1.next;
                thead2=thead2.next;
            }
            else */
            if (thead1.data > thead2.data) {
                merge.next = thead2;
                thead2 = thead2.next;
                merge = merge.next;
            } else {
                merge.next = thead1;
                thead1 = thead1.next;
                merge = merge.next;
            }
        }
        if (thead1 != null) {
            while (thead1 != null) {
                merge.next = thead1;
                thead1 = thead1.next;
                merge = merge.next;
            }
        }
        if (thead2 != null) {
            while (thead2 != null) {
                merge.next = thead2;
                thead2 = thead2.next;
                merge = merge.next;
            }
        }
        merge.next = null;
        return ans.next;
    }
}
