package DSA;

public class Graph {
    private final int MAX_VERTICES=20;
    private char[] vertex;
    private int[][] adjMatrix;
    private int numVertices;
    private int numEdges;


    public Graph(){
        vertex=new char[MAX_VERTICES];
        adjMatrix=new int[MAX_VERTICES][MAX_VERTICES];
        numVertices=0;
        numEdges=0;
        for(int i=0;i<MAX_VERTICES;i++){
            for(int j=0;j<MAX_VERTICES;j++){
                adjMatrix[i][j]=0;
            }
        }
    }

    public void AddVertex(char title){
        vertex[numVertices++]=title;
    }

    public void AddEdges(int start,int end){
        adjMatrix[start][end]=1;
        adjMatrix[end][start]=1;
        numEdges=numEdges+1;
    }

    public void showSize(){
        System.out.println("Size of graph = "+numVertices);
        System.out.println();
    }
    public void showVertex(){
        System.out.println("==== Vertices===");
        for(int i=0;i<numVertices;i++){
            System.out.print(vertex[i]+" ");
        }
        System.out.println();
    }

    public void showAdjacency(){
        System.out.println("===Adjacency Matrix===");
        for(int i=0;i<numVertices;i++){
            for(int j=0;j<numVertices;j++){
                     System.out.print(adjMatrix[i][j]+" ");
            }
         

        }
        System.out.println();
    }

    public void showEdges(){
        System.out.println("===Edges===");
        System.out.println("Number of Edges = "+numEdges);
        for(int i=0;i<numVertices;i++){
            for(int j=i;j<numVertices;j++){
                if (adjMatrix[i][j]==1) {
                    System.out.print(vertex[i]+"-"+vertex[j]+" ");
                }
            }
        }
        System.out.println();
    }

    public void checkComplete(){
            int complete=numVertices*(numVertices+1)/2;
            if(numEdges==complete){
                System.out.println("This graph is a complete graph");
            }
            else{
                System.out.println("This graph is not a complete graph");
            }
    }

}
