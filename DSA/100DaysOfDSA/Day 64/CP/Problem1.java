package CP;
/*
* Problem:Segregate Even and Odd Nodes
* Solution:https://leetcode.com/problems/odd-even-linked-list/submissions/1868102179/
*/
public class Problem1 {
    ListNode ListNode=new ListNode();
    public ListNode oddEvenList(ListNode head) {
        //i can optimise this this but i won't do it right now
        ListNode even=new ListNode(0);
        ListNode odd=new ListNode(0);
        ListNode thead=head,ehead=even,ohead=odd;
        int count=1;
        while(thead!=null){
            if(count%2==0){
                even.next=thead;
                even=even.next;
            }else{
                odd.next=thead;
                odd=odd.next;
            }
            count++;
            thead=thead.next;
        }
        even.next=null;
        odd.next=ehead.next;
        return ohead.next;
    }
}