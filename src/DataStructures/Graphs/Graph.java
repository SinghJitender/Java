package DataStructures.Graphs;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

    private int V;
    private LinkedList<Integer> adj[];

    Graph(int v) {
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

    public void BFS(int v){
        System.out.print(v + " - ");
        boolean[] visited = new boolean[V];
        BFSUtil(v,visited);
    }

    private void BFSUtil(int v,boolean[] visited){
        if(visited[v]==true) {
            return;
        }
        visited[v] = true;
        Iterator<Integer> iterator = adj[v].listIterator();
        ArrayList<Integer> list = new ArrayList<>();
        while(iterator.hasNext()){
            Integer i = iterator.next();
            if(visited[i] != true) {
                list.add(i);
                System.out.print(i + " - ");
            }
        }
        for(int i=0;i<list.size();i++){
            BFSUtil(list.get(i),visited);
        }
    }

    public void printAllPathsToFrom(int edgeTo,int edgeFrom) {

        printAllPaths(edgeTo,edgeFrom,new ArrayList<>());
    }

    private void printAllPaths(int to, int from,ArrayList<Integer> list) {
        list.add(to);
        if(to==from) {
            System.out.println(list);
            return;
        }

        Iterator<Integer> iterator = adj[to].iterator();
        while(iterator.hasNext()) {
            Integer i = iterator.next();
            if(list.contains(i)!=true) {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.addAll(list);
                printAllPaths(i, from, temp);
            }
        }
    }

}
