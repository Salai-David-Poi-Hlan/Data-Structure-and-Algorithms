package DSA;

public class ArrayQueueMain {
    public static void main(String[] args) {
        ArrayQueue queue=new ArrayQueue(6);
        queue.printQueue();
        System.out.println();
        System.out.println("###Add data to empty queue###");
        System.out.print("enqueue(): ");
        for(int i=1;i<=5;i++){
            queue.enqueue(i);
            System.out.print(" "+i);
        }
        System.out.println();
        queue.printQueue();

        System.out.println("First element is "+queue.peak());
        System.out.println();
        System.out.println("---Remove 3 elements from queue---");
        for(int i=1;i<=3;i++){
                  System.out.println("deque(): "+queue.dequeue());
                  queue.printQueue();
                  System.out.println();
        }
        System.out.println("First element is "+queue.peak());
        System.out.println();
        System.out.println("+++Add more data to queue +++");
        System.out.println("enque(): 10");
        queue.enqueue(10);
        queue.printQueue();
        System.out.println();

        System.out.println("enque(): 20");
        queue.enqueue(20);
        queue.printQueue();
        System.out.println();

        System.out.println("+++ Deque all data(): ++++");
        System.out.print("Remove");
        while (queue.isEmpty()) {
            System.out.print(queue.dequeue()+" ");
            
        }
        
        
    }
}
