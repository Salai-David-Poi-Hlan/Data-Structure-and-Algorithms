package DSA;

public class CLL {
    private class Node{
        private int element;
        private Node next;
          public Node(int data){
            element=data;
            next=null;
          }
          public int getElement(){
            return element;
          }
          public void link(Node newNode){
            next=newNode;
          }
          public Node getNextNode(){
            return next;
          }
    }

    private Node tail;
    private int size=0;
   
    public void addFirst(int data){
        Node newNode=new Node(data);
       if(size==0){
        tail=newNode;
        tail.link(newNode);
        size++;
       }else{
        newNode.link(tail.getNextNode());
        tail.link(newNode);
        size++;
       }      
    }

    public void addLast(int data){
        Node p=new Node(data);
        if(size==0){
            tail=p;
            tail.link(p);
            size++;
           }
           else{
            p.link(tail.getNextNode());
            tail.link(p);
            tail=p;
            size++;
           }
    }
    public void removeFirst(){
        if(size==0){}
        else if(size==1){
            tail=null;
            size=0;
        }else{
            Node p=tail.getNextNode();
            p=p.getNextNode();      
            tail.link(p);
            size--;
        }
    }

    public void removeLast(){
        if(size==0){}
        else if(size==1){
            tail=null;
            size=0;
        }else{
            Node p=tail.getNextNode();
            while (p.getNextNode()!=tail) {
                p=p.getNextNode();
            }
            p.link(tail.getNextNode());
            tail=p;
            size--;
        }
    }

    public void rotate(){
        if(size>1){
            tail=tail.getNextNode();
        }

    }

    public void print(){
        if(size==0){
            System.out.println("Empty linked list ");
        }
        else if(size==1){
            System.out.println("->"+tail.getElement()+"->");
        }else{
            Node p=tail.getNextNode();
            do {
                System.out.print("->"+p.getElement()+"->");
                p=p.getNextNode();
            }while (p!=tail);
            System.out.println(p.getElement()+"->");
        }
    }

}
