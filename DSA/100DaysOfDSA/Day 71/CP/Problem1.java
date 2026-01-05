package CP;
/*
* Problem:Check if Linked List is Circular
* Solution:https://leetcode.com/problems/linked-list-cycle/submissions/1875068300/
*/
public calss Problem1{
    ListNode ListNode=new ListNode();
    public boolean hasCycle(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)return true;
        }
        return false;
    }
}