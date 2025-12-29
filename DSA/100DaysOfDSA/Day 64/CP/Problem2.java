package CP;
/*
* Problem:Swap Nodes in Pairs
* Solution:https://leetcode.com/problems/swap-nodes-in-pairs/submissions/1868103986/
*/
public class Problem2 {
    ListNode ListNode=new ListNode();
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode thead=head,prev=null;
        head=head.next;
        while(thead!=null&&thead.next!=null){
            ListNode cur=thead.next;
            ListNode next=cur.next;     
            cur.next=thead;
            thead.next=next;
            if(prev!=null){
                prev.next=cur;
            }    
            prev=thead;
            thead=next;  
        }   
        return head;
    }
}