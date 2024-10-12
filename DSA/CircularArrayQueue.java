package DSA;

public class CircularArrayQueue {
    private final int CAPACITY = 10;
    private int[] data;
    private int front = 0;
    private int size = 0;

    public CircularArrayQueue() {
        data = new int[CAPACITY];
    }

    public CircularArrayQueue(int capacity) {
        data = new int[capacity];
    }

    public void enqueue(int element) {
        if (size == data.length) {
            System.out.println("Queue is full");
        } else {
            int avail = (front + size) % data.length;
            data[avail] = element;
            size++;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            return -999; // Consider throwing an exception for better error handling
        } else {
            int tmp = data[front];
            data[front] = -999; // Optional: Clear the value
            front = (front + 1) % data.length;
            size--;
            return tmp;
        }
    }

    public int peek() {
        if (isEmpty()) {
            return -999; // Consider throwing an exception instead
        }
        return data[front];
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.print(data[(front + i) % data.length] + " ");
            }
            System.out.println();
        }
    }
}