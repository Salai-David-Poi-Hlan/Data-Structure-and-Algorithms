package DSA;

public class MainTree2 {
    public static void main(String[] args) {
        int [] data={8,5,10,15,20,18,3};
        Tree2 abt=new Tree2();
        for(int p=0;p<data.length;p++){
            if(abt.isEmpty()){
                abt.addRoot(data[p]);
            }else{
                abt.addChild(0, data[p]);
            }
        }
        abt.printAllPositions();
        abt.printAllElements();
        System.out.println();
        System.out.print("Preorder Traversal: ");
        abt.preOrderTraversal(0);
        System.out.println();
        System.out.print("Inorder Traversal: ");
        abt.inOrderTraversal(0);
        System.out.println();
        System.out.print("Postorder Traversal: ");
        abt.postOrderTraversal(0);
        System.out.println();
        System.out.print("Breadth-first Traversal: ");
        abt.breadthFirstTraversal(0);
        System.out.println();

    }
}
