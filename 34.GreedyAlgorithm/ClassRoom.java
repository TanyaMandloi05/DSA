// //Activity selection... when end time given is sorted
// import java.util.*;
// public class ClassRoom{
// public static void main(String args[]) {
//     int start[] = {1, 3, 0, 5, 8, 5};
//     int end[] = {2, 4, 6, 7, 9, 9};

//     int max = 0;

//     ArrayList<Integer> ans = new ArrayList<>();
//     ans.add(0);
//     max = 1;
//     int lastEnd = end[0];

//     for(int i=1; i<start.length; i++){
//         if(start[i] >= lastEnd) {
//             max++;
//             ans.add(i);
//             lastEnd = end[i];
//         }
//     }
//     System.out.println("max activity is " + max);

//     for(int i=0; i<ans.size(); i++)
//     {
//         System.out.print("A" + ans.get(i) + " ");
//     }
//     System.out.println();
// }
// }

// //Activity selection... 
// // when start time is sorted but end time is not sorted
// import java.util.*;
// public class ClassRoom{
// public static void main(String args[]) {
//     // int start[] = {1, 3, 0, 5, 8, 5};
//     // int end[] = {2, 4, 6, 7, 9, 9
//      int start[] = {0, 1, 3, 5, 5,8};
//      int end[] = {6, 2, 4, 7, 9, 9};

//     int activities[][] = new int[start.length][3];
//     for(int i=0; i<start.length; i++) {
//         activities[i][0] = i;
//         activities[i][1] = start[i];
//         activities[i][2] = end[i];
//     }

//     Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
//     int max = 0;

//     ArrayList<Integer> ans = new ArrayList<>();
//     max = 1;
//     ans.add(activities[0][0]);
   
//     int lastEnd = activities[0][2];

//     for(int i=1; i<end.length; i++){
//         if(activities[i][1] >= lastEnd) {
//             max++;
//             ans.add(activities[i][0]);
//             lastEnd = activities[i][2];
//         }
//     }
//     System.out.println("max activity is " + max);

//     for(int i=0; i<ans.size(); i++)
//     {
//         System.out.print("A" + ans.get(i) + " ");
//     }
//     System.out.println();
// }
// }

// // Que Fractional knapsack...
// import java.util.*;
// public class ClassRoom {
//     public static void main(String args[]) {
//         int val[] = {60, 100, 120};
//         int weight[] = {10, 20, 30};
//         int w = 50;

//         double ratio[][] = new double[val.length][2];
//         //0th col -> idx, 1st col -> ratio
//         for(int i=0; i<val.length; i++) {
//             ratio[i][0] = i;
//             ratio[i][1] = val[i]/(double)weight[i];
//         }

//         Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

//         int capacity = w;
//         int finalVal = 0;

//         for(int i=ratio.length-1; i>=0; i--) {
//             int idx = (int)ratio[i][0];
//             if(capacity > weight[idx]) {
//                 finalVal += val[idx];
//                 capacity -= weight[idx];
//             } else {
//                 finalVal += ratio[i][1] * capacity;
//                 capacity = 0;
//                 break;
//             }
//         }

//         System.out.println("final value = " + finalVal);
//     }
// }


// //Minimum sum absolute diffrence pair..
// import java.util.*;
// public class ClassRoom {
//     public static void main(String args[]) {
//         int A[] = {4, 1, 8, 7};
//         int B[] = {2, 3, 6, 5};

//         Arrays.sort(A);
//         Arrays.sort(B);

//         int minDiff = 0;

//         for(int i=0; i<A.length; i++) {
//             minDiff += Math.abs(A[i] - B[i]);
//         }
//         System.out.println(minDiff);
//     }
// }


// //Maximum length chain of pair...
// import java.util.*;
// public class ClassRoom {
//     public static void main(String args[]) {
//         int pairs[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};

//         Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

//         int chainLength = 1;
//         int pairEnd = pairs[0][1];

//         for(int i=1; i<pairs.length; i++) {
//             if(pairs[i][0] > pairEnd) {
//                 chainLength++;
//                 pairEnd = pairs[i][1];
//             }
//         }

//         System.out.println(chainLength);
//     }
// }


// //Indian coins..
// import java.util.*;
// public class ClassRoom {
//     public static void main(String args[]) {
//         Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};

//         Arrays.sort(coins, Comparator.reverseOrder());
        
//         int count = 0;
//         int amount = 121;
//         ArrayList<Integer> ans = new ArrayList<>();

//         for(int i=0; i<coins.length; i++) {
//             if(coins[i] <= amount) {
//                 while(coins[i] <= amount) {
//                     count++;
//                     amount -= coins[i];
//                     ans.add(coins[i]);
//                 }
//             }
//         }

//         System.out.println("total minimum coins used -> " + count);

//         for(int i=0; i<ans.size(); i++) {
//             System.out.print(ans.get(i) + " ");
//         }

//     }
// }

// // Job sequencing Problem...
// import java.util.*;
// public class ClassRoom {
//     static class Job {
//         int deadLine; 
//         int profit;
//         int id;

//         public Job(int i, int d, int p) {
//             id = i;
//             deadLine = d;
//             profit = p;
//         }
//     }

//     public static void main(String args[]) {
//         int jobsInfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

//         ArrayList<Job> jobs = new ArrayList<>();

//         for(int i=0; i<jobsInfo.length; i++) {
//             jobs.add(new Job (i, jobsInfo[i][0], jobsInfo[i][1]));
//         }

//         Collections.sort(jobs,(obj1, obj2) -> obj2.profit - obj1.profit);

//         ArrayList<Integer> seq = new ArrayList<>();

//         int time = 0;
//         for(int i=0; i<jobs.size(); i++){
//             Job curr = jobs.get(i);
//             if(curr.deadLine > time) {
//                 seq.add(curr.id);
//                 time++;
//             }
//         }

//         System.out.println("max job " + seq.size());
//         for(int i=0; i<seq.size(); i++) {
//             System.out.println(seq.get(i) + " ");
//         }
//         System.out.println();
//     }
// }


//Chocola Problem...
import java.util.*;
public class ClassRoom {
    public static void main(String args[]) {
        Integer costVer[] = {2, 1, 3, 1, 4};
        Integer costHor[] = {4, 1, 2};

        Arrays.sort(costVer, Comparator.reverseOrder());
        Arrays.sort(costHor, Comparator.reverseOrder());

        int h = 0 , v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        while(h < costHor.length && v < costVer.length) {
            if(costVer[v] >= costHor[h]) {
                cost += costVer[v] * hp;
                vp++;
                v++;
            } else {
                cost += costHor[h] * vp;
                hp++;
                h++;
            }
        }

        while(h < costHor.length) {
            cost += costHor[h] * vp;
            hp++;
            h++;
        }

        while(v < costVer.length) {
            cost += costVer[v] * hp;
            vp++;
            v++;
        }

        System.out.println("min cost of cuts -> " + cost);
    }
}