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


    }
}
