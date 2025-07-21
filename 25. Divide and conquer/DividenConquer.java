// //merge sort
// public class DividenConquer{
//     public static void printArr(int arr[]){
//         for(int i = 0; i < arr.length ; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void mergeSort(int arr[], int si, int ei){
//         // Base case...
//         if(si >= ei){
//             return;
//         }
//         int mid = si + (ei - si)/2;
//         mergeSort(arr, si, mid);
//         mergeSort(arr, mid+1, ei);
//         merge(arr, si, mid, ei);
//     }
//     public static void merge(int arr[], int si, int mid, int ei){
//         int temp[] = new int[ei - si + 1];
//         int i = si;
//         int j = mid + 1;
//         int k = 0;
//         while(i <= mid && j <= ei){
//             if(arr[i] < arr[j]){
//                 temp[k] = arr[i];
//                 i++;
//             } else{
//                 temp[k] = arr[j];
//                 j++;
//             }
//             k++;
//         }
//         while(i <= mid){

//             temp[k++] = arr[i++];
//         }
//         while(j <= ei){
//             temp[k++] = arr[j++];
//         }
//         // copy arr in original function..
//         for( k = 0, i = si; k < temp.length; k++, i++){
//             arr[i] = temp[k];
//         }

//     }
//     public static void main(String args[]){
//         int arr[] = {6,3,9,5,2,8};
//         mergeSort(arr, 0, arr.length-1);
//         printArr(arr);
//     }
// }


public class DividenConquer{
    // Quick Sort...
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
        public static void quickSort(int arr[], int si, int ei){
        // Base condition
        if(si >= ei){
            return;
        }
        int pidx = partition(arr, si, ei);
        quickSort(arr, si, pidx-1); // left
        quickSort(arr, pidx+1, ei); // right
        }

        public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;
        for(int j = si; j < ei; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
               arr[j] = arr[i];
                arr[i] = temp;
            }
         }
             i++; // Move i to correct position
             int temp = pivot;  // Put element at i in pivot’s place
              arr[ei] = arr[i]; // Put pivot at correct position (i)
             arr[i] = temp;
             return i;
        }
    
    public static void main(String args[]){
        int arr[] = {6,3,9,8,2,5};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}

// // search in sorted and rotated arry
// public class DividenConquer{
//     public static int search(int arr[], int target, int si, int ei){
//         // Base Case..
//         if(si > ei){
//             return -1;
//         }
      
//         int mid = si + (ei - si)/2 ;
//         if(arr[mid] == target){
//             return mid;
//         }
//         // line 1
//         if(arr[si] <= arr[mid]){
//             if(arr[mid] >= target && arr[si] <= target){
//                 return search(arr, target, si, mid-1);
//             } else{
//                return search(arr, target, mid+1, ei);
//             }

//         } else{ // line 2
//            if(arr[mid] <= target && arr[ei] >= target){
//            return search(arr, target, mid+1, ei);
//            } else{
//            return search(arr, target, si, mid-1);
//            }
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {4,5,6,7,0,1,2};
//         int target = 6;
//         int targetIdx = search(arr, target, 0, arr.length-1);
//         System.out.print(targetIdx);
//     }
// }


// public class DividenConquer{
//     public static int search(int arr[], int target, int si, int ei){
        
      
//         int mid = si + (ei - si)/2 ;
//         if(arr[mid] == target){
//             return mid;
//         }
//         // line 1
//         if(arr[si] <= arr[mid]){
//             if(arr[mid] >= target && arr[si] <= target){
//                 for(int i=0; i<=mid-1; i++){
//                     if(arr[i] == target){
//                         return i;
//                     }
//                 }
//               } 
//               else{
//                 for(int i=mid+1; i<arr.length; i++){
//                     if(arr[i] == target){
//                         return i;
//                     }
//                 }
//             }
         
//         } 
//         else
//         { // line 2
//            if(arr[mid] <= target && arr[ei] >= target){
//             for(int i=mid+1; i<arr.length; i++){
//                  if(arr[i] == target){
//                    return i;
//                  }
//               }
//            } 
//            else{
//             for(int i=0; i<=mid-1; i++){
//              if(arr[i] == target){
//                    return i;
//                  }
//             }
//          }
//         }
//          return -1;
//     }
//     public static void main(String args[]){
//         int arr[] = {4,5,6,7,0,1,2};
//         int target = 6;
//         int targetIdx = search(arr, target, 0, arr.length-1);
//         System.out.print(targetIdx);
//     }
// }


// //Que1
// public class DividenConquer {
//     public static void printArr(String arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static void mergeArr(String arr[], int si, int ei) {
//         if (si >= ei) {
//             return;
//         }

//         int mid = si + (ei - si) / 2;

//         mergeArr(arr, si, mid);
//         mergeArr(arr, mid + 1, ei);
//         merge(arr, si, mid, ei);
//     }

//     public static void merge(String arr[], int si, int mid, int ei) {
//         int i = si;
//         int j = mid + 1;
//         int k = 0;
//         String temp[] = new String[ei - si + 1];

//         while (i <= mid && j <= ei) {
//             if (arr[i].compareTo(arr[j]) <= 0) {
//                 temp[k++] = arr[i++];
//             } else {
//                 temp[k++] = arr[j++];
//             }
//         }

//         while (i <= mid) {
//             temp[k++] = arr[i++];
//         }

//         while (j <= ei) {
//             temp[k++] = arr[j++];
//         }

//         for (k = 0, i = si; k < temp.length; k++, i++) {
//             arr[i] = temp[k];
//         }
//     }

//     public static void main(String args[]) {
//         String arr[] = {"sun", "earth", "mars", "mercury"};
//         mergeArr(arr, 0, arr.length - 1);
//         printArr(arr);
//     }
// }

// // Que 2
// import java.util.*;
// public class DividenConquer {
//     public static int majorityEle(int arr[]) {
//         HashMap<Integer, Integer> map = new HashMap<>();

//         for (int i = 0; i < arr.length; i++) {
//             map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
//         }

//         int maxKey = Integer.MIN_VALUE;
//         int maxValue = Integer.MIN_VALUE;

//         // Iterate through the keys to find the one with the maximum frequency
//         Set<Integer> keys = map.keySet();
//         for (Integer k : keys) {
//             if (map.get(k) > maxValue) {
//                 maxValue = map.get(k);
//                 maxKey = k;
//             }
//         }

//        return maxKey;
//     }

//     public static void main(String args[]) {
//         int arr[] = {2,2,1,1,1,2,2};
//         System.out.println(majorityEle(arr));
//     }
// }

// import java.util.*;
// public class DividenConquer {
//     public static void inverseCount(int arr[]) {
//         int count = 0;
//         for(int i=0; i<arr.length; i++) {
//             for(int j=i+1; j<arr.length; j++) {
//                 if(arr[i] > arr[j]) {
//                     count++;
//                 }
//             }
//         }

//         System.out.println(count);
//     }
//     public static void main(String args[]) {
//         // int arr[] = {2, 4, 1, 3, 5};
//         int arr[] = {2, 3, 4, 5, 6};
//         inverseCount(arr);
//     }
// }