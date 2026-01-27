/*
* Problem: Sliding Window Maximum (deque concept)
* Solution: yet not able to make this has TLE
*/
//working on it and i will make it asap

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Problem2{
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[]ans=new int[nums.length-k+1];
        int index=0;
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->b-a);
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<k;i++){
            pq.add(nums[i]);
            queue.offer(nums[i]);
        }
        for(int i=k;i<nums.length;i++){
            ans[index++]=pq.peek();
            pq.remove(queue.poll());// thinking to optimise here
            pq.add(nums[i]);
            queue.offer(nums[i]);
        }
        ans[index]=pq.peek();
        return ans;
    }
}