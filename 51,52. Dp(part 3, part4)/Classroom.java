// //coin change..
// import java.util.*;
// public class Classroom {
//     public static int coinChange(int coins[], int sum) {
//         int n = coins.length;
//         int dp[][] = new int[n+1][sum+1];

//         for(int i=0; i<n+1; i++) {
//             dp[i][0] = 1;
//         }

//         for(int j=0; j<sum+1; j++) {
//             dp[0][j] = 0;
//         }

//         for(int i=1; i<n+1; i++) {
//             for(int j=1; j<sum+1; j++) {
//                 //include
//                 if(coins[i-1] <= j) {
//                     dp[i][j] = dp[i][j-coins[i-1]] + dp[i-1][j];
//                 }
//                 else {
//                     dp[i][j] = dp[i-1][j];
//                 }
//             }
//         }

//         return dp[n][sum];
//     }
//     public static void main(String args[]) {
//         int coins[] = {2, 5, 3, 6};
//         int sum = 10;
//         System.out.print(coinChange(coins, sum));
//     }
// }

// //rod cutting..O(n*total length)
// import java.util.*;
// public class Classroom {
//     public static int rodCut(int length[], int price[], int rodLen) {
//         int n = length.length;
//         int dp[][] = new int[n+1][rodLen+1];
//         for(int i=0; i<n+1; i++) {
//             for(int j=0; j<price.length+1; j++) {
//                 if(i == 0 || j == 0) {
//                     dp[i][j] = 0;
//                 }
//             }
//         }

//         for(int i=1; i<n+1; i++) {
//             for(int j=1; j<rodLen+1; j++) {
//                 if(length[i-1] <= j) {
//                     dp[i][j] = Math.max(price[i-1] + dp[i][j-length[i-1]], dp[i-1][j]);
//                 } else {
//                     dp[i][j] = dp[i-1][j];
//                 }
//             }
//         }

//         printDp(dp);
//         return dp[n][rodLen];
//     }

//     public static void printDp(int dp[][]) {
//         for(int i=0; i<dp.length; i++) {
//             for(int j=0; j<dp[0].length; j++) {
//                 System.out.print(dp[i][j] + " ");
//             }
//             System.out.println();
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int length[] = {1, 2, 3, 4, 5, 6, 7, 8};
//         int price[] = {1, 5, 8, 9, 10, 17, 17, 20};
//         int rodLen = 8;
//         System.out.println(rodCut(length, price, rodLen));
//     }
// }


// //Longest common subsequence by recursion
// import java.util.*;
// public class Classroom {
//     public static int lCS(String str1, String str2, int n, int m) {
//         if(n == 0 || m == 0) {
//             return 0;
//         }

//         if(str1.charAt(n-1) == str2.charAt(m-1)) {
//             return lCS(str1, str2, n-1, m-1) + 1;
//         }

//         else {
//             int ans1 = lCS(str1, str2, n-1, m);
//             int ans2 = lCS(str1, str2, n, m-1);
//             return Math.max(ans1, ans2);
//         }
//     }

//     public static void main(String args[]) {
//         String str1 = "abcde";
//         String str2 = "ace";
//         System.out.print(lCS(str1, str2, str1.length(), str2.length()));
//     }
// }

// //lsc memoization..TC - O(n*m)
// import java.util.*;
// public class Classroom {
//     public static int lCS(String str1, String str2, int n, int m, int dp[][]) {
//         if(n == 0 || m == 0) {
//             return 0;
//         }

//         if(dp[n][m] != -1) {
//             return dp[n][m];
//         }

//         if(str1.charAt(n-1) == str2.charAt(m-1)) {
//             return dp[n][m] = lCS(str1, str2, n-1, m-1, dp) + 1;
//         }

//         else {
//             int ans1 = lCS(str1, str2, n-1, m, dp);
//             int ans2 = lCS(str1, str2, n, m-1, dp);
//             return dp[n][m] = Math.max(ans1, ans2);
//         }
//     }

//     public static void main(String args[]) {
//         String str1 = "abcde";
//         String str2 = "ace";
//         int n = str1.length();
//         int m = str2.length();
//         int dp[][] = new int[n+1][m+1];

//         for(int i=0; i<n+1; i++) {
//             for(int j=0; j<m+1; j++) {
//                 dp[i][j] = -1;
//             }
//         }
//         System.out.print(lCS(str1, str2, n, m, dp));
//     }
// }

// //Longest common subsequence by tabulation
// import java.util.*;
// public class Classroom {
//     public static int lcsTab(String str1, String str2, int n, int m) {
//         int dp[][] = new int[n+1][m+1];

//         for(int i=0; i<n+1; i++) {
//             for(int j=0; j<m+1; j++) {
//                 if(i == 0 || j == 0) {
//                     dp[i][j] = 0;
//                 }
//             }
//         } 

//         for(int i=1; i<n+1; i++) {
//             for(int j=1; j<m+1; j++) {
//                 if(str1.charAt(i-1) == str2.charAt(j-1)) {
//                     dp[i][j] = dp[i-1][j-1]+1;
//                 }

