// //Bubble Sort
// import java.util.*;
// public class index{

//     public static void bubbleSort(int arr[]){
//         for(int turn = 0; turn < arr.length-1; turn++){
//             for(int j = 0; j < arr.length-1-turn; j++){
//                 if(arr[j] > arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//     }

//     public static void printArray(int arr[]){
//         for(int i = 0; i < arr.length; i++){
//             System.out.print( arr[i] + " ");
//         }
//     }

//     public static void main(String args[]){
//         int arr[] = {5,4,1,3,2};
//         bubbleSort(arr);
//         printArray(arr);
//     }
// }

// import java.util.*;
// //Selection sort
// public class index{
//     public static void selectionSort(int arr[]){
//         for(int i = 0; i < arr.length-1; i++){
//             int minPos = i;
//             for(int j = i+1; j < arr.length; j++){
//              if(arr[minPos] > arr[j]){
//                 minPos = j;
//              }
//             }
//             int temp = arr[minPos];
//             arr[minPos] = arr[i];
//             arr[i] = temp;
//         }
//     }
//         public static void printArray(int arr[]){
//         for(int i = 0; i < arr.length; i++){
//             System.out.print( arr[i] + " ");
//         }
//     }
    
//     public static void main(String args[]){
//         int arr[] = {5,4,1,3,2};
//         selectionSort(arr);
//         printArray(arr);
//     }
// }

// import java.util.*;
// //Insertion sort....
// public class index{
//     public static void insertionSort(int arr[]){
//         for(int i = 1; i < arr.length; i++){
//             int prev = i-1;
//             int curr = arr[i];
//             while(prev >= 0 && arr[prev] > curr){
//                 arr[prev + 1] = arr[prev];
//                 prev--;
//             }
//             arr[prev+1] = curr;
//         }
//     }
//     public static void printArray(int arr[]){
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {5,4,1,3,2};
//         insertionSort(arr);
//         printArray(arr);
//     }
// }

// import java.util.*;
// public class index{
//     public static void printArray(Integer arr[]){
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void main(String args[]){
//         Integer arr[] = {5,4,1,3,2};
//         Arrays.sort(arr, Collections.reverseOrder());
//         printArray(arr);
//     }
// }

////counting sort
// import java.util.*;
// public class index{
//     public static void countingSort(int arr[]){
//         int largest = Integer.MIN_VALUE;
//         for(int i = 0; i < arr.length; i++){
//             largest = Math.max(largest , arr[i]);
//         } 
//
//         int count[] = new int[largest+1];
//         for(int i = 0; i < arr.length; i++){
//             count[arr[i]]++;
//         }
//          int j = 0;
//         for(int i=0; i<count.length; i++){
//             while(count[i] > 0){
//                 arr[j] = i;
//                 j++;
//                 count[i]--;
//             }
//         }
//     }

//     public static void printArray(int arr[]){
//       for(int i = 0; i < arr.length; i++){
//         System.out.print(arr[i] + " ");
//       }
//     }

//     public static void main(String args[]){
//         int arr[] = {1,4,1,3,2,4,3,7};
//         countingSort(arr);
//         printArray(arr);
//     }
// }

// //assignment quetions
// //bubble sort in descending order
// import java.util.*;
// public class index {
//     public static void bubbleSort(int arr[]) {
//         int n = arr.length;
//         for(int i=0; i<n-1; i++) {
//             boolean swapped = false;
//             for(int j=0; j<n-1-i; j++) {
//                 if(arr[j] < arr[j+1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                     swapped = true;
//                 }
//             }
//             if(swapped == false) {
//                 break;
//             }
//         }
//     }
//         public static void printArray(int arr[]) {
//             for(int i=0; i<arr.length; i++) {
//                 System.out.print(arr[i] + " ");
//             }
//         }
//     public static void main(String args[]) {
//         int arr[] = {3,6,2,1,8,7,4,5,3,1};
//         bubbleSort(arr);
//         printArray(arr);
//     }
// }

// //assignment selection sort in descending order
// import java.util.*;
// public class index {
//     public static void selectionSort(int arr[]) {
//         int n = arr.length;
//         for(int i=0; i<n-1; i++) {
//             int maxPos = i;
//             for(int j=i+1; j<n; j++) {
//                 if(arr[maxPos] < arr[j]) {
//                     maxPos = j;
//                 }
//             }

//             int temp = arr[maxPos];
//             arr[maxPos] = arr[i];
//             arr[i] = temp;
//         }
//     }

//     public static void printArray(int arr[]) {
//         for(int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void main(String args[]) {
//         int arr[] = {3,6,2,1,8,7,4,5,3,1};
//         selectionSort(arr);
//         printArray(arr);
//     }
// }

// // assingment insertion  descending order
// public class index{
//     public static void insertionSort(int arr[]) {
//         for(int i=1; i<arr.length; i++) {
//             int curr = arr[i];
//             int prev = i-1;
//             while(prev >= 0 && curr > arr[prev]) {
//                 arr[prev+1] = arr[prev];
//                 prev--;
//             }

//             arr[prev+1] = curr;
//         }
//     }

//     public static void printArray(int arr[]) {
//         for(int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void main(String args[]) {
//         int arr[] = {5, 4, 1, 3, 2};
//         insertionSort(arr);
//         printArray(arr);
//     }
// }

//assignment counting sort descending order
import java.util.*;
public class index {
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int freqCount[] = new int[largest+1];

        for(int i=0; i<freqCount.length; i++) {
            freqCount[arr[i]]++;
        } 

        int j=0;
        for(int i=freqCount.length-1; i>=0; i--) {
            while(freqCount[i] > 0) {
                arr[j] = i;
                j++;
                freqCount[i]--;
            }
        }
    }

    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};
        countingSort(arr);
        printArray(arr);
    }
}