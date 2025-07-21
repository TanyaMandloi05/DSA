// //numbers in decresing order...
// public class Recursion{

//     public static void printDec(int n){
//         if(n == 1){
//             System.out.println(n);
//             return;
//         }

//         System.out.println(n);
//         printDec(n-1);
//     }

//     public static void main(String args[]){
//         int n = 10;
//         printDec(n);
//     }
// }

// //numbers in incresing order...
// public class Recursion{
//     public static void printInc(int n){
//         if(n == 1){
//         System.out.println(n);
//         return;
//         }
//        printInc(n-1);
//        System.out.println(n);
//     }
//     public static void main(String args[]){
//         int n = 5;
//         printInc(n);
//     }
// }

// // Factorial of n...
// public class Recursion{
//     public static int fact(int n){
//         if(n == 0){
//             return 1;
//         }
//         int fnm = fact(n-1);
//         int fn = fact(n-1) * n;
//         return fn;
//     }
//     public static void main(String args[]){
//         int n = 5;
//         System.out.println(fact(5));
//     }
// }

// // Sum of n natural number...
// public class Recursion{
//     public static int sum(int n){
//         if(n == 1){
//             return 1;
//         }
//        int snm = sum(n-1);
//        int sn = snm + n;
//        return sn;
//     }
//     public static void main(String args[]){
//         int n = 10;
//         System.out.println(sum(n));
//     }
// }

// // fibonaci series
// public class Recursion{
//     public static int fib(int n){
//         if(n == 0 || n == 1){
//             return n;
//         }
//         int fnm1 = fib(n-1);
//         int fnm2 = fib(n-2);
//         int fn = fnm1 + fnm2;
//         return fn;
//     }
//     public static void main(String args[]){
//         int n = 6;
//         System.out.println(fib(n));
//     }
// }

// // Check if arraay is sorted or not

// public class Recursion{
//     public static boolean isSorted(int arr[], int i){
//         if(i == arr.length-1){
//             return true;
//         }
//     if(arr[i] > arr[i+1]){
//         return false;
//     }
//     return isSorted(arr, i+1);
//     }
//     public static void main(String args[]){
//     int arr[] = {1,2,3,6,8,4};
//    System.out.println(isSorted(arr, 0));
//     }
// }

// //First Occurence...
// public class Recursion{
//     public static int firstOccurence(int arr[], int key, int i){
//         if(i == arr.length){
//         return -1;
//         }
//         if(arr[i] == key){
//             return i;
//         }
//         return firstOccurence(arr, key, i+1);
//     }
//     public static void main(String args[]){
//         int arr[] = {1,2,3,4,5,6,7,8,3,5};
//         int key = 10;
//         System.out.println(firstOccurence(arr, key, 0));
//     }
// }

// //Last Occurence...
// public class Recursion{
//     public static int lastOccurence(int arr[], int key, int i){
//        if(i == arr.length){
//         return -1;
//        }
//        int isFound = lastOccurence(arr, key, i+1);
//        if(isFound == -1 && arr[i] == key){
//         return i;
//        }
//        return isFound;
//     }
//     public static void main(String args[]){
//         int arr[] = {8,3,6,9,5,10,2,5,3};
//         int key = 5;
//         System.out.println(lastOccurence(arr, key, 0));
//     }
// }

//Print x to the power n...
public class Recursion{
    public static double calcPow(double x, double n){
        // if (n < 0) {
        //     return 1 / calcPow(x, -n);
        // }

        // if(n == 0) {
        //     return 1;
        // }
        
        if(n == 1){
            return x;
        }

       double xnm1 =  calcPow( x,  n-1);
       double xn = x * xnm1;
       return xn;
    }
    public static void main(String args[]){
        double x = 2.10000;
        double n = -2;
        System.out.println(calcPow(x,n));
    }
}

// //Print x to the power n (Optimized approch)...
// public class Recursion{
//     public static int optimizedPow(int x, int n){
//         if(n == 0){
//             return 1;
//         }
//         int halfPow = optimizedPow(x, n/2);
//         int halfPowSq = halfPow * halfPow;
//         if(n % 2 != 0){
//             halfPowSq = halfPowSq * x;
//         }
//        return halfPowSq;
//     }
//     public static void main(String args[]){
//         int x = 2;
//         int n = 10;
//        System.out.println(optimizedPow(x, n));
//     }
// }