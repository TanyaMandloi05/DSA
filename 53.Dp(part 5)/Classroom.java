//// Wild Card Matching..
// import java.util.*;
// public class Classroom {
//     public static boolean wildCardMatch(String s, String p) {
//         int n = s.length();
//         int m = p.length();
//         boolean dp[][] = new boolean[n+1][m+1];

//         //initialize
//         dp[0][0] = true;
//         //partern empty
//         for(int i=1; i<n+1; i++) {
//             dp[i][0] = false;
//         }
//         //string empty
//         for(int j=1; j<m+1; j++) {
//             if(p.charAt(j-1) == '*') {
//                 dp[0][j] = dp[0][j-1];
//             }
//         }

//         for(int i=1; i<n+1; i++) {
//             for(int j=1; j<m+1; j++) {
//                 if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?') {
//                     dp[i][j] = dp[i-1][j-1];
//                 } else if(p.charAt(j-1) == '*') {
//                     dp[i][j] = dp[i-1][j] || dp[i][j-1];
//                 } else {
//                     dp[i][j] = false;
//                 }
//             }
//         }

//         return dp[n][m];
//     }

//     public static void main(String args[]) {
//         // String s = "baaabab";
//         // String p = "*****ba*****ab";
//         String s = "baaabab";
//         String p = "a*ab";
//         System.out.println(wildCardMatch(s, p));
//     }
// }

// //catalans by recursion...
// import java.util.*;
// public class Classroom {
//     public static int catalans(int n) {
//         if(n == 0 || n == 1) {
//             return 1;
//         }

//         int ans = 0;

//         for(int i=0; i<=n-1; i++) {
//             ans += catalans(i) * catalans(n-i-1);
//         }

//         return ans;
//     }
//     public static void main(String args[]) {
//         int n = 1;
//         System.out.println(catalans(n));
//     }
// }

// //catalans by recursion..
// import java.util.*;
// public class Classroom {
//     public static int catalansMemo(int n, int dp[]) {
//         if(n == 0 || n == 1) {
//             return 1;
//         }

//         if(dp[n] != -1) {
//             return dp[n];
//         }

//         int ans = 0;
//         for(int i=0; i<=n-1; i++) {
//             ans += catalansMemo(i, dp) * catalansMemo(n-i-1, dp);
//         }

//         return dp[n] = ans;
//     }
//     public static void main(String args[]) {
//         int n = 4;
//         int dp[] = new int[n+1];
//         Arrays.fill(dp, -1);
//         System.out.println(catalansMemo(n, dp));
//     }
// }

// //catalans by tabulation
// import java.util.*;
// public class Classroom {
//     public static int catalansTab(int n) {
//         int dp[] = new int[n+1];
//         //intialize
//         dp[0] = dp[1] = 1;

//         //bottom up
//         for(int i=2; i<n+1; i++) {
//             for(int j=0; j<=i-1; j++) {
//                 dp[i] += dp[j] * dp[i-j-1]; //Ci = Cj * Cj-j-1
//             }
//         }

//         return dp[n];
//     }
//     public static void main(String args[]) {
//         int n = 10;
//         System.out.println(catalansTab(n));
//     }
// }

// //count bst
// import java.util.*;
// public class Classroom {
//     public static int countBst(int n) {
//         int dp[] = new int[n+1];
//         dp[0] = dp[1] = 1;

//         for(int i=2; i<n+1; i++) {
//             for(int j=0; j<=i-1; j++) {
//                 int right = dp[j];
//                 int left = dp[i-j-1];
//                 dp[i] += right * left;

//             }
//         }
//         return dp[n];
//     }
//     public static void main(String args[]) {
//         int n = 4;
//         System.out.println(countBst(n));
//     }
// }

// //mountain ranges
// import java.util.*;
// public class Classroom {
//     public static int mountainRanges(int n) {
//         int dp[] = new int[n+1];
//         dp[0] = dp[1] = 1;

//         for(int i=2; i<n+1; i++) {
//             for(int j=0; j<=i-1; j++) {
//                 int inside = dp[j];
//                 int outside = dp[i-j-1];
//                 dp[i] += inside * outside;
//             }
//         }

//         return dp[n];
//     }

//     public static void main(String args[]) {
//         int n = 3;
//         System.out.println(mountainRanges(n));
//     }
// }