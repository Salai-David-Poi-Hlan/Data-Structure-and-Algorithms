package DSA;

public class MainCircularArray {
    public static void main(String[] args) {
        CircularArrayQueue queue = new CircularArrayQueue(12);
        queue.printQueue();

        System.out.println("\n### Add Data to Empty queue ###");
        System.out.print("enqueue() : ");
        for (int i = 1; i < 6; i++) {
            queue.enqueue(i);
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Queue: ");
        queue.printQueue();

        System.out.println("\n------ Remove the 3 elements from Queue ------");
        for (int i = 1; i <= 3; i++) {
            System.out.println("dequeue() : " + queue.dequeue());
            queue.printQueue();
        }
        System.out.println("First element is " + queue.peek());

        System.out.println("\n+++ Add more Data to Queue +++");
        System.out.print("enqueue() : ");
        for (int i = 10; i <= 100; i += 10) {
            queue.enqueue(i);
            System.out.print(i + " ");
        }
        System.out.println();
        
        System.out.print("Queue : ");
        queue.printQueue();

        System.out.println("\n+++ Try to add one more element to the queue +++");
        System.out.println("enqueue() : " + 110);
        queue.enqueue(110);
        System.out.println();

        System.out.println("+++ Dequeue all data : +++");
        System.out.print("Remove: ");
        while (!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println();
        queue.printQueue();
    }
}