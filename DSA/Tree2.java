package DSA;

public class Tree2 extends Tree {
    public void preOrderTraversal(int p){
        System.out.print(T[p]+" ");
        if(hasLeftChild(p)){
            preOrderTraversal((p*2)+1);
        }
        if(hasRightChild(p)){
            preOrderTraversal((p*2)+2);
        }
    }

    public void inOrderTraversal(int p){
        if(hasLeftChild(p)){
            inOrderTraversal((p*2)+1);
        }
        System.out.print(T[p]+" ");
        if(hasRightChild(p)){
            inOrderTraversal((p*2)+2);
        }
    }
    public void postOrderTraversal(int p){
        if(hasLeftChild(p)){
            postOrderTraversal((p*2)+1);
        }
        if(hasRightChild(p)){
            postOrderTraversal((p*2)+2);
        }
        System.out.print(T[p]+" ");
    }

    public void breadthFirstTraversal(int p){
        for(int i=0;i<T.length;i++){
            if(T[i]>0){
                System.out.print(T[i]+" ");
            }
        }
        System.out.println();
    }
}
