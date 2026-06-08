import java.util.ArrayList;
import java.util.*;

public class Bipartite {
    static class edge {
        int src;
        int dest;
       
        public edge(int s, int d) {
            this.src = s;
            this.dest = d;
            
        }
    }
     static void createGraph(ArrayList<edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new edge(0, 1));
        graph[0].add(new edge(0, 2));
        

        graph[1].add(new edge(1, 0));
        graph[1].add(new edge(1, 3));
       

        graph[2].add(new edge(2, 0));
        graph[2].add(new edge(2, 4));

        graph[3].add(new edge(3, 1));
        graph[3].add(new edge(3, 4));
        

        graph[4].add(new edge(4, 2));
        graph[4].add(new edge(4, 3));
    

}
public static boolean ispartite(ArrayList<edge>graph[]){
    int color[]=new int[graph.length];
    for (int i = 0; i < color.length; i++) {
        color[i]=-1;//no color
    }
    Queue<Integer>q=new LinkedList<>(); 
    for (int i = 0; i < graph.length; i++) {
        if (color[i]==-1) {
            q.add(i);
            color[i]=0;//here 0 means yellow color
            while (!q.isEmpty()) {
                int curr=q.remove();
                for (int j = 0; j < graph[curr].size(); j++) {
                    edge e=graph[curr].get(j);
                    //case 1
                    if (color[e.dest]==-1) {
                        int nextcol=color[curr]==0 ? 1 : 0;
                        color[e.dest]=nextcol;
                        q.add(e.dest);
                    }
                    //case 2
                    else if(color[e.dest]==color[curr]){
                        return false;//non bipartite graph
                    }
                }
            }
        }
    }
    return true;
}
public static void main(String[] args) {
    int v = 5;
    ArrayList<edge>[] graph = new ArrayList[v];
    createGraph(graph);
    System.out.println(ispartite(graph));
}
}
