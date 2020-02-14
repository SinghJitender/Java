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
    }
}
