package DataStructures.Graphs;

public class FindPathsinGraph {
    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        System.out.println("Paths from 0 to 3");
        graph.printAllPathsToFrom(0,3);

        System.out.println("Paths from 3 to 1");
        graph.printAllPathsToFrom(3,1);
    }
}
