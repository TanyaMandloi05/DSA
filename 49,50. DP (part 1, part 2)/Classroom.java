// //fibonacii by memoization tc - O(n)
// import java.util.*;
// public class Classroom {
//     public static int fib(int n, int dp[]) {
//         if(n == 0 || n == 1) {
//             return n;
//         }
        
//         if(dp[n] != 0) {
//             return dp[n];
//         }

//         dp[n] = fib(n-1, dp) + fib(n-2, dp);
//         return dp[n];
//     }

//     public static void main(String args[]) {
//         int n = 5;
//         int dp[] = new int[n+1];
//         System.out.println(fib(n, dp));
//     }
// }


// //fibonacci by tabulation..
// import java.util.*;
// public class Classroom {
//     public static void main(String args[]) {
//         int n = 5;
//         int dp[] = new int[n+1];
//         dp[0] = 0;
//         dp[1] = 1;

//         for(int i=2; i<=n; i++) {
//             dp[i] = dp[i-1] + dp[i-2];
//         }

//         System.out.println(dp[n]);
//     }
// }

// //climbing stairs by recursion..
// import java.util.*;
// public class Classroom {
//     public static int getWays(int n) {
//         if(n == 0) {
//             return 1;
//         }

//         if(n < 0) {
//             return 0;
//         }

//         return getWays(n-1) + getWays(n-2);
//     }
//     public static void main(String args[]) {
//         int n = 5;
//         System.out.println(getWays(n));
//     }
// }

// //climbing stairs by memoization(Dp)..
// import java.util.*;
// public class Classroom {
//     public static int getWays(int n, int ways[]) {
//         if(n == 0) {
//             return 1;
//         }

//         if(n < 0) {
//             return 0;
//         }

//         if(ways[n] != -1) {
//             return ways[n];
//         }

//         ways[n] = getWays(n-1, ways) + getWays(n-2, ways);
//         return ways[n];
//     }
//     public static void main(String args[]) {
//         int n = 5;
//         int ways[] = new int[n+1];
//         Arrays.fill(ways, -1);
//         System.out.println(getWays(n, ways));
//     }
// }

// //climbing stairs by tabulation..
// import java.util.*;
// public class Classroom {
//     public static int getWays(int n) {
//         int dp[] = new int[n+1];
//         dp[0] = 1;

//         for(int i=1; i<=n; i++) {
//             if(i == 1) {
//                 dp[i] = dp[i-1] + 0;
//             } else {
//                 dp[i] = dp[i-1] + dp[i-2];
//             }
//         }

//      return dp[n];
//     }
//     public static void main(String args[]) {
//         int n = 5;
//         System.out.println(getWays(n));
//     }
// }

// //0-1 Knapsack by recursion..
// import java.util.*;
// public class Classroom {
//     public static int knapSack(int val[], int wt[], int CapacityOfBag, int n) {
//             if(CapacityOfBag == 0 || n == 0) {
//                 return 0;
//             }
            
//             if(wt[n-1] <= CapacityOfBag) {
//                 int ans1 = val[n-1] + knapSack(val, wt, CapacityOfBag-wt[n-1], n-1);
//                 int ans2 = knapSack(val, wt, CapacityOfBag, n-1);
//                 return Math.max(ans1, ans2);
//             } else {
//                 return knapSack(val, wt, CapacityOfBag, n-1);
//             }
//         }
    
//     public static void main(String args[]) {
//         int val[] = {15, 14, 10, 45, 30};
//         int wt[] = {2, 5, 1, 3, 4};
//         int CapacityOfBag = 7;
//         System.out.println(knapSack(val, wt, CapacityOfBag, val.length));
//     }
// }

// //0-1 Knapsack by memoization..Tc - O(n+W)
// import java.util.*;
// public class Classroom {
//     public static int knapSack(int val[], int wt[], int W, int n, int dp[][]) {
//             if(W == 0 || n == 0) {
//                 return 0;
//             }

//             if(dp[n][W] != -1) {
//                 return dp[n][W];
//             }

//             if(wt[n-1] <= W) {
//                 int ans1 = val[n-1] + knapSack(val, wt, W-wt[n-1], n-1, dp);
//                 int ans2 = knapSack(val, wt, W, n-1, dp);
//                 dp[n][W] =  Math.max(ans1, ans2);
//                 return dp[n][W];
//             } else {
//                  dp[n][W] = knapSack(val, wt, W, n-1, dp);
//                  return dp[n][W];
//             }
//         }
    
