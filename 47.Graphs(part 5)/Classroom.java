// //Cheapest flights with k stops..
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

//     public static void createGraph(ArrayList<Edge> graph[], int flights[][]) {
//         for(int i=0; i<graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         for(int i=0; i<flights.length; i++) {
//             int src = flights[i][0];
//             int dest = flights[i][1];
//             int wt = flights[i][2];

//             Edge e = new Edge(src, dest, wt);
//             graph[src].add(e);
//         }
//     }

//     static class Info {
//         int v;
//         int cost;
//         int stops;

//         public Info(int v, int c, int s) {
//             this.v = v;
//             this.cost = c;
//             this.stops = s;
//         }
//     }

//     public static int CheapestFlight(int flights[][], int n, int src, int dest, int k) {
//         ArrayList<Edge> graph[] = new ArrayList[n];
//         createGraph(graph, flights);

//         int dist[] = new int[n];
//         for(int i=0; i<n; i++) {
//             if(src != dest) {
//                 dist[i] = Integer.MAX_VALUE;
//             }
//         }

//         Queue<Info> q = new LinkedList<>();
//         q.add(new Info(0, 0, 0));

//         while(!q.isEmpty()) {
//             Info curr = q.remove();

//             if(curr.stops > k) {
//                 break;
//             }

//             for(int i=0; i<graph[curr.v].size(); i++) {
//                 Edge e = graph[curr.v].get(i);
//                 int u = e.src;
//                 int v = e.dest;
//                 int wt = e.wt;

//                 if(curr.stops <= k && curr.cost + wt < dist[v]) {
//                     dist[v] = curr.cost + wt;
//                     q.add(new Info(v, dist[v], curr.stops+1));
//                 }
//             }
//         }

//         if(dist[dest] == Integer.MAX_VALUE) {
//             return -1;
//         } else {
//             return dist[dest];
//         }
//     }
//     public static void main(String args[]) {
//         int n = 4;
//         int flights[][] = {{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}};
//         int src = 0, dest = 3, k = 1;
//         System.out.println(CheapestFlight(flights, n, src, dest, k));
//     }
// }


// //connecting cities with minimum cost..
// import java.util.*;
// public class Classroom {

//     static class Edge implements Comparable<Edge>{
//         int dest;
//         int cost;

//         public Edge(int d, int c) {
//             this.dest = d;
//             this.cost = c;
//         }

//         @Override
//         public int compareTo(Edge e2) {
//             return this.cost - e2.cost;
//         }
//     }

//     public static int connectCities(int cities[][]) {
//         PriorityQueue<Edge> pq = new PriorityQueue<>();
//         pq.add(new Edge(0, 0));

//         boolean vis[] = new boolean[cities.length];
//         int finalCost = 0;

//         while(!pq.isEmpty()) {
//             Edge curr = pq.remove();
           
//             if(!vis[curr.dest]) {
//                 vis[curr.dest] = true;
//                 finalCost += curr.cost;

//                 for(int i=0; i<cities[curr.dest].length; i++) {
//                     if(cities[curr.dest][i] != 0) {
//                         pq.add(new Edge(i, cities[curr.dest][i]));
//                     }
//                 }
//             }
//         }

//         return finalCost;
//     }
//     public static void main(String args[]) {
//         int cities[][] = {{0, 1, 2, 3, 4},
//                          {1, 0, 5, 0, 7},
//                          {2, 5, 0, 6, 0},
//                          {3, 0, 6, 0, 0},
//                          {4, 7, 0, 0, 0}};

//         System.out.println(connectCities(cities));
//     }
// }

// //Disjoint set..
// import java.util.*;
// public class Classroom {
//     static int n = 7;
//     static int rank[] = new int[n];
//     static int par[] = new int[n];

//     public static void init() {
//         for(int i=0; i<n; i++) {
//             par[i] = i;
//         }
//     }

//     public static int find(int x) {
//         if(par[x] == x) {
//             return x;
//         }

//         return par[x] = find(par[x]);
//     }

//     public static void union(int a, int b) {
//         int parA = find(a);
//         int parB = find(b);

