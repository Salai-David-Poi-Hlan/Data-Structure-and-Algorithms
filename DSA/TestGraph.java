package DSA;

public class TestGraph {
    public static void main(String[] args) {
        Graph graph=new Graph();
        graph.AddVertex('A');
        graph.AddVertex('B');
        graph.AddVertex('C');
        graph.AddVertex('D');
        graph.AddVertex('E');
        graph.AddVertex('F');
        graph.AddVertex('G');
        graph.AddVertex('H');
        graph.AddVertex('I');

        graph.AddEdges(0, 1);
        graph.AddEdges(0, 2);
        graph.AddEdges(0, 3);
        graph.AddEdges(0, 4);
        graph.AddEdges(1, 5);
        graph.AddEdges(5, 7);
        graph.AddEdges(3, 6);
        graph.AddEdges(6, 8);

        graph.showSize();

        graph.showVertex();

        graph.showAdjacency();

        graph.showEdges();

        graph.checkComplete();

    }
}
