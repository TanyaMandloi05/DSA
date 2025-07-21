// // que 11) Tiling problem....
// public class Recursion{
//     public static int tilingProblem(int n){
//         if(n == 1 || n == 0 ){
//             return 1;
//         }
//         // choice 
//         // vertical choice
//        int fnm1 = tilingProblem(n-1);
//        int fnm2 = tilingProblem(n-2);
//        int totalWays = fnm1 + fnm2;
//         return totalWays;
//     }
//     public static void main(String args[]){
//      System.out.println(tilingProblem(4));
//     }
// }

// que 12) Remove Duplicate from string....
public class Recursion{
    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            removeDuplicate(str, idx+1, newStr, map);
        } else{
            map[currChar - 'a'] = true;
            removeDuplicate(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String args[]){
    String str = "appnacollege";
    removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
}
}

// // Friends Pairing Problem....
// public class Recursion{
//     public static int friendsPairing(int n){
//         if(n==1 || n==2){
//             return n;
//         }

//     // choice
//     // single

//      int fnm1 = friendsPairing(n-1);
//     // pair

//      int fnm2 = friendsPairing(n-2);
//      int pairWays = (n-1) * fnm2;
//      int totalWays = fnm1 + pairWays;
//      return totalWays;

//     //    return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);

//     }
//     public static void main(String args[]){
//         int n = 4;
//          System.out.println(friendsPairing(n));
//     }
// }

// public class Recursion{
//     public static void printBinStrings(int n, int lastPlace, String str){
//         if(n == 0){
//             System.out.println(str);
//             return;
//         }
//         // kaam 
//         printBinStrings(n-1, 0, str + "0");
//         if(lastPlace == 0){
//              printBinStrings(n-1, 1, str + "1");
//         }
//     }
//     public static void main(String args[]){
//         printBinStrings(3,0,"");
//     }
// }

// // Practice Question... Que 1.)
// public class Recursion{
//     public static void allOccurence(int arr[], int key, int i){
//         // Base case
//         if(i >= arr.length){
//             return;
//         }
//         //Kaam
//          if(arr[i] == key){
//             System.out.print(i + " ");
//         }
//          allOccurence(arr, 2, i+1);
//     }
//     public static void main(String args[]){
//         int arr[] = {3,2,4,5,6,2,7,2,2};
//         allOccurence(arr,2,0);
//     }
// }

// // Que 2.)
// public class Recursion{
//     static String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};

//     public static void printDigits(int number){
//         if(number == 0){
//             return;
//         }
//         int lastDigit = number % 10;
//         printDigits(number / 10);
//         System.out.print(digits[lastDigit] + " ");
//     }
//     public static void main(String args[]){
//         int number = 1234;
//         printDigits(number);
//     }
// }

// // Que 3.)
// public class Recursion{
//     static int count = 0;
//     public static void printLength(String str, int i){
//         if(i >= str.length()){
//             System.out.print(count);
//             return;
//         }
//           count++;
//          printLength(str, i+1);
       
//         }
//     public static void main(String args[]){
//         String str = "tanya";
//         printLength(str, 0);
//     }
// }

// Que 4.)
// public class Recursion{
//     public static int countSubStr(String str, int i, int j, int n){
//         if(n == 1){
//             return 1;
//         }
//         if(n <= 0){
//             return 0;
//         }
//         int res = countSubStr(str, i+1,j, n-1) + 
//         countSubStr(str, i, j-1, n-1) - 
//         countSubStr(str, i+1, j-1, n-2);
//         if(str.charAt(i) == str.charAt(j)){
//             res ++;
//         }
//         return res;
//     }
//     public static void main(String args[]){
//         String str = "abcab";
//         int n = str.length();
//         System.out.print(countSubStr(str,0,n-1,n));
//     }
// }



