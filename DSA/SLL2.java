package DSA;

public class SLL2 {
    private class Node {
       private int element;
       private Node next;
       public Node(int data){
         element=data;
         next=null;
       }
       public void link(Node newNode){
        next=newNode;
       }
       public Node getNextNode(){
        return next;
       }

       public int getNode(){
        return element;
       }
    }
    private Node head=null;
       private Node tail=null;
       private int size=0;

      public void addLast(int data){
        Node newNode=new Node(data);
           if(isEmpty()){
            head=newNode;
           }else{
           tail.link(newNode);
           tail=newNode;
           size++;
           }
      }

      public void addFirst(int element){
        Node newNode=new Node(element);
        if(isEmpty()){
            head=newNode;
            tail=newNode;
            size++;
        }else{
            newNode.link(head);
            head=newNode;
            size++;
        }
      }

      public void removeFirst(){
        if(isEmpty()){
            System.out.println("No node in SLL");
        }
        else if(size==1){
            head=null;
            tail=null;
            size=0;
        }else{
            head=head.getNextNode();
            size--;

        }
      }

      public void removeLast(){
        Node p;
        if(isEmpty()){
            System.out.println("No node in SLL");
        }
        else if(size==1){
            head=null;
            tail=null;
            size=0;
        }else{
           p=head;
           while (p.getNextNode()!=tail) {
            p=p.getNextNode();
           } 
           tail=p;
           tail.link(null);
           size--;
        }
      }
      public void print(){
        if(isEmpty()){
            System.out.println("No node in SLL");
        }
        else{
            for(Node p=head;p!=null;p=p.getNextNode()){
                  System.out.print(p.getNode()+"->");
            }
            System.out.println("null");
        }
      }

      public boolean isEmpty(){
        return size==0;
      }
      public int size(){
        return size;
      }
      public int get(int index){
                Node p;
                p=head;
                for(int i=0;i<index;i++){
                    p=p.getNextNode();
                }
                return p.getNode();
      }

      public void clear(){
        head=null;
        tail=null;
        size=0;
      }
}
