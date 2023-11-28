package Graph;


public class Main {

    public static void main(String[] args) {

        Graph graph = new Graph(10);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(3, 6);
        graph.addEdge(4, 7);
        graph.addEdge(4, 5);
        graph.addEdge(5, 2);
        graph.addEdge(6, 5);
        graph.addEdge(7, 5);
        graph.addEdge(7, 8);

        //BFS
        System.out.println("BFS:");
        BFS b = new BFS();
        b.BFS(0,graph);

        //DFS
        System.out.println("DFS:");
        DFS d = new DFS();
        d.DFS(0,graph);

        //topological sort
        System.out.println("Sorted edges:");
        TopologicalSort t = new TopologicalSort();
        t.sort(graph);


        //dijkstra
        int V = 9;
        WeightedGraph g = new WeightedGraph(V);

        g.addEdge(0, 1, 4);
        g.addEdge(0, 7, 8);
        g.addEdge(1, 2, 8);
        g.addEdge(1, 7, 11);
        g.addEdge(2, 3, 7);
        g.addEdge(2, 8, 2);
        g.addEdge(2, 5, 4);
        g.addEdge(3, 4, 9);
        g.addEdge(3, 5, 14);
        g.addEdge(4, 5, 10);
        g.addEdge(5, 6, 2);
        g.addEdge(6, 7, 1);
        g.addEdge(6, 8, 6);
        g.addEdge(7, 8, 7);


        System.out.println("Shortest paths:");
        Dijkstra dijkstra = new Dijkstra();
        dijkstra.shortestPath(g, 0);

        //Bellman-ford
        int Ver = 5; // Number of vertices in graph
        int E = 8; // Number of edges in graph

        BellmanFord.Graph graph1 = new BellmanFord.Graph(Ver,E);

        graph1.edge[0].src = 0;
        graph1.edge[0].dest = 1;
        graph1.edge[0].w = -1;

        graph1.edge[1].src = 0;
        graph1.edge[1].dest = 2;
        graph1.edge[1].w = 4;

        graph1.edge[2].src = 1;
        graph1.edge[2].dest = 2;
        graph1.edge[2].w = 3;

        graph1.edge[3].src = 1;
        graph1.edge[3].dest = 3;
        graph1.edge[3].w = 2;

        graph1.edge[4].src = 1;
        graph1.edge[4].dest = 4;
        graph1.edge[4].w = 2;

        graph1.edge[5].src = 3;
        graph1.edge[5].dest = 2;
        graph1.edge[5].w = 5;

        graph1.edge[6].src = 3;
        graph1.edge[6].dest = 1;
        graph1.edge[6].w = 1;


        graph1.edge[7].src = 4;
        graph1.edge[7].dest = 3;
        graph1.edge[7].w = -3;

        BellmanFord bf = new BellmanFord();
        bf.bellmanFord(graph1, 0);



    }
}
