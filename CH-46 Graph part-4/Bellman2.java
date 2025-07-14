import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.*;
public class Bellman2 {


    static class edge {
        int src;
        int dest;
        int wt;
       
        public edge(int s, int d,int w) {
            this.src = s;
            this.dest = d;
            this.wt=w;
            
        }
    }
    static void createGraph2(ArrayList<edge>graph) {
        graph.add(new edge(0, 1,2));
        graph.add(new edge(0, 2,4));
        
        graph.add(new edge(1, 2,-4));
        
        graph.add(new edge(2, 3,2));

        graph.add(new edge(3,4, 4));
        
        graph.add(new edge(4, 1,-1));               
}
    public static void bellamford(ArrayList<edge>graph,int src,int V){  //O(EV)
        int dist[]=new int[V];
        for (int i = 0; i < dist.length; i++) {
            if (i!=src) {
                dist[i]=Integer.MAX_VALUE;
            }
        }
            //algo O(V)
            for (int i = 0; i < V-1; i++) {
                //edges   O(E)
                for (int j = 0; j < graph.size(); j++) {
                       edge e=graph.get(j);
                       //u,v,wt
                       int u=e.src;
                       int v=e.dest;
                       int wt=e.wt; 
                       //RELAXATION STEP
                       if (dist[u]!= Integer.MAX_VALUE && dist[u]+wt<dist[v]) {
                        dist[v]=dist[u]+wt;
                       }
                }
            }
            for (int i = 0; i < dist.length; i++) {
                System.out.print(dist[i] + " ");
            }
            System.out.println();
    }
    public static void main(String[] args) {
        int v = 5;
       ArrayList<edge>graph=new ArrayList<>();
        createGraph2(graph); 
        int src=0;
        bellamford(graph, src,v);
        
    }
}
//still TC =O(EV);

