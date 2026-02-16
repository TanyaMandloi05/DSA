// //BFS code for non - connected grphs
// import java.util.*;
// public class Classroom {
//     static class Edge {
//         int src;
//         int des;
//         int wt;

//         public Edge(int s, int d, int w) {
//             this.src = s;
//             this.des = d;
//             this.wt = w;
//         }
//     }

//     static void createGraph(ArrayList<Edge> graph[], int v) {
//         for(int i=0; i<v; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         //0 vertex
//         graph[0].add(new Edge(0, 1, 1));
//         graph[0].add(new Edge(0, 2, 1));

//         //1 vertex
//         graph[1].add(new Edge(1, 0, 1));
//         graph[1].add(new Edge(1, 3, 1));
     
//         //2 vertex
//         graph[2].add(new Edge(2, 0, 1));
//         graph[2].add(new Edge(2, 4, 1));
       
//         //3 vertex
//         graph[3].add(new Edge(3, 1, 1));
//         graph[3].add(new Edge(3, 4, 1));
//         graph[3].add(new Edge(3, 1, 1));

//         //4 vertex
//         graph[4].add(new Edge(3, 2, 1));
//         graph[4].add(new Edge(4, 3, 1));
//         graph[4].add(new Edge(4, 5, 1));

//         //5 vertex
//         graph[5].add(new Edge(5, 3, 1));
//         graph[5].add(new Edge(5, 4, 1));
//         graph[5].add(new Edge(5, 6, 1));

//         //6 vertex
//         graph[6].add(new Edge(6, 5, 1));
//     }

//     public static void bfs(ArrayList<Edge>[] graph) {
//         boolean vis[] = new boolean[graph.length];
//         for(int i=0; i<graph.length; i++) {
//             if(!vis[i]) {
//                 bfsUtil(graph, vis)
//             }
//         }
        
//     }

//     public static void bfsUtil(ArrayList<Edge>[] graph) {
//         Queue<Integer> q = new LinkedList<>();
//         q.add(0);

//         while(!q.isEmpty()) {
//             int curr = q.remove();

//             if(!vis[curr]) {
//                 System.out.print(curr + " ");
//                 vis[curr] = true;
//                 for(int i=0; i<graph[curr].size(); i++) {
//                     Edge e = graph[curr].get(i);
//                     q.add(e.des);
//                 }
//             }
//         }
//     }

//     public static void main(String agrs[]) {
//         int v = 7;
//         ArrayList<Edge>[] graph = new ArrayList[v]; //null
//         createGraph(graph, v);
//         bfs(graph);
//       }
// }


// //DFS code for non-connected graph
// import java.util.*;
// public class Classroom {
//     static class Edge {
//         int src;
//         int des;
//         int wt;

//         public Edge(int s, int d, int w) {
//             this.src = s;
//             this.des = d;
//             this.wt = w;
//         }
//     }

//     static void createGraph(ArrayList<Edge> graph[], int v) {
//         for(int i=0; i<v; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         //0 vertex
//         graph[0].add(new Edge(0, 1, 1));
//         graph[0].add(new Edge(0, 2, 1));

//         //1 vertex
//         graph[1].add(new Edge(1, 0, 1));
//         graph[1].add(new Edge(1, 3, 1));
     
//         //2 vertex
//         graph[2].add(new Edge(2, 0, 1));
//         graph[2].add(new Edge(2, 4, 1));
       
//         //3 vertex
//         graph[3].add(new Edge(3, 1, 1));
//         graph[3].add(new Edge(3, 4, 1));
//         graph[3].add(new Edge(3, 1, 1));

//         //4 vertex
//         graph[4].add(new Edge(3, 2, 1));
//         graph[4].add(new Edge(4, 3, 1));
//         graph[4].add(new Edge(4, 5, 1));

//         //5 vertex
//         graph[5].add(new Edge(5, 3, 1));
//         graph[5].add(new Edge(5, 4, 1));
//         graph[5].add(new Edge(5, 6, 1));

//         //6 vertex
//         graph[6].add(new Edge(6, 5, 1));
//     }

//      public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] vis) {
//         boolean vis[] = new boolean[graph.length];

//         for(int i=0; i<graph.length; i++) {
//             dfsUtil(graph, i, vis);
//         }
//     }

//     public static void dfsUtil(ArrayList<Edge>[] graph, int curr, boolean[] vis) {
//         //visit or true
//         System.out.print(curr + " ");
//         vis[curr] = true;

