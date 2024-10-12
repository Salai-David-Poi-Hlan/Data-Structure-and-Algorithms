package DSA;
class ArrayStack{
    private final static int CAPACITY=10;
    private int [] data;
    private int size=0;

    public ArrayStack(){
        data=new int[CAPACITY];
    }
    public ArrayStack(int capacity){
        data=new int[capacity];   
    }

    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
      return size==0;
    }
    public void push(int e){
          if(size==data.length){
            resize();
          }
          data[size]=e;
          size++;
    }

    public int peek(){
        if(size==0){
            return -999;
        }
        else{
            return data[size-1];
        }
    }

    public int pop(){

         if(size==0){
            return -999;
         }
         else{
            int value=data[size-1];
            size--;
            return value;
            
         }
    }

    public void resize(){
        System.out.println("Double stack's size");
        int[]temp=new int[2*data.length];
        System.arraycopy(data,0 , temp, 0, data.length);
        data=temp;
    }
}

public class MainStack {

     public static void main(String[] args) {
        ArrayStack stack =new ArrayStack(5);
        System.out.println("###Add Data to Empty stack###");
        System.out.println("Stack empty: "+stack.isEmpty());
        System.out.print("Stack Push: ");
        for(int i=1;i<=5;i++){
                   stack.push(i);
                   System.out.print(" "+i);

        }
        System.err.println();
        System.out.println("Stack top: "+stack.peek());
        System.out.println("Stack empty: "+stack.isEmpty());
        System.out.println("Stack size: "+stack.getSize());
        System.out.println("\n+++ Add More Data++++++");
        System.out.print("Stack push: ");
        for(int j=10;j<=50;j+=10){
            stack.push(j);
            System.out.print(" "+j);
        }
        System.out.println();
        System.out.println("\nStack size: "+stack.getSize());
        System.out.println("Stack top: "+stack.peek());
        System.out.println("\n------- Remove the stack-------");
        System.out.print("Stack pop: ");
        int s=stack.getSize();
        for(int k=1;k<=s;k++){
                 System.out.print(" "+stack.pop());
        }
        System.out.println("\nStack size: "+stack.getSize());
        System.out.println("Stack empty: "+stack.isEmpty());
        
    
     }
}