//         if(rank[parA] == rank[parB]) {
//             par[parB] = parA;
//             rank[parA]++;
//         } else if(rank[parA] < rank[parB]) {
//             par[parA] = parB;
//             rank[parB]++;
//         } else {
//             par[parB] = parA;
//             rank[parA]++;
//         }
//     }
//     public static void main(String args[]) {
//         init();
//         System.out.println(find(3));
//         union(1, 3);
//         System.out.println(find(3));
//         union(2, 4);
//         union(3, 6);
//         union(1, 4);
//         System.out.println(find(3));
//         System.out.println(find(4));
//         union(1, 5);
//     }
// }

// //krushkals algorithm..
// import java.util.*;
// public class Classroom {

//     static class Edge implements Comparable<Edge> {
//         int src;
//         int dest;
//         int wt;

//         public Edge(int src, int dest, int wt) {
//             this.src = src;
//             this.wt = wt;
//             this.dest = dest;
//         }

//         @Override
//         public int compareTo(Edge e2) {
//             return this.wt - e2.wt;
//         }
//     }

//     public static void createGraph(ArrayList<Edge> edges) {
//         edges.add(new Edge(0, 1, 10));
//         edges.add(new Edge(0, 2, 15));
//         edges.add(new Edge(0, 3, 30));
//         edges.add(new Edge(1, 3, 40));
//         edges.add(new Edge(2, 3, 50));
//     }

//     static int n = 4;
//     static int rank[] = new int[n];
//     static int par[] = new int[n];

//     public static void init() {
//         for(int i=0; i<n; i++) {
//             par[i] = i;
//         }
//     }

//     public static int find(int x) {
//         if(par[x] == x) {
//             return x;
//         }

//         return par[x] = find(par[x]);
//     }

//     public static void union(int a, int b) {
//         int parA = find(a);
//         int parB = find(b);

//         if(rank[parA] == rank[parB]) {
//             par[parB] = parA;
//             rank[parA]++;
//         } else if(rank[parA] < rank[parB]) {
//             par[parA] = parB;
//             rank[parB]++;
//         } else {
//             par[parB] = parA;
//             rank[parA]++;
//         }
//     }

//     public static void krushkalMst(ArrayList<Edge> edges, int V) {
//         init();
//         Collections.sort(edges);
//         int mstCost = 0;
//         int count = 0;

//         for(int i=0; count<V-1; i++) {
//             Edge e = edges.get(i);
//             //(src, dest, wt)

//             int parA = find(e.src);
//             int parB = find(e.dest);

//             if(parA != parB) {
//                 union(e.src, e.dest);
//                 mstCost += e.wt;
//                 count++;
//             }
//         }

//         System.out.println(mstCost);
//     }
//     public static void main(String args[]) {
//         int V = 4;
//         ArrayList<Edge> edges = new ArrayList<>();
//         createGraph(edges);
//         krushkalMst(edges, V);
//     }
// }

//Flood fill algorithm..
import java.util.*;
public class Classroom {
       static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
       }

       public static int helper(int[][] image, int sr, int sc, int color, boolean vis[][], int orgCol) {

        if(sr<0 || sc<0 || sr >= image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgCol) {
            return  image[sr][sc] = color;
        }

       
        //left
        helper(image, sr, sc-1, color, vis, image[sr][sc]);

        //right
        helper(image, sr, sc+1, color, vis, image[sr][sc]);

        //up
        helper(image, sr-1, sc, color, vis, image[sr][sc]);

        //down
        helper(image, sr+1, sc, color, vis, image[sr][sc]);
       }

       public static int floodFill(int[][] image, int sr, int sc, int color) {

        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;

       }

       public static void createGraph(ArrayList<Edge> graph[], int image[][]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<image.length; i++) {
            int src = image[i][0];
            int dest = image[i][1];
            int wt = image[i][2];

            Edge e = new Edge(src, dest, wt);
            graph[src].add(e);
        }
    }

    public static void main(String args[]) {
        int n = 2;
        int image[][] = {{1, 1, 1},
                          {1, 1, 0},
                          {1, 0, 1}};
        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(graph, image);

        for(int i=0; i<image.length; i++) {
            for(int j=0; j<image[0].length; j++) {
                System.out.println(floodFill(image, 1, 1, 2));
            }
        }
    }
}