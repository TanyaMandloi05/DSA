//linear search
// import java.util.*;
// public class index{
//     public static int linearSearch(String menu[], String key){
//         for(int i=0; i<menu.length; i++){
//             if(key == menu[i]){
//                 return i;
//             } 
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         String menu[] = {"dosa","Pizza","pasta","samosa"};
//         String key = "Pizza";
//         int index = linearSearch(menu, key);
//         if(index == -1){
//             System.out.println("Key not found");
//         } else{
//             System.out.println("key is at index:" + index);
//         }
        
//     }
// }

// largest number
// import java.util.*;
// public class index{
//     public static int largest(int numbers[]){
//         int largest = Integer.MIN_VALUE;
//         for(int i=0; i<numbers.length; i++){
//             if(largest < numbers[i]){
//                 largest = numbers[i];
//             }
//         }
//         return largest;
//     }
//     public static void main(String args[]){
//         int numbers[] = {2,4,6,1,3};
//         System.out.println("largets number is: " + largest(numbers));

//     }
// }

// //binary Search
// import java.util.*;
// public class index{
//     public static int binarySearch(int numbers[], int key){
//         int start = 0;
//         int end = numbers.length-1;
//         while(start <= end){
//             int mid = (start + end)/2;
//             if(numbers[mid] == key){
//                 return mid;
//             } 

//             if(numbers[mid] < key){
//             start = mid + 1;
//         } 

//         else{
//             end = mid - 1;
//         }
//         } 

//         return -1;
//     }
//     public static void main(String args[]){
//         int numbers[] = {2,4,6,8,10,12,14};
//         int key = 20;
//         System.out.println("key is at index : " + binarySearch(numbers, key));
//     }
// }

// //reverse an array
// import java.util.*;
// public class index{
//     public static void reverse(int numbers[]){
//         int first = 0, last = numbers.length-1;
//         while(first < last){
//             int temp = numbers[last];
//             numbers[last] = numbers[first];
//             numbers[first] = temp;
//             first++;
//             last--;
//         }
//     }
//     public static void main(String args[]){
//         int numbers[] = {2,3,4,5,6,7,8,9,10};
//         reverse(numbers);
//         for(int i=0; i<numbers.length; i++){
//             System.out.print(numbers[i] + " ");
//         }
//         System.out.println();
//     }
// }

// //pairs in array
// import java.util.*;
// public class index{
//     public static void pairsInArray(int numbers[]){
//         int tp = 0; //total pair
//         for(int i=0; i<numbers.length-1; i++){
//             int curr = numbers[i];
//             for(int j=i+1; j<numbers.length; j++){
//                 System.out.print("(" +  curr + "," +  numbers[j] + ")" );
//                 tp++;
//             }
//             System.out.println();
//         }
//         System.out.println("total pairs = " + tp);
//     }

// public static void main(String args[]){
//     int numbers[] = {2,4,6,8,10};
//     pairsInArray(numbers);
// }
// }

// //subarray
// import java.util.*;
// public class index{
//     public static void printSubArray(int numbers[]){
//         int ts = 0;
//         for(int i=0; i<numbers.length; i++){
//             int start = i;
//             for(int j=0; j<numbers.length; j++){
//                 int end = j;
//                 for(int k=start; k<=end; k++){
//                     System.out.print(numbers[k] + " ");
//                 }
//                 System.out.println();
//                 ts++;
//             }
//         }
//     System.out.println("total subArrays is:" + ts);
//     }
//     public static void main(String args[]){
//         int numbers[] = {2,4,6,8,10};
//         printSubArray(numbers);
//     }
// }



