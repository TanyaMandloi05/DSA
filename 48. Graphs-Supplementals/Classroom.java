// import java.util.*;
// public class Classroom {
//      static class Edge {
//         int src; 
//         int dest;
       
//         public Edge(int src, int dest) {
//             this.src = src;
//             this.dest = dest;
//         }
//     }

//     public static void createGraph(ArrayList<Edge> graph[]) {
//         for(int i=0; i<graph.length; i++) {
//             graph[i] = new ArrayList<Edge>();
//         }

//         graph[0].add(new Edge(0, 2));
//         graph[0].add(new Edge(0, 3));
//         graph[1].add(new Edge(1, 0));
//         graph[2].add(new Edge(2, 1));
//         graph[3].add(new Edge(3, 4));

//     }
//     public static void topSort(ArrayList<Edge> graph[], boolean vis[], int curr, Stack<Integer> s) {
//         vis[curr] = true;

//         for(int i=0; i<graph[curr].size(); i++) {
//             Edge e = graph[curr].get(i);
//             if(!vis[e.dest]) {
//                 topSort(graph, vis, e.dest, s);
//             }
             
//         }
//        s.push(curr);
//     }

//     public static void dfs(ArrayList<Edge> transpose[], int curr, boolean vis[]) {
//         vis[curr] = true;
//         System.out.print(curr + " ");

//         for(int i=0; i<transpose[curr].size(); i++) {
//             Edge e = transpose[curr].get(i);
//             if(!vis[e.dest]) {
//                 dfs(transpose, e.dest, vis);
//             }
//         }
//     }

//     public static void kosaRaju(ArrayList<Edge> graph[], int V) {
//         //step-1 topSort
//         Stack<Integer> s = new Stack<>();
//         boolean vis[] = new boolean[V];
//         for(int i=0; i<V; i++) {
//             if(!vis[i]) {
//                 topSort(graph, vis, i, s);
//             }
//         }

//         //step-2 transpose the graph
//         ArrayList<Edge> transpose[] = new ArrayList[V];
//         for(int i=0; i<graph.length; i++) {
//             vis[i] = false;
//             transpose[i] = new ArrayList<Edge>();
//         }

//         for(int i=0; i<V; i++) {
//             for(int j=0; j<graph[i].size(); i++) {
//                 Edge e = graph[i].get(j);
//                 transpose[e.dest].add(new Edge(e.dest, e.src)); //reverse Edge..
//             }
//         }

//         //step-3 dfs
//         while(!s.isEmpty()) {
//             int curr = s.pop();
//             if(!vis[curr]) {
//                 System.out.print("SCC - > ");
//                 dfs(transpose, curr, vis);
//                 System.out.println();
//             }
//         }
//     }

//     public static void main(String args[]) {
//         int V = 5;
//         ArrayList<Edge> graph[] = new ArrayList[V];
//         createGraph(graph);
//         kosaRaju(graph, V);
//     }
// }

// //trjan's algorithm to find bridge...
// import java.util.*;
// public class Classroom {
//      static class Edge {
//         int src; 
//         int dest;
       
//         public Edge(int src, int dest) {
//             this.src = src;
//             this.dest = dest;
//         }
//     }

//     public static void createGraph(ArrayList<Edge> graph[]) {
//         for(int i=0; i<graph.length; i++) {
//             graph[i] = new ArrayList<Edge>();
//         }

//         graph[0].add(new Edge(0, 1));
//         graph[0].add(new Edge(0, 2));
//         graph[0].add(new Edge(0, 3));

//         graph[1].add(new Edge(1, 0));
//         graph[1].add(new Edge(1, 2));

//         graph[2].add(new Edge(2, 0));
//         graph[2].add(new Edge(2, 1));

//         graph[3].add(new Edge(3, 0));
//         graph[3].add(new Edge(3, 4));
//         graph[3].add(new Edge(3, 5));

//         graph[4].add(new Edge(4, 3));
//         graph[4].add(new Edge(4, 5));

//         graph[5].add(new Edge(5, 3));
//         graph[5].add(new Edge(5, 4));
//     }
    

//     public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[], int dt[], int low[], int time, int par) {
//        vis[curr] = true;
//        dt[curr] = low[curr] = ++time;

//        for(int i=0; i<graph[curr].size(); i++) {
//         Edge e = graph[curr].get(i);
//         int neigh = e.dest;

//         if(neigh == par) {
//             continue;
//         } else if(!vis[neigh]) {
//             dfs(graph, neigh, vis, dt, low, time, curr);
//             low[curr] = Math.min(low[curr], low[neigh]);
//             if(dt[curr] < low[neigh]) {
//                 System.out.println("Bridge :" + curr + " ------- " + neigh);
//             }
//         } else {
//             low[curr] = Math.min(low[curr], dt[neigh]);
//         }
//        }
//     }

//     public static void tarjanBridge(ArrayList<Edge> graph[], int V) {
//         int dt[] = new int[V];
//         int low[] = new int[V];
//         int time = 0;
//         boolean vis[] = new boolean[V];

//         for(int i=0; i<V; i++) {
//             if(!vis[i]) {
//                 dfs(graph, i, vis, dt, low, time, -1);
//             }
//         }
//     }
//     public static void main(String args[]) {
//         int V = 6;
//         ArrayList<Edge> graph[] = new ArrayList[V];
//         createGraph(graph);
//         tarjanBridge(graph, V);
//     }
// }

//trjan's algorithm to find Articulation Point...
import java.util.*;
public class Classroom {
     static class Edge {
        int src; 
        int dest;
       
        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
        
        graph[4].add(new Edge(4, 3));
        
    }
    

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[], int dt[], int low[], int time, int par, boolean ap[]) {
       vis[curr] = true;
       dt[curr] = low[curr] = ++time;
       int children = 0;

       for(int i=0; i<graph[curr].size(); i++) {
        Edge e = graph[curr].get(i);
        int neigh = e.dest;

        if(neigh == par) {
            continue;
        } else if(vis[neigh]) {
            low[curr] = Math.min(low[curr], dt[neigh]);
        } else {
            dfs(graph, neigh, vis, dt, low, time, curr, ap);
            low[curr] = Math.min(low[curr], low[neigh]);
            if(par != -1 && dt[curr] <= low[neigh]) {
               ap[curr] = true;
            }
            children++;
         }
       }

       if(par == -1 && children > 1) {
            ap[curr] = true;
         }
    }

    public static void tarjanAp(ArrayList<Edge> graph[], int V) {
        int dt[] = new int[V];
        int low[] = new int[V];
        int time = 0;
        boolean vis[] = new boolean[V];
        boolean ap[] = new boolean[V];

        for(int i=0; i<V; i++) {
            if(!vis[i]) {
                dfs(graph, i, vis, dt, low, time, -1, ap);
            }
        }

         for(int i=0; i<V; i++) {
            if(ap[i]) {
                System.out.println("AP - " + i);
            }
        }
    }
    public static void main(String args[]) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        tarjanAp(graph, V);

    }
}