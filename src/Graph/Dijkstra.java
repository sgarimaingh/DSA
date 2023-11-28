package Graph;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Dijkstra {

    void shortestPath(WeightedGraph G, int source){

        PriorityQueue<WeightedGraph.Pair> q = new PriorityQueue<>(G.V, Comparator.comparingInt(o -> o.first) );
        int[] dist = new int[G.V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        q.add(new WeightedGraph.Pair(0, source));
        dist[source]=0;
        while(!q.isEmpty()){
            int u  = q.poll().second;
            for(WeightedGraph.Pair v: G.adj.get(u)){
                if(dist[v.first] > dist[u]+ v.second){
                    dist[v.first] = dist[u]+v.second;
                    q.add(new WeightedGraph.Pair(dist[v.first],v.first));
                }
            }
        }

        System.out.println("Vertex Distance from Source");
        for (int i = 0; i < G.V; i++) {
            System.out.println(i + "\t\t" + dist[i]);
        }

    }
}
