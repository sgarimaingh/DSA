package Graph;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS {

    void BFS(int s, Graph G){

        boolean visited[] = new boolean[G.V];
        LinkedList<Integer> q = new LinkedList<Integer>();
        visited[s] = true;
        q.add(s);

        while(q.size()!=0){
            s = q.poll();
            System.out.println(s+" ");
            Iterator<Integer> i = G.adj[s].listIterator();

            while(i.hasNext()){
                int w = i.next();
                if(!visited[w]){
                    visited[w]=true;
                    q.add(w);
                }
            }
        }
    }
}
