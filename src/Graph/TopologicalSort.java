package Graph;

import java.util.Iterator;
import java.util.Stack;

public class TopologicalSort {

    void sort(Graph G){
        Stack<Integer> s = new Stack<>();
        boolean visited[] = new boolean[G.V];

        for(int i =0;i<G.V;i++) visited[i]=false;
        for(int i=0;i<G.V;i++){
            if(visited[i]==false){
                sortUtil(i,visited,s,G);
            }
        }
        while(!s.isEmpty()){
            System.out.println(s.pop()+" ");
        }
    }
    void sortUtil(int v, boolean visited[], Stack<Integer> s, Graph G){
        visited[v] = true;
        Integer i;
        Iterator<Integer> it = G.adj[v].listIterator();
        while(it.hasNext()){
            i=it.next();
            if(!visited[i]){
                sortUtil(i,visited,s,G);
            }
        }
        s.push(v);

    }
}
