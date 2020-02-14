package DataStructures.Graphs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class WeightedGraph {

    private int V;
    private LinkedList<Integer> adj[];
    private LinkedList<Integer> weights[];

    WeightedGraph(int v) {
        V = v;
        adj = new LinkedList[V];
        weights = new LinkedList[V];
        for (int i=0; i<V; ++i) {
            adj[i] = new LinkedList();
            weights[i] = new LinkedList();
        }
    }

    public void addEdge(int v, int w, int weight) {
        adj[v].add(w);
        weights[v].add(weight);
    }

    public void printGraph() {
        for(int i=0;i<adj.length;i++) {
            for(int j=0; j<adj[i].size();j++) {
                System.out.println(i+ " - "+adj[i].get(j)+ "   Weight : "+weights[i].get(j));
            }
        }
    }

    public void findDijkstrasShortestPath(int v) {
        int[] distance = new int[V];
        for(int i=0;i<V;i++) {
            if(i!=v)
                distance[i] = Integer.MAX_VALUE;
        }
        findShortestPathFrom(v,0, distance, new HashSet<>());
        for(int i=0;i<distance.length;i++) {
            System.out.println("From "+v+" To "+i +" minimum distance weight is : "+ (distance[i]==Integer.MAX_VALUE?" NULL (No Way Found)":distance[i]));
        }
    }

    private void findShortestPathFrom(int v,int weight, int distance[], Set<Integer> visited) {
        visited.add(v);
        for(int i=0;i<adj[v].size();i++) {
            if(visited.contains(adj[v].get(i))==false) {
                HashSet<Integer> set = new HashSet<>();
                set.addAll(visited);
                set.add(adj[v].get(i));
                if (distance[adj[v].get(i)] > weight + weights[v].get(i)) {
                    distance[adj[v].get(i)] = weight + weights[v].get(i);
                }
                findShortestPathFrom(adj[v].get(i), weight + weights[v].get(i), distance, set);
            }
        }
    }


}
