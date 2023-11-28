package Graph;

public class FW {

    void fw(int [][] graph){
        int n = graph.length;

        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(graph[i][k]+graph[k][j] < graph[i][j]){
                        graph[i][j]=graph[i][k]+graph[k][j];
                    }
                }
            }
        }
        System.out.println(
                "The following matrix shows the shortest distances between every pair of vertices");
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (graph[i][j] == 99999)
                    System.out.print("INF ");
                else
                    System.out.print(graph[i][j] + "   ");
            }
            System.out.println();
        }


    }
}
