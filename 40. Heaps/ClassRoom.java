// //Priority queue add, remove, peek Operation..
// import java.util.*;
// public class ClassRoom {
//     public static void main(String agrs[]) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

//         pq.add(1);
//         pq.add(5);
//         pq.add(2);
//         pq.add(4);
//         pq.add(3);

//         while(!pq.isEmpty()) {
//             System.out.println(pq.peek());
//             pq.remove();
//         }
//     }
//

// //Priority queue for objects...
// import java.util.*;
// public class ClassRoom {
//     static class Student implements Comparable<Student> { //overriding
//         String name;
//         int rank;

//         public Student(String name, int rank) {
//             this.name = name;
//             this.rank = rank;
//         }

//         @Override 
//         public int compareTo(Student s2) {
//             return this.rank - s2.rank;
//         }
//     }
//     public static void main(String args[]) {
//         PriorityQueue<Student> pq = new PriorityQueue<>();

//         pq.add(new Student("A", 4));
//         pq.add(new Student("B", 5));
//         pq.add(new Student("C", 2));
//         pq.add(new Student("D", 12));

//         while(!pq.isEmpty()) {
//             System.out.println(pq.peek().name + " ->" + pq.peek().rank);
//             pq.remove();
//         }

//     }
// }

// //Insert in heap.. *** To convert it into max heap simply change the < to > in add function and heapify function..
// import java.util.*;
// public class ClassRoom {
//     static class Heap {
//        static ArrayList<Integer> arr = new ArrayList<>();

//         public static void add(int data) {
//             // add at last
//             arr.add(data);
            
//             //fix heap
//             int x = arr.size() - 1;
//             int par = (x - 1) / 2;

//             while(arr.get(x) < arr.get(par)) {
//                 // swap
//                 int temp = arr.get(x);
//                 arr.set(x, arr.get(par));
//                 arr.set(par, temp);

//                 x = par;
//                 par = (x-1)/2;
//             }
//         }

//         public int peek() {
//         return arr.get(0);
//         }

//         private void heapify(int i) {
//             int left = 2*i + 1;
//             int right = 2*i + 2;

//             int minIdx = i;

//             if(left < arr.size() && arr.get(left) < arr.get(minIdx)) {
//                 minIdx = left;
//             }

//             if(right < arr.size() && arr.get(right) < arr.get(minIdx)) {
//                 minIdx = right;
//             }

//             if(minIdx != i) {
//                 int temp = arr.get(i);
//                 arr.set(i, arr.get(minIdx));
//                 arr.set(minIdx, temp);

//                 heapify(minIdx);
//             }

//         }
//         public int remove() {
//             int data = arr.get(0);

//             // swap
//             int temp = arr.get(0);
//             arr.set(0, arr.get(arr.size()-1));
//             arr.set(arr.size()-1, temp);

//             //remove
//             arr.remove(arr.size()-1);

//             heapify(0);
//             return data;
//         }

//         public boolean isEmpty() {
//             return arr.size() == 0;
//         }
//     }

    
    
//     public static void main(String agrs[]) {
//         Heap h = new Heap();
//         h.add(3);
//         h.add(4);
//         h.add(1);
//         h.add(5);

//         while(!h.isEmpty()) {
//             System.out.println(h.peek() + " ");
//             h.remove();
//         }
//     }
// }

// //Heap Sort Tc- O(nlogn)...
// import java.util.*;
// public class ClassRoom {

//     public static void heapify(int arr[], int i, int size) {
//         int left = 2*i + 1;
//         int right = 2*i + 2;
//         int maxIdx = i;

//         if(left < size && arr[left] > arr[maxIdx]) {
//             maxIdx = left;
//         }

//         if(right < size && arr[right] > arr[maxIdx]) {
//             maxIdx = right;
//         }

//         if(maxIdx != i) {
//             int temp = arr[i];
//             arr[i] = arr[maxIdx];
//             arr[maxIdx] = temp;

//             heapify(arr, maxIdx, size);
//         }
//     }

//     public static void heapSort(int arr[]) {
//         // step1 - build maxHeap
//         int n = arr.length;
//         for(int i=n/2; i>=0; i--) {
//             heapify(arr, i, n);
//         }