//     public static void main(String args[]) {
//         int val[] = {15, 14, 10, 45, 30};
//         int wt[] = {2, 5, 1, 3, 4};
//         int W = 7; //capacity of bag
//         int dp[][] = new int[val.length+1][W+1];

//         for(int i=0; i<dp.length; i++) {
//             for(int j=0; j<dp[0].length; j++) {
//                 dp[i][j] = -1;
//             }
//         }
//         System.out.println(knapSack(val, wt, W, val.length, dp));
//     }
// }

// //0-1 knapSack by tabulation
// import java.util.*;
// public class Classroom {
//     public static void printDp(int dp[][]) {

//         for(int i=0; i<dp.length; i++) {
//             for(int j=0; j<dp[0].length; j++) {
//                 System.out.print(dp[i][j] + " ");
//             }

//             System.out.println();
//         }

//         System.out.println();
//     }
//     public static int knapSackTab(int val[], int wt[], int W) {
//         int n = val.length;
//         int dp[][] = new int[n+1][W+1];

//         for(int i=0; i<dp.length; i++) {
//             dp[i][0] = 0;
//         }

//         for(int j=0; j<dp[0].length; j++) {
//             dp[0][j] = 0;
//         }

//         for(int i=1; i<n+1; i++) {
//             for(int j=1; j<W+1; j++) {
//                 int v = val[i-1];
//                 int w = wt[i-1];
//                 if(w <= j) {
//                     int incProfit = v + dp[i-1][j-w];
//                     int excProfit = dp[i-1][j];
//                     dp[i][j] = Math.max(incProfit, excProfit);
//                 } else {
//                     int excProfit = dp[i-1][j];
//                     dp[i][j] = excProfit;
//                 }
//             }
//         }

//         printDp(dp);
//         return dp[n][W];
//     }
//     public static void main(String args[]) {
//         int val[] = {15, 14, 10, 45, 30};
//         int wt[] = {2, 5, 1, 3, 4};
//         int W = 7; //capacity of bag

//         System.out.println(knapSackTab(val, wt, W));
//     }
// }

// //target sum by tabulation..
// import java.util.*;
// public class Classroom {
//     public static boolean targetSum(int arr[], int sum) {
//         int n = arr.length;
//         boolean dp[][] = new boolean [n+1][sum+1];

//         for(int i=0; i<dp.length; i++) {
//             dp[i][0] = true;
//         }

//         for(int i=1; i<n+1; i++) {
//             for(int j=1; j<sum+1; j++) {
//                 int v = arr[i-1];
//                 //include
//                 if(v <= j && dp[i-1][j-v] == true) {
//                     dp[i][j] = true;
//                 } 
//                 //exclude
//                 else if(dp[i-1][j] == true) {
//                     dp[i][j] = true;
//                 }
//             }
//         }

//         printDp(dp);
//         return dp[n][sum];
//     }

//     public static void printDp(boolean dp[][]) {
//         for(int i=0; i<dp.length; i++) {
//             for(int j=0; j<dp[0].length; j++) {
//                 System.out.print(dp[i][j] + " ");
//             }
//             System.out.println();
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int arr[] = {4, 2, 7, 1, 3};
//         int sum = 10;
//         System.out.print(targetSum(arr, sum));
//     }
// }


// //unbounded knapsack..by tabulation..
// import java.util.*;
// public class Classroom {
//     public static int unbounKnapSack(int val[], int wt[], int W) {
//         int n = val.length;
//         int dp[][] = new int[n+1][W+1];

//         for(int i=0; i<dp.length; i++) {
//             dp[i][0] = 0;
//         }

//         for(int j=0; j<dp[0].length; j++) {
//             dp[0][j] = 0;
//         }

//         for(int i=1; i<n+1; i++) {
//             for(int j=1; j<W+1; j++) {
//                 //valid
//                 if(wt[i-1] <= j) {
//                     dp[i][j] = Math.max(val[i-1] + dp[i][j-wt[i-1]], dp[i-1][j]);
//                 }

//                 else {
//                     dp[i][j] = dp[i-1][j];
//                 }
//             }
//         }

//         return dp[n][W];
//     }

//     public static void main(String args[]) {
//         int val[] = {15, 14, 10, 45, 30};
//         int wt[] = {2, 5, 1, 3, 4};
//         int W = 7;

//         System.out.print(unbounKnapSack(val, wt, W));
//     }
// }