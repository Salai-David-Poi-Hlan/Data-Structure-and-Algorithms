package DSA;

public class ArrayQueue {
    private final int CAPACITY=10;
    private int[] data;
    private int front=0;
    private int size=0;

    public ArrayQueue(){
        data=new int[CAPACITY];   
    }

    public ArrayQueue(int capacity){
        data=new int[capacity];   
    }
    public void enqueue(int element){
        if((size+front)==data.length){
            System.out.println("Queue is full");
            return;
        }
        data[front+size]=element;
        size++;
    }

    public int dequeue(){
            if(isEmpty()){
                return -999;
            }
            
                int temp=data[front];
                data[front]=-999;
                front++;
                size--;
                return temp;
            
    }

    public int peak(){
        if(isEmpty()){
            return -999;
        }
        else
        return data[front];
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void printQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        else{
            for(int i=0;i<data.length;i++){
                System.out.print(data[i]+" ");
            }
            System.out.println();
        }
    }
}