//         //step2 - push largest at end
//         for(int i=n-1; i>0; i--) {
//             //swap (largets first with last)
//             int temp = arr[0];
//             arr[0] = arr[i];
//             arr[i] = temp;

//             heapify(arr, 0, i);
//         }
//     }

//     public static void main(String args[]) {
//         int arr[] = {1, 2, 4, 5, 3};
//         heapSort(arr);

//         for(int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i] + " ");
//         }
//     }
// }


// //Nearby cars..
// import java.util.*;
// public class ClassRoom {

//     static class Points implements Comparable<Points> {
//         int x;
//         int y;
//         int distSqr;
//         int idx;

//         public Points(int x, int y, int distSqr, int idx) {
//             this.x = x;
//             this.y = y;
//             this.distSqr = distSqr;
//             this.idx = idx;
//         }

//         @Override
//         public int compareTo(Points p2) {
//             return this.distSqr - p2.distSqr;
//         }
//     }
//     public static void main(String args[]) {
//         int pts[][] = {{3, 3}, {5, -1}, {-2, 4}};
//         int k = 2;

//         PriorityQueue<Points> pq = new PriorityQueue<>();
//         for(int i = 0; i < pts.length; i++) {
//             int distSqr = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
//             pq.add(new Points (pts[i][0], pts[i][1], distSqr, i));
//         }

//         //nearest K cars
//         for(int i=0; i<k; i++) {
//             System.out.println("C" + pq.remove().idx);
//         }
//     }
// }

// //n ropes with minimum cost..
// import java.util.*;
// public class ClassRoom {
//     public static void main(String args[]) {
//         int ropes[] = {2, 3, 3, 4, 6};

//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        for(int i=0; i<ropes.length; i++) {
//         pq.add(ropes[i]);
//       }

//       int cost = 0;
//       while(pq.size() > 1) {
//         int min1 = pq.remove();
//         int min2 = pq.remove();
//         cost += min1 + min2;
//         pq.add(min1 + min2);
//       }

//       System.out.println(cost);
//     }
// }

// // weakest Soldier..
// import java.util.*;
// public class ClassRoom {

//     static class Row implements Comparable<Row> {
//         int Soldier;
//         int idx;

//         public Row(int Soldier, int idx) {
//             this.Soldier = Soldier;
//             this.idx = idx;
//         }

//         @Override
//         public int compareTo(Row r2) {
//             if(this.Soldier == r2.Soldier) {
//                 return this.idx - r2.idx;
//             } else {
//                 return this.Soldier - r2.Soldier;
//             }
//         }
//     }
//     public static void main(String args[]) {
//         int army[][] = {{1, 0, 0, 0},
//                         {1, 1, 1, 1},
//                         {1, 0, 0, 0},
//                         {1, 0, 0, 0}
//                         };
//         int k = 2;
//         PriorityQueue<Row> pq = new PriorityQueue<>();
        
//         for(int i=0; i<army.length; i++) {
//             int count = 0;
//             for(int j=0; j<army[0].length; j++) {
//                 count += army[i][j] == 1 ? 1 : 0;
//             }

//             pq.add(new Row(count, i));
//         }

//         for(int i=0; i<k; i++){
//             System.out.println("R" + pq.remove().idx);
//         }
//     }
// }

//Sliding window maximum..
import java.util.*;
public class ClassRoom {
    static class Pair implements Comparable<Pair> {
        int val;
        int idx;

        public Pair(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair p2) {
            // ascending
            // return this.val - p2.val;

            //descending
            return p2.val - this.val;
        }

    }
    public static void main(String args[]) {
        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int res[] = new int[arr.length-k+1];
     
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(int i=0; i<k; i++) {
            pq.add(new Pair (arr[i], i));
        }

        res[0] = pq.peek().val;

        for(int i=k; i<arr.length; i++) {
            while(pq.size() > 0 && pq.peek().idx <= (i-k)) {
                pq.remove();
            }

            pq.add(new Pair(arr[i], i));
            res[i-k+1] = pq.peek().val;
        }

        for(int i=0; i<res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}