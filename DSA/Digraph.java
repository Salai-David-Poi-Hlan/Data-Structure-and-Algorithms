package DSA;

public class Digraph {
    private final int MAX_VERTICES=20;
    private char[] vertex;
    private int[][] adjMatrix;
    private int numVertices;
    private int numEdges;

    public Digraph(){
        vertex=new char[MAX_VERTICES];
        adjMatrix=new int[MAX_VERTICES][MAX_VERTICES];
        numEdges=0;
        numVertices=0;
        for(int i=0;i<MAX_VERTICES;i++){
            for(int j=0;j<MAX_VERTICES;j++){
                adjMatrix[i][j]=0;
            }
        }
    }

    public void addVertex(char title){
        vertex[numVertices++]=title;
    }

    public void AddEdges(int start,int end,int weight){
        adjMatrix[start][end]=weight;
        numEdges++;
    }

    public void showSize(){
        System.out.println("Size of graph = "+numVertices);
        System.out.println();
    }

    public void showVertex(){
        System.out.println("===Vertices===");
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
            System.out.println();
        }
        System.out.println();
    }
    public void showEdges(){
        System.out.println("=== Edges ===");
        for(int i=0;i<numVertices;i++){
            for(int j=0;j<numVertices;j++){
                if (adjMatrix[i][j]>0) {
                    System.out.print(vertex[i]+"-"+vertex[j]+"("+adjMatrix[i][j]+") ");
                }
            }
        }
        System.out.println();
    }
    public void checkComplete(){
        int complete=numVertices*(numVertices-1);
        if(numEdges==complete){
            System.out.println("This graph is a complete graph");
        }else{
            System.out.println("This graph is not a complete graph");
        }
    }

    public int findpathLength(int [] path){
        int pathLength=0;
        for(int i=0;i<path.length-1;i++){
               pathLength=pathLength+adjMatrix[path[i]][path[i+1]];
        }
        return pathLength;
    }

}
