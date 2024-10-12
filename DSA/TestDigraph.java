package DSA;

public class TestDigraph {
    public static void main(String[] args) {
        Digraph graph=new Digraph();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.AddEdges(0, 1, 3);//
        graph.AddEdges(0, 2, 4);
        graph.AddEdges(0, 3, 1);
        graph.AddEdges(1, 4, 2);//
        graph.AddEdges(2, 3, 3);//
        graph.AddEdges(3, 1, 2);
        graph.AddEdges(3, 2, 3);
        graph.AddEdges(4, 2, 4);//
        graph.showSize();
        graph.showVertex();
        graph.showAdjacency();
        graph.showEdges();
        graph.checkComplete();
        int [] path={0,1,4,2,3};
        System.out.println("The path length ABCD = "+graph.findpathLength(path));

    }
}
