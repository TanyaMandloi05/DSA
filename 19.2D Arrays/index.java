// import java.util.*;
// public class index{
//     public static boolean searchKey(int matrix[][], int key){
//     for(int i=0; i<matrix.length; i++){
//             for(int j=0; j<matrix[0].length; j++){
//                if(matrix[i][j] == key){
//                 System.out.println("key was found at index (" + i + "," + j + ")");
//                 return true;
//                }
//             }
//         }
//         System.out.println("key was not found");
//         return false;
//     }
//     public static void main(String args[]){
//         int matrix[][] = new int[3][3];
//         int m = matrix.length, n = matrix[0].length;
//         Scanner sc = new Scanner(System.in);
//         for(int i=0; i<m; i++){
//             for(int j=0; j<n; j++){
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//          for(int i=0; i<m; i++){
//             for(int j=0; j<n; j++){
//                System.out.print( matrix[i][j] + " " );
//             }
//             System.out.println();
//         }
//         searchKey(matrix, 5);
//     }
// }

// import java.util.*;
// public class index{
//         public static void largest(int matrix[][]){
//             int largest = Integer.MIN_VALUE;
//           for(int i=0; i<matrix.length; i++){
//             for(int j=0; j<matrix[0].length; j++){
//                 largest = Math.max(matrix[i][i], largest);
//          }
//         } 
//         System.out.print(largest); 
//         }

//         public static void main(String args[]){
//         int matrix[][] = new int[3][3];
//         int m = matrix.length, n = matrix[0].length;
//         Scanner sc = new Scanner(System.in);
//         for(int i=0; i<m; i++){
//             for(int j=0; j<n; j++){
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//          for(int i=0; i<m; i++){
//             for(int j=0; j<n; j++){
//                System.out.print( matrix[i][j] + " " );
//             }
//             System.out.println();
//         }
//         largest(matrix);
//       }
// }

import java.util.*;
// spiral matrix
public class index{
    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        while(startRow <= endRow && startCol <= endCol){
            //top
            for(int j = startCol; j <= endCol; j++){
                System.out.print(matrix[startRow][j] + " ");
            }
            //right
            for(int i = startRow+1; i <= endRow; i++){
                System.out.print(matrix[i][endCol] + " ");
            }
            //bottom
            for(int j = endCol-1; j >= startCol; j--){
                if(startRow == endRow){
                    break;
                } else{
                    System.out.print(matrix[endRow][j] + " ");
                }
        
            }
            //left
            for(int i = endRow-1; i >= startRow+1; i--){
                if(startCol == endRow){
                    break;
                } else{
                 System.out.print(matrix[i][startCol] + " ");
                }
               
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }
    public static void main(String args[]){
    // int matrix[][] = {{1,2,3,4}
    //                  ,{5,6,7,8}
    //                  ,{9,10,11,12}
    //                  ,{13,14,15,16}};

    int matrix[][] = {{1, 2, 3}
                     ,{4, 5, 6}
                     ,{7, 8, 9}};
    printSpiral(matrix);
    }
}


// import java.util.*;
// //diagonal sum....
// public class index{
//     public static int diagonalSum(int matrix[][]){
//        int sum = 0;
//         for(int i = 0; i < matrix.length; i++){
//             for(int j = 0; j <= matrix[0].length; j++){
//                 if( i == j){
//                    sum += matrix[i][j];
//                 } else if (i+j == matrix.length-1){
//                     sum += matrix[i][j];
//                 }
//             }
//         }
//         return sum;
//     }
//     public static void main(String args[]){
//         // int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//         int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//         System.out.print(diagonalSum(matrix));
//     }
// }

// import java.util.*;
// // diagonal sum (Optimized code)....
// public class index{
//     public static int diagonalSum(int matrix[][]){
//      int sum = 0;
//         for(int i = 0; i < matrix.length; i++){
//             sum += matrix[i][i];
//             if(i != matrix.length-i-1){
//                 sum += matrix[i][matrix.length-i-1];
//             }
//         }
//         return sum;
//     }
//     public static void main(String args[]){
//       int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//       System.out.println(diagonalSum(matrix)); 
//     }
// }

// import java.util.*;
// // StairCaseSearch....
// public class index{
//     public static boolean stairCaseSearch(int matrix[][], int key){
//         int row = 0 , col = matrix[0].length-1;
//         while(row < matrix.length && col >= 0){
//             if(key == matrix[row][col]){
//                 System.out.println("key was found at index (" + row + "," + col + ")");
//                 return true;
//             } else if( key < matrix[row][col]){
//                 col--;
//             } else{
//                 row ++;
//             }
//         }
//         System.out.print("key was not found");
//         return true;
//     }
//     public static void main(String args[]){
//         int matrix[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
//         int key = 40;
//         stairCaseSearch(matrix, key);
//     }
// }

// import java.util.*;
// public class index{
//     public static boolean stairCaseSearch(int matrix[][], int key){
//     int row = matrix.length-1 , col = 0;
//         while(row >= 0 && col < matrix[0].length){
//             if(key == matrix[row][col]){
//             System.out.print("key was found at index (" + row + "," + col + ")");
//             return true;
//             } else if(key > matrix[row][col]){
//              col++;
//             } else{
//                 row--;
//             }
//         }
//         System.out.print("key was not found");
//         return false;
//     }
//     public static void main(String args[]){
//         int matrix[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
//         int key = 10;
//         stairCaseSearch(matrix, key);
//     }
// }

// // Home work problems...

// import java.util.*;
// //Que 1....
// public class index{
//     public static void printSevens(int matrix[][]){
//         int count = 0;
//     for(int row = 0; row < matrix.length; row++){
//         for(int col = 0; col < matrix[0].length; col++){
//            if(arr[row][col] == 7){
//             count++;
//            }
//         }
//     }
//     System.out.print(count);

//     }
//     public static void main(String args[]){
//         int matrix[][] = {{4,7,8},{8,8,7}};
//         printSevens(matrix);
//     }
// }

// import java.util.*;
// //que 2....
// public class index{
//     public static void sumOfSecondRow(int nums[][]){
//         int sum = 0;
//         for(int i=0; i<nums.length; i++){
//             for(int j=0; j<nums[0].length; j++){
//              if(i == 1){
//                 sum += nums[i][j];
//              }
//             }
//         }
//         System.out.print(sum);
//     }
//     public static void main(String args[]){
//         int nums[][] = {{1,4,9},{11,4,3},{2,2,3}};
//         sumOfSecondRow(nums);
//     }
// }

// import java.util.*;
// public class index{
//     public static void main(String args[]){
//         int matrix[][] = {{1,2,3},{4,5,6}};
//         befor transpose..
//         for(int i = 0; i < matrix.length; i++){
//             for(int j = 0; j < matrix[0].length; j++){
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//         after transpose..
//         for(int i = 0; i < matrix[0].length; i++){
//             for(int j = 0; j < matrix.length; j++){
//                 System.out.print(matrix[j][i] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// //que2
// import java.util.*;
// public class index {
//     public static void printSum(int arr[][]) {
//         int sum = 0;
//         for(int i=0; i<arr.length; i++) {
//             sum += arr[1][i];
//         }

//         System.out.println(sum);
//     }
//     public static void main(String args[]) {
//         int arr[][]= {{1, 4, 9}
//                     ,{11, 4, 3}
//                     ,{2, 2, 3}};
//         printSum(arr);

//     }
// }