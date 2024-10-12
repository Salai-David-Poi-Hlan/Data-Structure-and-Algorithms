package DSA;
import java.util.Arrays;

import javax.swing.text.html.StyleSheet;
public class Tree {
    protected final int treeCapacity=64;
    protected int size=0;
    protected int[] T;

    public Tree(){
        T=new int[treeCapacity];
        Arrays.fill(T, -1);
    }

    public Tree(int tSize){
        T=new int[tSize];
        Arrays.fill(T, -1);
    }

    public boolean isRoot(int p){
        if(p==0){
            return true;
        }else{
            return false;
        }
    }

    public boolean hasLeftChild(int p){
        if(T[2*p+1]>-1){
            return true;
        }else{
            return false;
        }
    }

    public boolean hasRightChild(int p){
        if(T[p*2+2]>-1){
            return true;
        }else{
            return false;
        }
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        else{
            return false;
        }
    }
    public int getElement(int p){
        if(T[p]>-1){
            return T[p];
        }
        else{
            return -999;
        }
    }

    public boolean isInternal(int p){
        if(hasLeftChild(p) || hasRightChild(p)){
            return true;
        }else{
            return false;
        }
    }

    public boolean isLeaf(int p){
        if(hasLeftChild(p) || hasRightChild(p)){
            return false;
        }else{
            return true;
        }
    }

    public int getParent(int p){
        if(isRoot(p)){
            return -999;
        }
        else{
            return T[(p-1)/2];
        }
    }

    public void printAllPositions(){
     System.out.print("\nAll positions are : ");
     for(int i=0;i<T.length;i++){
        if(T[i]>-1){
            System.out.print(i+" ");
        }
      
     }
     System.out.println();
    }

    public void printAllElements(){
        System.out.print("\nAll elements are : ");
        for(int i=0;i<T.length;i++){
           if(T[i]>-1){
            System.out.print(T[i]+" ");
           }
        }
        System.out.println();
    }

    public void addRoot(int element){
        if(size==0){
            T[0]=element;
            System.out.println("Root of tree is added");size++;
        }
        else{
              System.out.println("Tree is not empty");
        }
    }

    public void addChild(int p,int element){
        if(element<T[p]){
            if(hasLeftChild(p)){
                addChild(((2*p)+1), element);
            }else{
                T[(p*2)+1]=element;
                size++;
                System.out.println("Left of "+p+" was added");
            }
        }
        else{
            if(hasRightChild(p)){
                   addChild(((2*p)+2), element);
            }else{
                T[(2*p)+2]=element;
                size++;
                System.out.println("Right of "+p+" was added");
            }
        }
    }

    public int getLeftChild(int p){
        if(hasLeftChild(p)){
            return T[(2*p)+1];
        }else{
            return -999;
        }
    }

    public int getRightChild(int p){
        if(hasRightChild(p)){
            return T[(2*p)+2];
        }
        else{
            return -999;
        }
    }

    public int getSibling(int p){
           if(isRoot(p)){
            return -999;
           }else if(p%2==1){
            if(T[p+1]>-1){
                return T[p+1];
            }
           }
           else if(p%2==0){
            if(T[p-1]>-1){
                return T[p-1];
            }
           }
           return p;
    }


}
