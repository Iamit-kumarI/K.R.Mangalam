
public class CustomQueue extends Exception {
    private static final int default_size = 10;
    private int[] data;
    int ptr = -1;
    int end = 0;
    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end++] = item;
//        end++;
        return true;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        int remove = data[0];
        for (int i = 1; i <= end; i++) {
            data[i - 1] = data[i];
        }
        end -= 1;
        return remove;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[0];
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
    }

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public CustomQueue() {//is size isn't given then
        this(default_size);
    }

    public CustomQueue(int size) {//is size given then create a array of size given and assign it
        this.data = new int[size];//to the array data we have created
    }
}
