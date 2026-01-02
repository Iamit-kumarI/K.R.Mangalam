package CP;

import java.util.PriorityQueue;

/*
* Problem:Merge K Sorted Lists (conceptual)
* Solution:https://leetcode.com/problems/merge-k-sorted-lists/submissions/1872277649/
*/
public class Problem2 {
    ListNode ListNode=new ListNode();
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (int i = 0; i < lists.length; i++) {
            ListNode cur = lists[i];
            while (cur != null) {
                pq.add(cur);
                cur = cur.next;
            }
        }
        ListNode ans = new ListNode(0);
        ListNode node = ans;
        while (!pq.isEmpty()) {
            node.next = pq.poll();
            node = node.next;
        }
        node.next = null;
        return ans.next;
    }
}

/*                          Slower Approach
public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<ListNode> list=new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            ListNode cur=lists[i];
            while(cur!=null){
                list.add(cur);
                cur=cur.next;
            }
        }
        Collections.sort(list,(a,b)->a.val-b.val);
        ListNode ans=new ListNode(0);
        ListNode node=ans;
        for(int i=0;i<list.size();i++){
            node.next=list.get(i);
            node=node.next;
        }
        node.next=null;
        return ans.next;
    }
}

*/
