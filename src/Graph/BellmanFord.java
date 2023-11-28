package Graph;

import java.util.Arrays;

public class BellmanFord {

    static class Graph{
        private int V,E;
        class Edge{
            int src,dest,w;
            Edge(){
                src = dest=w=0;
            }
        }

        Edge edge[];
        Graph(int v,int e){
            V = v;
            E = e;
            edge = new Edge[e];
            for (int i = 0; i < e; ++i)
                edge[i] = new Edge();
        }
    }

    void bellmanFord(Graph g, int src){

        int dist[] = new int[g.V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src]=0;

        for(int i=0;i<g.V-1;i++){
            for(int j=0;j<g.E;j++){
                int u= g.edge[j].src;
                int v = g.edge[j].dest;
                int w = g.edge[j].w;
                if(dist[v]>dist[u]+w){
                    dist[v]=dist[u]+w;
                }
            }
        }

        for(int j=0;j<g.E;j++){
            int u= g.edge[j].src;
            int v = g.edge[j].dest;
            int w = g.edge[j].w;
            if(dist[v]>dist[u]+w){
                System.out.println("Negative weight cycle");
                return;
            }
        }
        System.out.println("Vertex Distance from Source");
        for (int i = 0; i < g.V; ++i)
            System.out.println(i + "\t\t" + dist[i]);
    }
}
