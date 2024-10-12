package DSA;

public class SSL{
    private class Node {
        private int element;
        private Node next;
        public Node(int data){
            element=data;
            next=null;
        }
        public void link(Node newnode){
            next=newnode;
        }
        public Node getNextNode(){
              return next;
        }
        public int getElement(){
            return element;
        }
    }
    private Node head=null;
    private Node tail=null;
    private int size=0;

    public void addLast(int data){
        Node newNode=new Node(data);
        if(size==0){
            head=newNode;
        }else{
            tail.link(newNode);
        }
        tail=newNode;
        size++;
     }
     public void addFirst(int data){
        Node newNode=new Node(data);
        if(size==0){
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
        if(size==0){
            System.out.println("No node in SSL");
        }

        else if(size==0){
            head=null;
            tail=null;
            size=0;
        }
        else{
               head=head.getNextNode();
               size--;
        }
     }
     public void removeLast(){
        if(size==0){
            System.out.println("No node in SSL");
        }

        else if(size==0){
            head=null;
            tail=null;
            size=0;
        }else{
            Node p;
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
        if(size==0){
            System.err.println("No node in SLL");
        }
        else{
            for(Node p=head;p!=null;p=p.getNextNode()){
                System.err.print(p.getElement()+"->");
            }
            System.out.println("null");
        }
     }

}
