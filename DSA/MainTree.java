package DSA;
import java.util.Scanner;
public class MainTree {
    public static void main(String[] args) {
        int element;int amount;
        System.out.println("How many do you want to store in data?");
        Scanner keyboard=new Scanner(System.in);
        amount=(keyboard.nextInt());

        Tree abt=new Tree();
        System.out.println("\nTree constructing...\n");
        System.out.println("First the tree is empty: "+abt.isEmpty());
        for(int i=0;i<amount;i++){
            System.out.print("Enter data#:"+(i+1)+" :");
            element=keyboard.nextInt();
            if(abt.isEmpty()){
                abt.addRoot(element);
            }else{
                abt.addChild(0, element);
            }
        }
        abt.printAllPositions();
        abt.printAllElements();
        System.out.println();

        System.out.println("The value in root node = "+abt.getElement(0));

        System.out.println("Node 1 contains "+abt.getElement(1)+" and it is an internal node: "+abt.isInternal(1));

        System.out.println("Node 3 contains "+abt.getElement(3)+" and it is a leaf node: "+abt.isLeaf(3));

        System.out.println("Node 6 contains "+abt.getElement(6)+" and it's left child value: "+abt.getLeftChild(6)+" and it's right child value: "+abt.getRightChild(6));
        System.out.println("Node 2 contains "+abt.getElement(2)+" and it's sibling value: "+abt.getSibling(2));
        System.out.println("Node 29 contains "+abt.getElement(29)+" and it's parent value: "+abt.getParent(29));
        System.out.println();
        System.out.println("Finally the tree's size = "+abt.getSize());
        keyboard.close();
    }
}