//         for(int i=0; i<graph[curr].size(); i++) {
//             Edge e = graph[curr].get(i);
//             if(!vis[e.des]) {
//                 dfsUtil(graph, e.des, vis);
//             }
//         }
//     }
       
//     public static void main(String agrs[]) {
//         int v = 7;
//         ArrayList<Edge>[] graph = new ArrayList[v]; //null
//         createGraph(graph, v);
//         dfs(graph, 0, new boolean[v]);
//       }
// }

// //cycle detection for undirected graph
// import java.util.*;
// public class Classroom {
//     static class Edge {
//         int src;
//         int dest;
//         int wt;

//         public Edge(int src, int dest, int wt) {
//             this.src = src;
//             this.dest = dest;
//             this.wt = wt;
//         }
//     }

//     public static void createGraph(ArrayList<Edge> graph[], int V) {
//         for(int i=0; i<V; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         graph[0].add(new Edge(0, 1, 1));
//         graph[0].add(new Edge(0, 4, 1));

//         //vertex-1
//         graph[1].add(new Edge(1, 0, 1));
//         graph[1].add(new Edge(1, 2, 1));
//         graph[1].add(new Edge(1, 4, 1));

//         //vertex-2
//         graph[2].add(new Edge(2, 1, 1));
//         graph[2].add(new Edge(2, 3, 1));

//         //vertex-3
//         graph[3].add(new Edge(3, 2, 1));

//         //vertex-4
//         graph[4].add(new Edge(4, 1, 1));
//         graph[4].add(new Edge(4, 0, 1));
//         graph[4].add(new Edge(4, 5, 1));

//         //vertex-5
//         graph[5].add(new Edge(5, 4, 1));
//     }

//     public static boolean cycleUndirected(ArrayList<Edge> graph[], int curr, int par, boolean vis[]) {
//         vis[curr] = true;
        
//         for(int i=0; i<graph[curr].size(); i++) {
//             Edge e = graph[curr].get(i);

//             if(vis[e.dest] && e.dest != par) {
//                 return true;
//             }

//             else if(!vis[e.dest]) {
//                 if(cycleUndirected(graph, e.dest, curr, vis)){
//                     return true;
//                 }
//             }
//         }

//         return false;
//     }

//     public static void main(String args[]) {
//         int V = 6;
//         ArrayList<Edge>[] graph = new ArrayList[V];
//         createGraph(graph, V);

//         System.out.println();
//         System.out.println();
//         System.out.print(cycleUndirected(graph, 0, -1, new boolean[6]));
//     }
// }


// // cycle detection for directed graph
// import java.util.*;
// public class Classroom {
//     static class Edge {
//         int src;
//         int dest;
//         int wt;

//         public Edge(int src, int dest, int wt) {
//             this.src = src;
//             this.dest = dest;
//             this.wt = wt;
//         }
//     }

// //     public static void createGraph(ArrayList<Edge> graph[], int V) { //cycle dont exists
// //         for(int i=0; i<V; i++) {
// //             graph[i] = new ArrayList<>();
// //         }

// //         graph[0].add(new Edge(0, 1, 1));
// //         graph[0].add(new Edge(0, 2, 1));

// //         //vertex-1
// //         graph[1].add(new Edge(1, 3, 1));
       
// //         //vertex-2
// //         graph[2].add(new Edge(2, 3, 1));
        
// //   }

//  public static void createGraph(ArrayList<Edge> graph[], int V) { //cycle exits
//         for(int i=0; i<V; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         //vertex-0
//         graph[0].add(new Edge(0, 1, 1));

//         //vertex-1
//         graph[1].add(new Edge(1, 0, 1));
       
//         //vertex-2
//         graph[2].add(new Edge(2, 3, 1));

//         //vertex-3
//         graph[3].add(new Edge(3, 0, 1));
        
//   }

//    public static boolean isCycle(ArrayList<Edge> graph[]) {

//     boolean vis[] = new boolean[graph.length];
//     boolean stack[] = new boolean[graph.length];

//         for(int i=0; i<graph.length; i++) {
//             if(!vis[i]) {
//                 if(isCycleUtil(graph, i, vis, stack)){
//                     return true;
//                 }
//             }
//         }
//         return false;
//    }

//     public static boolean isCycleUtil(ArrayList<Edge> graph[], int curr, boolean vis[], boolean stack[] ) {
//         vis[curr] = true;
//         stack[curr] = true;

//         for(int i=0; i<graph[curr].size(); i++) {
//             Edge e = graph[curr].get(i);

