import java.util.*;

public class BFS {
    static class edge {
        int src;
        int dest;
        int wt;
        public edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
public static void bfs(ArrayList<edge>[] graph)
     {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[graph.length];
        q.add(0); // source=0;
        visited[0] = true; // mark the source as visited

        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");

            for (int i = 0; i < graph[curr].size(); i++) {
                edge e = graph[curr].get(i);
                if (!visited[e.dest]) { // check if the node is not visited
                    q.add(e.dest);
                    visited[e.dest] = true; // mark as visited when enqueued
                }
            }
        }
    }

    static void createGraph(ArrayList<edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new edge(0, 1, 1));
        graph[0].add(new edge(0, 2, 1));

        graph[1].add(new edge(1, 0, 1));
        graph[1].add(new edge(1, 3, 1));

        graph[2].add(new edge(2, 0, 1));
        graph[2].add(new edge(2, 4, 1));

        graph[3].add(new edge(3, 1, 1));
        graph[3].add(new edge(3, 4, 1));
        graph[3].add(new edge(3, 5, 1));

        graph[4].add(new edge(4, 2, 1));
        graph[4].add(new edge(4, 3, 1));
        graph[4].add(new edge(4, 5, 1));

        graph[5].add(new edge(5, 3, 1));
        graph[5].add(new edge(5, 4, 1));
        graph[5].add(new edge(5, 6, 1));

        graph[6].add(new edge(6, 5, 1)); 
    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<edge>[] graph = new ArrayList[v];
        createGraph(graph);
        bfs(graph);
    }
}
