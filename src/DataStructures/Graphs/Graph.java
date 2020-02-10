package DataStructures.Graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

    private int V;
    private LinkedList<Integer> adj[];

    Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    public void addEdge(int v, int w)
    {
        adj[v].add(w);
    }

    public void DFS(int v) {
        boolean visited[] = new boolean[V];
        DFSUtil(v,visited);
    }

    private void DFSUtil(int v,boolean[] visited){
        visited[v]=true;
        System.out.print(v+" - ");

        Iterator<Integer> iterator = adj[v].iterator();
        while(iterator.hasNext()){
            Integer i = iterator.next();
            if(visited[i]!=true)
                DFSUtil(i,visited);
        }
    }


}