//             if(stack[e.dest]) {
//                 return true;
//             }

//             if(!vis[e.dest] && (isCycleUtil(graph, e.dest, vis, stack))) {
//                return true;
//             }
//         }

//         stack[curr] = false;
//         return false;
//     }   

//     public static void main(String args[]) {
//         int V = 4;
//         ArrayList<Edge>[] graph = new ArrayList[V];
//         createGraph(graph, V);

//         System.out.println();
//         System.out.println();
//         System.out.println(isCycle(graph));
       
//     }
// }

//IsBiapartite..
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

    public static void createGraph(ArrayList<Edge> graph[], int V) {
        for(int i=0; i<V; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
    }
    
    public static boolean isBipartite(ArrayList<Edge> graph[]) {
        
        int color[] = new int[graph.length];
        for(int i=0; i<color.length; i++) {
            color[i] = -1; // no color;
        }

        Queue<Integer> q = new LinkedList<>();

         for(int i=0; i<graph.length; i++) {
            if(color[i] == -1) {
                 q.add(i);
                 color[i] = 0;

                 while(!q.isEmpty()) {
                    int curr = q.remove();

                    for(int j=0; j<graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j);

                        if(color[e.dest] == -1) {
                            int nextColor = color[curr] == 0 ? 1 : 0;
                            color[e.dest] = nextColor;
                            q.add(e.dest);

                        } else if(color[e.dest] == color[curr]) {
                            return false;
                        }
                    }
                 }
            }
        }

        return true;
    }

    public static void main(String args[]) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph, V);
        System.out.print(isBipartite(graph));
    }
}


// //Topological sorting using dfs..
// import java.util.*;
// public class Classroom {
//     static class Edge {
//         int src;
//         int des;
//         int wt;

//         public Edge(int s, int d, int w) {
//             this.src = s;
//             this.des = d;
//             this.wt = w;
//         }
//     }

//     static void createGraph(ArrayList<Edge> graph[], int v) {
//         for(int i=0; i<v; i++) {
//             graph[i] = new ArrayList<>();
//         }
     
//         //2 vertex
//         graph[2].add(new Edge(2, 3, 1));

//         //3 vertex
//         graph[3].add(new Edge(3, 1, 1));
        
//         //4 vertex
//         graph[4].add(new Edge(4, 0, 1));
//         graph[4].add(new Edge(4, 1, 1));
        
//         //5 vertex
//         graph[5].add(new Edge(5, 0, 1));
//         graph[5].add(new Edge(5, 2, 1));
        
//     }

//      public static void topSort(ArrayList<Edge>[] graph) {
//         boolean vis[] = new boolean[graph.length];
//         Stack<Integer> s = new Stack<>();

//         for(int i=0; i<graph.length; i++) {
//             if(!vis[i]){
//                 topSortsUtil(graph, i, vis, s);
//             }   
//         }

//          while(!s.isEmpty()) {
//                 System.out.print(s.pop() + " ");
//             }
//     }

//     public static void topSortsUtil(ArrayList<Edge>[] graph, int curr, boolean[] vis, Stack<Integer> s) {
      
//         vis[curr] = true;

//         for(int i=0; i<graph[curr].size(); i++) {
//             Edge e = graph[curr].get(i);
//             if(!vis[e.des]) {
//                 topSortsUtil(graph, e.des, vis, s);
//             }
            
//         }
//         s.push(curr);
//     }
       
//     public static void main(String agrs[]) {
//         int v = 6;
//         ArrayList<Edge>[] graph = new ArrayList[v]; //null
//         createGraph(graph, v);
//         topSort(graph);
//       }
// }

//Topological sorting using Bfs (Khan's algorithm)..
import java.util.*;
public class Classroom {
    static class Edge {
        int src;
        int des;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.des = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge> graph[], int v) {
        for(int i=0; i<v; i++) {
            graph[i] = new ArrayList<>();
        }
     
        //2 vertex
        graph[2].add(new Edge(2, 3, 1));

        //3 vertex
        graph[3].add(new Edge(3, 1, 1));
        
        //4 vertex
        graph[4].add(new Edge(4, 0, 1));
        graph[4].add(new Edge(4, 1, 1));
        
        //5 vertex
        graph[5].add(new Edge(5, 0, 1));
        graph[5].add(new Edge(5, 2, 1));
        
    }

