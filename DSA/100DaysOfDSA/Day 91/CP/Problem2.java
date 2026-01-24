/*
* Problem:Implement Queue using Array
* Solution:https://www.geeksforgeeks.org/problems/implement-queue-using-array/1
*/
public class Problem2{
    class myQueue {

        // Constructor
        int[] arr;
        int front = 0, rear = -1, size = 0, capacity;

        public myQueue(int n) {
            arr = new int[n];
            capacity = n;
        }

        public void enqueue(int x) {
            if (isFull()) {
                return;
            }
            rear = (rear + 1) % capacity;
            arr[rear] = x;
            size++;
        }

        public void dequeue() {
            if (isEmpty()) {
                return;
            }
            size--;
            front = (front + 1) % capacity;
        }

        public int getFront() {
            if (isEmpty()) {
                return -1;
            }
            return arr[front];
        }

        public int getRear() {
            if (isEmpty()) {
                return -1;
            }
            return arr[rear];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == capacity;
        }
    }
}