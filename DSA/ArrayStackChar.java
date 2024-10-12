package DSA;

public class ArrayStackChar {

    private static final int CAPACITY = 10; // Default capacity
    private char[] data; // Array to hold stack elements
    private int size = 0; // Current size of the stack

    // Constructor with default capacity
    public ArrayStackChar() {
        data = new char[CAPACITY];
    }

    // Constructor with custom capacity
    public ArrayStackChar(int capacity) {
        data = new char[capacity];
    }

    // Returns the number of elements in the stack
    public int getSize() {
        return size;
    }

    // Checks if the stack is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Pushes an element onto the stack
    public void push(char e) {
        if (size == data.length) {
            resize();
        }
        data[size] = e; // Correct index for pushing
        size++;
    }

    // Peeks at the top element of the stack
    public char peek() {
        if (isEmpty()) {
            return '0';
        }
        return data[size - 1];
    }

    // Pops the top element from the stack
    public char pop() {
        if (isEmpty()) {
            return '0';
        }
        char value = data[size - 1];
        size--;
        return value;
    }

    // Resizes the stack to double its current capacity
    private void resize() {
        System.out.println("Doubling stack's size");
        char[] temp = new char[2 * data.length];
        System.arraycopy(data, 0, temp, 0, data.length);
        data = temp;
    }
}