     public static void calIndeg(ArrayList<Edge> graph[], int indeg[]) {

        for(int i=0; i< graph.length; i++) {
            int v = i;

            for(int  j=0; j<graph[v].size(); j++) {
                Edge e = graph[v].get(j);
                indeg[e.des]++;
            }
        }
     }
     public static void topSort(ArrayList<Edge>[] graph) {
        int indeg[] = new int[graph.length];
        calIndeg(graph, indeg);
        Queue<Integer> q = new LinkedList<>();

            for(int i=0; i<indeg.length; i++) {
                if(indeg[i] == 0) {
                    q.add(i);
                }
            }

             while(!q.isEmpty()) {
                 int curr = q.remove();
                System.out.print(curr + " ");

                for(int i=0; i<graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    indeg[e.des]--;
                    if(indeg[e.des] == 0) {
                        q.add(e.des);
                    }
                }
            }
    }

    public static void main(String agrs[]) {
        int v = 6;
        ArrayList<Edge>[] graph = new ArrayList[v]; //null
        createGraph(graph, v);
        topSort(graph);
      }
}


// //All path from source to destination..
// import java.util.*;
// public class Classroom {
//     static class Edge {
//         int src;
//         int des;
//         int wt;

//         public Edge(int s, int d, int w) {
//             this.src = s;
//             this.des = d;
//             this.wt = w;
//         }
//     }

//     static void createGraph(ArrayList<Edge> graph[], int v) {
//         for(int i=0; i<v; i++) {
//             graph[i] = new ArrayList<>();
//         }
     
//         //0 vertex
//         graph[0].add(new Edge(0, 3, 1));
//         //2 vertex
//         graph[2].add(new Edge(2, 3, 1));

//         //3 vertex
//         graph[3].add(new Edge(3, 1, 1));
        
//         //4 vertex
//         graph[4].add(new Edge(4, 0, 1));
//         graph[4].add(new Edge(4, 1, 1));
        
//         //5 vertex
//         graph[5].add(new Edge(5, 0, 1));
//         graph[5].add(new Edge(5, 2, 1));
        
//     }

//     public static void printAllPath(ArrayList<Edge> graph[], int src, int des, String path) {
//         if(src == des) {
//           System.out.println(path+ src);
//           return;
//         }

//         for(int i=0; i<graph[src].size(); i++) {
//             Edge e = graph[src].get(i);
//             printAllPath(graph, e.des, des, path+src);
//         }
//     }
//     public static void main(String agrs[]) {
//         int v = 6;
//         ArrayList<Edge>[] graph = new ArrayList[v]; //null
//         createGraph(graph, v);
//         int src = 5, des = 1;
//         printAllPath(graph, src, des, "");
//       }
// }

//Dijkstra algorithm..
import java.util.*;
public class Classroom {
    static class Edge {
        int src;
        int des;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.des = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge> graph[], int v) {
        for(int i=0; i<v; i++) {
            graph[i] = new ArrayList<>();
        }
     
        //0 vertex
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        //1 vertex
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 7));

        //2 vertex
        graph[2].add(new Edge(2, 4, 3));

        //3 vertex
        graph[3].add(new Edge(3, 5, 1));
        
        //4 vertex
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
            
    }

    static class Pair implements Comparable<Pair> {
        int n;
        int path;

        public Pair (int n, int path) {
            this.path = path;
            this.n = n;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.path - p2.path;
        }
    }

    public static void dijkstra(ArrayList<Edge> graph[], int src) {
        int dist[] = new int[graph.length];
        for(int i=0; i<graph.length; i++) {
            if(i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
          
          boolean vis[] = new boolean[graph.length];
          PriorityQueue<Pair> pq = new PriorityQueue<>();
          pq.add(new Pair(src, 0));

          while(!pq.isEmpty()) {
            Pair curr = pq.remove();
            if(!vis[curr.n]) {
                vis[curr.n] = true;

                //neighbours
                for(int i=0; i<graph[curr.n].size(); i++) {
                    Edge e = graph[curr.n].get(i);
                    int u = e.src;
                    int v = e.des;
                    int wt = e.wt;

                    if(dist[u] + wt < dist[v]) {
                        dist[v] = dist[u] + wt;
                        pq.add(new Pair(v, dist[v]));
                    }    
               }
          }

         }

         for(int i=0; i<dist.length; i++) {
            System.out.print(dist[i] + " ");
         }

         System.out.println();
    }
    public static void main(String agrs[]) {
        int v = 8;
        ArrayList<Edge>[] graph = new ArrayList[v]; //null
        createGraph(graph, v);
        dijkstra(graph, 0);
      }
}







