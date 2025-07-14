import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.*;

public class Bellman{
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
    static void createGraph(ArrayList<edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new edge(0, 1,2));
        graph[0].add(new edge(0, 2,4));
        
        graph[1].add(new edge(1, 2,-4));
        
        graph[2].add(new edge(2, 3,2));


        graph[3].add(new edge(3,4, 4));
        
        graph[4].add(new edge(4, 1,-1));               
}
    public static void bellamford(ArrayList<edge>[] graph,int src){  //O(EV)
        int dist[]=new int[graph.length];
        for (int i = 0; i < dist.length; i++) {
            if (i!=src) {
                dist[i]=Integer.MAX_VALUE;
            }
        }
            int V=graph.length;
            //algo O(V)
            for (int i = 0; i < V-1; i++) {
                //edges   O(E)
                for (int j = 0; j < graph.length; j++) {
                    for (int k = 0; k < graph[k].size(); k++) {
                       edge e=graph[j].get(k);
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
            }
            for (int i = 0; i < dist.length; i++) {
                System.out.print(dist[i] + " ");
            }
            System.out.println();
    }
    public static void main(String[] args) {
        int v = 5;
        ArrayList<edge>[] graph = new ArrayList[v];
        createGraph(graph); 
        int src=0;
        bellamford(graph, src);
        
    }
}