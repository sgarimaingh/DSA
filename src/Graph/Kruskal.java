package Graph;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Kruskal {

    static class Edge{
        int src,dest,w;
        Edge(int src,int dest,int w){
            this.dest = dest;
            this.src = src;
            this.w=w;
        }
    }

    int find(int[] parent, int x){
        if(parent[x] !=x){
            parent[x]=find(parent,parent[x]);
        }
        return parent[x];
    }

    void union(int[] parent, int[] rank, int x,int y){
        int xRoot = find(parent,x);
        int yRoot = find(parent,y);
        if(rank[xRoot]<rank[yRoot]){
            parent[xRoot] = yRoot;
        }
        else if(rank[xRoot]>rank[yRoot]){
            parent[yRoot]=xRoot;
        }
        else{
            parent[yRoot] = xRoot;
            rank[xRoot]++;
        }
    }

    void kruskal(List<Edge> edges, int V){
        Edge results[] = new Edge[V];
        edges.sort(Comparator.comparingInt(a -> a.w));
        int [] parent = new int[V];
        int [] rank =new int[V];
        for(int i=0;i<V;i++){
            parent[i]=i;
            rank[i]=0;
        }
        int e=0,j=0;
        while(e<V-1){
            Edge next = edges.get(j);
            int x = find(parent,next.src);
            int y = find(parent, next.dest);
            if(x!=y){
                results[e]=next;
                union(parent,rank,x,y);
                e++;
            }
            j++;
        }
        System.out.println(
                "Following are the edges of the constructed MST:");
        int minCost = 0;
        for (int i = 0; i < e; i++) {
            System.out.println(results[i].src + " -- "
                    + results[i].dest + " == "
                    + results[i].w );
            minCost += results[i].w ;
        }
        System.out.println("Total cost of MST: " + minCost);




    }
}
