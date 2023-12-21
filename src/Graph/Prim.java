package Graph;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;


public class Prim {

    void mst(WeightedGraph g, int src){
        PriorityQueue<WeightedGraph.Pair> q = new PriorityQueue<>(g.V, Comparator.comparingInt(a -> a.second));
        boolean [] visited = new boolean[g.V];
        int key[] = new int[g.V];
        int[] parent = new int[g.V];
        Arrays.fill(parent, -1);
        Arrays.fill(key,Integer.MAX_VALUE);
        q.add(new WeightedGraph.Pair(0,src));
        key[src]=0;
        while(!q.isEmpty()){
            int u = q.peek().second;
            q.poll();
            if(visited[u]) continue;
            visited[u] = true;
            for(WeightedGraph.Pair e: g.adj.get(u)){
                int v = e.first;
                int w = e.second;
                if(!visited[v] && key[v]>w){
                    key[v] = w;
                    q.add(new WeightedGraph.Pair(key[v],v));
                    parent[v] = u;
                }
            }
        }
        for (int i = 1; i < g.V; i++) {
            System.out.println(parent[i] + " - " + i);
        }

    }
}
