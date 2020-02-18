package DataStructures.Graphs;

public class DijkstrasShortestPath {
    public static void main(String[] args) {

        WeightedGraph graph = new WeightedGraph(4);
        graph.addEdge(0, 1,4);
        graph.addEdge(0, 2,8);
        graph.addEdge(1, 2,2);
        graph.addEdge(1, 3,10);
        graph.addEdge(2, 3,1);
        graph.addEdge(2, 1,1);
        graph.printGraph();
        System.out.println();
        graph.findDijkstrasShortestPath(0);
        System.out.println();
        graph.findDijkstrasShortestPath(2);

        System.out.println("\n\n");

        WeightedGraph graph2 = new WeightedGraph(5);
        graph2.addEdge(0, 1,4);
        graph2.addEdge(0, 2,1);
        graph2.addEdge(2, 1,2);
        graph2.addEdge(2, 3,4);
        graph2.addEdge(1, 4,4);
        graph2.addEdge(3, 4,4);
        graph2.printGraph();
        System.out.println();
        graph2.findDijkstrasShortestPath(0);

    }
}
