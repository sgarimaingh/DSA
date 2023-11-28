package Graph;

import org.graalvm.collections.Pair;

import java.util.*;

public class WeightedGraph {

    int V;
    List<List<Pair>> adj;

    WeightedGraph(int v) {
        V = v;
        adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v, int w){
        adj.get(u).add(new Pair(v,w));
        adj.get(v).add(new Pair(u,w));
    }

    static class Pair {
        int first, second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}
