package DSA;

public class SLL3 {
    private class  Node {
       private int element;
       private Node next;

       public Node(int data){
        element=data;
       }

       public void link(Node newNode){
        next=newNode;
       }
       public int getElement(){
        return element;
       }

       public Node getNextNode(){
        return next;
       }    
    }
    private Node head=null;
    private Node tail=null;
    private int size=0;

    public void addFirst(int data){
        Node newNode=new Node(data);
        if(size==0){
            head=newNode;
            tail=newNode;
            size++;
        }
        else{
            newNode.link(head);
            head=newNode;
            size++;
        }
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(size==0){
            head=newNode;
            size++;
        }
        else{
            tail.link(newNode);
            tail=newNode;
            size++;
        }
    }
    public void removeFirst(){
        if(size==0){
            System.out.println("No node in SLL");
        }
        else if(size==1){
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
            System.out.println("No node in SLL");
        }
        else if(size==1){
            head=null;
            tail=null;
            size=0;
        }
        else{
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
            System.out.println("No node in Sll");
        }
        else{
            Node p;
            for(p=head;p!=null;p=p.getNextNode()){
                System.out.print(p.getElement()+"->");
            }
            System.out.println("null");
        }
    }

    public int size(){
        return size;
    }

    public String isEmpty(){
        if(size==0){
            return "true";
        }else return "false";
    }

    public int get(int index){
        Node p;
      
            
            p=head;
            for(int i=0;i<index;i++){
                p=p.getNextNode();
            }
            return p.getElement(); 
    }

    public void clear(){
        head=null;
        tail=null;
        size=0;

    }

    public String findElement(int data){
        String status="false";
        Node p;
        p=head;
        for(int i=0;i<size;i++){
            if(p.getElement()==data){
                status="true";
            }else{}
            p=p.getNextNode();
        }
        return status;

    }

    public int countElement(int data){
        int count=0;
        Node p;
        p=head;
        for(int i=0;i<size;i++){
            if(p.getElement()==data){
                count++;
            }else{}
            p=p.getNextNode();
        }
        return count;
    }

    public int sumElement(){
        int sum=0;
        Node p;
        p=head;
        for(int i=0;i<size;i++){
            sum=sum+p.getElement();
            p=p.getNextNode();
        }
        return sum;
    }

}
