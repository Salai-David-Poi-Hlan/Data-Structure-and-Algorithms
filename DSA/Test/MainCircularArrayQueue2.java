package DSA.Test;
public class MainCircularArrayQueue2 {
    public static void main(String[] args) {
        CircularArrayQueue2 queue = new CircularArrayQueue2(3);
        System.out.println("Add 3 elements");
        
        queue.enqueue(11);
        queue.enqueue(22);
        queue.enqueue(33);
        queue.printQueue();
        queue.printArrays();
        System.out.println();
        
        System.out.println("Remove 1 element");
        System.out.println("Removed: " + queue.dequeue());
        queue.printQueue();
        queue.printArrays();
        System.out.println();
        
        System.out.println("Add 1 more element");
        queue.enqueue(44);
        queue.printQueue();
        queue.printArrays();
        System.out.println();
        
        System.out.println("Add 1 more element");
        queue.enqueue(55);
        queue.printQueue();
        queue.printArrays();
        System.out.println();
        
        System.out.println("Remove 1 element");
        System.out.println("Removed: " + queue.dequeue());
        queue.printQueue();
        queue.printArrays();
        System.out.println();
        
        queue.enqueue(66);
        queue.enqueue(77);
        queue.enqueue(88);
        queue.enqueue(99);
        queue.printQueue();
        queue.printArrays();

        System.out.println();
        System.out.println("Sum of all elements = " + queue.sum());
    }

    static class CircularArrayQueue2 {
        private final int CAPACITY = 10;
        private int[] data;
        private int front = 0;
        private int size = 0;

        public CircularArrayQueue2() {
            data = new int[CAPACITY];
        }

        public CircularArrayQueue2(int capacity) {
            if (capacity <= 0) {
                throw new IllegalArgumentException("Capacity must be greater than 0");
            }
            data = new int[capacity];
        }

        public void enqueue(int element) {
            if (size == data.length) {
                resize();
            }
            int avail = (front + size) % data.length;
            data[avail] = element;
            size++;
        }

        public int dequeue() {
            if (isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            int temp = data[front];
            data[front] = 0; // Optionally reset the value
            front = (front + 1) % data.length;
            size--;
            return temp;
        }

        public int peek() {
            if (isEmpty()) {
                throw new IllegalStateException("Queue is empty");
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
                System.out.print("Queue: ");
                for (int i = 0; i < size; i++) {
                    System.out.print(data[(front + i) % data.length] + " ");
                }
                System.out.println();
            }
        }

        public void printArrays() {
            System.out.print("Array: ");
            for (int i = 0; i < data.length; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }

        public int sum() {
            int sum = 0;
            for (int i = 0; i < size; i++) {
                sum += data[(front + i) % data.length];
            }
            return sum;
        }

        public void resize() {
            int[] newData = new int[2 * data.length];
            for (int i = 0; i < size; i++) {
                newData[i] = data[(front + i) % data.length];
            }
            data = newData;
            front = 0;
        }
    }
}
