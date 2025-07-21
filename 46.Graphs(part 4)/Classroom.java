// //Bellman Ford algorithm
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

//     static void createGraph(ArrayList<Edge> graph[], int V) {
//         for(int i=0; i<V; i++) {
//             graph[i] = new ArrayList<>();
//         }
     
//         //0 vertex
//         graph[0].add(new Edge(0, 1, 2));
//         graph[0].add(new Edge(0, 2, 4));

//         //1 vertex
//         graph[1].add(new Edge(1, 2, -4));

//         //2 vertex
//         graph[2].add(new Edge(2, 3, 2));

//         //3 vertex
//         graph[3].add(new Edge(3, 4, 4));
        
//         //4 vertex
//         graph[4].add(new Edge(4, 1, -1));         
//     }

//     public static void bellmanFord(ArrayList<Edge> graph[], int src) {
//         int dist[] = new int[graph.length];

//         for(int i=0; i<dist.length; i++) {
//             if(i != src) {
//                 dist[i] = Integer.MAX_VALUE;
//             }
          
//         }

//         int V = graph.length;
//         for(int i=0; i<V-1; i++) {
//             for(int j=0; j<graph.length; j++) {
//                 for(int k=0; k<graph[j].size(); k++) {
//                     Edge e = graph[j].get(k);
//                     int u = e.src;
//                     int v = e.des;
//                     int wt = e.wt;

//                     if(dist[u] != Integer.MAX_VALUE && dist[v] > dist[u] + wt) {
//                         dist[v] = dist[u] + wt;
//                     }
//                 }
//             }
//         }

//         for(int i=0; i<dist.length; i++) {
//             System.out.print(dist[i] + " ");
//         }
//     }
//     public static void main(String agrs[]) {
//         int V = 5;
//         ArrayList<Edge>[] graph = new ArrayList[V]; //null
//         createGraph(graph, V);
//         bellmanFord(graph, 0);
//       }
// }

//Prim's algorithm or minimum spanning tree..
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

    static void createGraph(ArrayList<Edge> graph[], int V) {
        for(int i=0; i<V; i++) {
            graph[i] = new ArrayList<>();
        }
     
        //0 vertex
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        //1 vertex
        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        //2 vertex
        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        //3 vertex
        graph[3].add(new Edge(3, 0, 30));
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));      
    }

    static class Pair implements Comparable<Pair>{
        int v;
        int cost;

        public Pair(int v, int c) {
            this.v = v;
            this.cost = c;
        }
        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }
      }
      public static void primsAlgo(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0));
        int finalCost = 0;

        while(!pq.isEmpty()) {
            Pair curr = pq.remove();
            if(!vis[curr.v]) {
                vis[curr.v] = true;
                finalCost += curr.cost;
                for(int i=0; i<graph[curr.v].size(); i++) {
                    Edge e = graph[curr.v].get(i);
                    pq.add(new Pair(e.des, e.wt));
                }
            } 
        }
        System.out.println("final(min cost) -> " + finalCost);
      }  
      public static void main(String agrs[]) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V]; //null
        createGraph(graph, V);
        primsAlgo(graph);
      }
}













