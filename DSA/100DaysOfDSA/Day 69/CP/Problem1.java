package CP;
/*
* Problem:Convert Binary Number in a Linked List to Integer
* Solution:https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/submissions/1872800972/
*/
public class Problem1 {
    public int getDecimalValue(ListNode head) {
        ListNode thead = head;
        int sum = 0, n = 0;
        while (thead != null) {
            // sum+=thead.val!=0?1<<n:0;
            sum = (sum << 1) | thead.val;
            // n++;
            thead = thead.next;
        }
        return sum;
    }
}
//calculate the bit from tail not from head
