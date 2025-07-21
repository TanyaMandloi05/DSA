// public class index{
//     public static void main(String args[]){
//         System.out.println(5 & 6);
//         System.out.println(5 | 6);
//         System.out.println(5 ^ 6);
//         System.out.println(~5);
//         System.out.println(5<<2);
//     }
// }

// import java.util.*;
// // odd and even number....
// public class index{
//     public static void oddOrEven(int n){
//         int bitMask = 1;
//         if((n & bitMask) == 0){
//             System.out.println("number is even");
//         } else{
//             System.out.println("number is odd");
//         }
//     }
//     public static void main(String args[]){
//        oddOrEven(13);
//        oddOrEven(12);
//     }
// }


// import java.util.*;
// // get ith bit....
// public class index{
//    public static int getIBit(int n, int i){
//     int bitMask = 1<<i;
//     if((n & bitMask) == 0){
//         return 0;
//     } else{
//         return 1;
//     }
//    }
//    public static void main(String args[]){
//     System.out.println(getIBit(10,3));
//    }
// }

// import java.util.*;
// //set Ith bit....
// public class index{
//     public static int setIbit(int n, int i){
//         int bitMask = 1<<i;
//         return n | bitMask;
//     }
//     public static void main(String args[]){
//         System.out.println(setIbit(10,2));
//     }
// }

// import java.util.*;
// //clear ith bit....
// public class index{
//     public static int clearIthBit(int n, int i){
//         int bitMask = ~(1<<i);
//         return n & bitMask;
//     }
//     public static void main(String args[]){
//        System.out.println( clearIthBit(10,1));
//     }
// }

// import java.util.*;
// //update ith bit
// public class index{
//      public static int clearIthBit(int n, int i){
//         int bitMask = ~(1<<i);
//         return n & bitMask;
//     }
//     public static int updateIthBit(int n, int i, int newBit){
//         n = clearIthBit(n,i);
//         int bitMask = newBit << i;
//         return n|bitMask;
//     }
//     public static void main(String args[]){
//         System.out.println(updateIthBit(10,2,0));
//     }
// }

import java.util.*;
// clear last ith bit....
public class index{
    public static int clearLastIthBit(int n, int i){
        int bitMask = (~0<<i);
        return n & bitMask;
        // int bitMask = n << i;
        // return n & bitMask;
    }
    public static void main(String args[]){
    System.out.println(clearLastIthBit(10,2));
    }
}

// import java.util.*;
// //clear bits in range....
// public class index{
//     public static int clearBitInRange(int n, int i, int j ){
//         int a = ((~0)<<(j+1));
//         int b = (1<<i)-1;
//         int bitMask  = a|b;
//         return n & bitMask;
//     }
//     public static void main(String args[]){
//     System.out.println(clearBitInRange(10,2,4));
//     }
// }

// import java.util.*;
// // number is in range of two or not....
// public class index{
// public static boolean isPowerOfTwo(int n){
//     return (n & (n-1)) == 0;
// }
// public static void main(String args[]){
// System.out.println(isPowerOfTwo(9));
// }
// }

// import java.util.*;
// // count set bit in a number....
// public class index{
//     public static int countSetBit(int n){
//         int count = 0;
//         while(n > 0){
//             if((n & 1) != 0){
//                 count++;
//             }
//             n = n >> 1;
//         }
//         return count;
//     }
//     public static void main(String args[]){
//     System.out.println(countSetBit(7));
//     }
// }

// import java.util.*;
// // Fast Exponentiation....
// public class index{
//     public static int fastExpo(int a, int n){
//         int ans = 1;
//         while(n > 0){
//             if((n & 1 )!= 0){
//                 ans = ans*a;
//             }
//             a = a*a;
//             n = n>>1;
//         }
//         return ans;
//     }
//     public static void main(String args[]){
//     System.out.println(fastExpo(5,3));
//     }
// }