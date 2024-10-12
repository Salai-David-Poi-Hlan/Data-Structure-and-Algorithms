package DSA;
import java.util.Arrays;
public class CircularArrayQueue2 {
    private final int CAPACITY=10;
    private int[] data;
    private int front=0;
    private int size=0;

    public CircularArrayQueue2(){
        data=new int[CAPACITY];
    }

    public CircularArrayQueue2(int capacity){
        data=new int[capacity];
    }
    public void enqueue(int element){
        if(size==data.length){
            resize();
        }
        int avail=(front+size)%data.length;
        data[avail]=element;
        size++;
    }
    public int enqueue(){
        if(isEmpty()){
            return -999;
        }
        int temp=data[front];
        data[front]=0;
        front=(front+1)%data.length;
        size--;
        return temp;
    }

    public int peek(){
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
            System.out.println("Queue is Empty");
        }
        
        else{
            System.out.print("Queue : ");
            int tmp=front;
            for(int i=0;i<data.length;i++){
        if(tmp==data.length){
            tmp=0;
        }
        if(data[tmp]==0){

        }else{
            System.out.print(data[tmp]+" ");
        }
        tmp++;
            }
            System.out.println();
        }
    }

    public void printArrays(){
        if(isEmpty()){
            System.out.println("Array is empty");

        }else{
            System.out.print("Array : ");
            for(int i=0;i<data.length;i++){
                System.out.print(data[i]+" ");
            }
            System.out.println();
        }
    }

    public int sum(){
        int sum=0;
        for(int i=0;i<data.length;i++){
            sum=sum+data[i];
        }

        return sum;
    }

    public void resize(){
        int [] tmp=data;
        Arrays.sort(tmp);

        int s=2*data.length;
        data=new int[s];
        for(int i=0;i<tmp.length;i++){
            data[i]=tmp[i];
        }
        front=0;

    }

}
