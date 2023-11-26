package Graph;

import java.util.Iterator;
import java.util.Stack;

public class DFS {

    void DFS(int v, Graph G){
        boolean visited[] = new boolean[G.V];
        for (int i = 0; i < G.V; i++)
            visited[i]=false;
        Stack<Integer> s = new Stack<>();
        s.push(v);
        while(!s.isEmpty()){
            v=s.peek();
            s.pop();
            if(visited[v]==false){
                System.out.println(v+" ");
                visited[v]=true;
            }
            Iterator<Integer> i = G.adj[v].listIterator();

            while(i.hasNext()){
                int w = i.next();
                if(!visited[w]){
                    s.push(w);
                }
            }
        }
    }
}