//                 else {
//                     int ans1 = dp[i-1][j];
//                     int ans2 = dp[i][j-1];
//                     dp[i][j] = Math.max(ans1, ans2);
//                 }
//             }
//         }
        
//         printDp(dp);
//         return dp[n][m];
//     }

//     public static void printDp(int dp[][]) {
//         for(int i=0; i<dp.length; i++) {
//             for(int j=0; j<dp[0].length; j++) {
//                 System.out.print(dp[i][j] + " ");
//             }
//             System.out.println();
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         String str1 = "abcde";
//         String str2 = "ace";
//         int n = str1.length();
//         int m = str2.length();

//         System.out.println(lcsTab(str1, str2, n, m));
//     }
// }

// //longest common substring by tabulaion TC - O(n*m)..
// import java.util.*;
// public class Classroom {
//     public static int longestCommonSubstring(String str1, String str2) {
//         int n = str1.length();
//         int m = str2.length();
//         int dp[][] = new int[n+1][m+1];
//         int ans = 0;

//         for(int i=0; i<n+1; i++) {
//             for(int j=0; j<m+1; j++) {
//                 if(i == 0 || j == 0) {
//                     dp[i][j] = 0;
//                 }
//             }
//         }

//         for(int i=1; i<n+1; i++) {
//             for(int j=1; j<m+1; j++) {
//                 if(str1.charAt(i-1) == str2.charAt(j-1)) {
//                     dp[i][j] = dp[i-1][j-1] + 1;
//                     ans = Math.max(ans, dp[i][j]);
//                 }
//                 else {
//                     dp[i][j] = 0;
//                 }
//             }
//         }
//         return ans;
//     }

//     public static void main(String args[]) {
//         String str1 = "ABCDGH";
//         String str2 = "ACDGHR";
//         System.out.println(longestCommonSubstring(str1, str2));
//     }
// }

// //longest increasing subsequence..TC - O(n*m) 
// import java.util.*;
// public class Classroom {
//     public static int lCS(int arr1[], int arr2[]) {
//         int n = arr1.length;
//         int m = arr2.length;
//         int dp[][] = new int[n+1][m+1];

//         for(int i=0; i<n+1; i++) {
//             for(int j=0; j<m+1; j++) {
//                 if(i == 0 || j == 0) {
//                     dp[i][j] = 0;
//                 }
//             }
//         }

//         for(int i=1; i<n+1; i++) {
//             for(int j=1; j<m+1; j++) {
//                 if(arr1[i-1] == arr2[j-1]) {
//                     dp[i][j] = dp[i-1][j-1] + 1;
//                 } else {
//                     int ans1 = dp[i-1][j];
//                     int ans2 = dp[i][j-1];
//                     dp[i][j] =  Math.max(ans1, ans2);
//                 }
//             }
//         }

//         return dp[n][m];
//     }
//     public static int liS(int arr1[]) {
//         HashSet<Integer> set = new HashSet<>();
//         for(int i=0; i<arr1.length; i++) {
//             set.add(arr1[i]);
//         }
       
//         int arr2[] = new int[set.size()];
//         int i = 0;
//         for(int num : set) {
//             arr2[i] = num;
//             i++;
//         }

//         Arrays.sort(arr2);
//         return lCS(arr1, arr2);
//     }
//     public static void main(String args[]) {
//         int arr1[] = {50, 3, 10, 7, 40, 80};
//         System.out.print(liS(arr1));
//     }
// }

// //edit distance 
// import java.util.*;
// public class Classroom {
//     public static int editDis(String word1, String word2) {
//         int n = word1.length();
//         int m = word2.length();
//         int dp[][] = new int[n+1][m+1];

//         for(int i=0; i<n+1; i++) {
//             for(int j=0; j<m+1; j++) {
//                 if(i == 0) {
//                     dp[i][j] = j;
//                 } if(j == 0) {
//                     dp[i][j] = i;
//                 }
//             }
//         }

//         for(int i=1; i<n+1; i++) {
//             for(int j=1; j<m+1; j++) {
//                 if(word1.charAt(i-1) == word2.charAt(j-1)) {
//                     dp[i][j] = dp[i-1][j-1];
//                 }
//                 else {
//                     int add = dp[i][j-1] + 1;
//                     int delete = dp[i-1][j] + 1;
//                     int replace = dp[i-1][j-1] + 1;
//                     dp[i][j] = Math.min(add, Math.min(delete, replace));
//                 }
//             }
//         }

//         return dp[n][m];
//     }

//     public static void main(String args[]) {
//         String word1 = "intention";
//         String word2 = "execution";
//         System.out.print(editDis(word1, word2));
//     }
// }

//string conversion..
import java.util.*;
public class Classroom {
    public static void stringCon(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];

        for(int i=1; i<n+1; i++) {
            for(int j=1; j<m+1; j++) {
                if(str1.charAt(i-1) == str2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }

        int nOfDel = str1.length() - dp[n][m];
        int nOfIns = str2.length() - dp[n][m];
        System.out.println("number of deletion = " + nOfDel);
        System.out.println("number of insertion = " + nOfIns);
    }
    public static void main(String args[]) {
        String str1 = "abcdef";
        String str2 = "aceg";
        stringCon(str1, str2);
    }
}