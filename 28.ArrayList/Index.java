// import java.util.ArrayList;
// public class Index{
//     public static void main(String args[]){
//         ArrayList <Integer> list = new ArrayList<>();
//         // Add element in arraylist...
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(9);
//         list.add(5);
//         list.add(6);

//         int max = Integer.MIN_VALUE;
//         for(int i = 0; i < list.size(); i++){
//             if(max < list.get(i)){
//                 // max = list.get(i);
//                 max = Math.max(max, list.get(i));
//             }
//           }
//              System.out.println("maximum element  = " + max);
        
//         // // Reverse print
//         // for(int i = list.size()-1; i >= 0; i--){
//         //     System.out.print(list.get(i) + " ");
//         // }

//         // // print ele of arraylist..
//         // System.out.println(list.size());
//         // for(int i = 0; i < list.size(); i++){
//         //     System.out.print(list.get(i) + " ");
//         // }

//         // System.out.println(list.contains(2));
//         //  System.out.println(list.contains(11));
        
//         // // get element
//         // int element = list.get(2);
//         // System.out.println(element);

//         // // delete ele
//         // list.remove(1);
//         // System.out.println(list);

//         // //Set ele
//         // list.set(2,10);
//         // System.out.println(list);
//     }
// }


// // Swap in arrayList...
// import java.util.ArrayList;
// public class Index{
//     public static void swap(ArrayList<Integer> list, int idx1, int idx2){
//         int temp = list.get(idx1);
//         list.set(idx1 , idx2);
//         list.set(idx2, temp);
//     }
//     public static void main(String args[]){
//     ArrayList <Integer> list = new ArrayList<>();
//     list.add(2);
//     list.add(5);
//     list.add(9);
//     list.add(3);
//     list.add(6);
//     int idx1 = 1 , idx2 = 3;
//      System.out.print(list);
//      swap(list, idx1, idx2);
//      System.out.print(list);
//     }
// }

// Sorting in array list
// import java.util.*;
// public class Index{
//     public static void main(String args[]){
//         ArrayList<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(5);
//        list.add(9);
//        list.add(3);
//        list.add(6);
//        Collections.sort(list);
//        System.out.print(list);
//        Collections.sort(list, Collections.reverseOrder());
//        System.out.print(list);


//     }
// }

//// Multidimensional arrayList
// import java.util.*;
// public class Index{
//     public static void main(String args[]){
//         ArrayList <ArrayList<Integer>> mainList = new ArrayList<>();
//         ArrayList <Integer> list = new ArrayList<>();
//         list.add(1); list.add(2);
//         mainList.add(list);
        
//         ArrayList <Integer> list2 = new ArrayList<>();
//         list2.add(3); list2.add(4);
//         mainList.add(list2);

//         for(int i=0; i<mainList.size(); i++){
//             ArrayList<Integer> currList = mainList.get(i);
//             System.out.print(currList);
//             for(int j=0; j<currList.size(); j++){
//                 System.out.print(currList.get(j) + " ");
//             }
//             System.out.println();
//         }
//         System.out.println(mainList);
//     }
// }

// import java.util.*;
// public class Index{
//     public static void main(String args[]){
//         ArrayList <ArrayList<Integer>> mainList = new ArrayList<>();
//         ArrayList <Integer> list1 = new ArrayList<>();
//         ArrayList <Integer> list2 = new ArrayList<>();
//         ArrayList <Integer> list3 = new ArrayList<>();
        
//         for(int i=1; i<=5; i++){
//             list1.add(i*1);
//             list2.add(i*2);
//             list3.add(i*3);
//         }
//         mainList.add(list1);
//         mainList.add(list2);
//         mainList.add(list3);

//         for(int i=0; i<mainList.size(); i++){
//             ArrayList<Integer> currList = mainList.get(i);
//             for(int j=0; j<currList.size(); j++){
//                 System.out.print(currList.get(j) + " ");
//             }
//             System.out.println();
//         }
//         System.out.println(mainList);
//     }
// }


// // Container with most water... Brute Force approch TC = O(n^2)
// import java.util.*;
// public class Index{
//     public static int storeWater(ArrayList <Integer> height){
//      int maxWater = 0;
//      for(int i = 0; i < height.size(); i++){
//         for(int j = i+1; j < height.size(); j++){
//             int ht = Math.min(height.get(i) , height.get(j));
//             int width = j - i;
//             int currWater = ht*width;
//             maxWater = Math.max(maxWater,currWater);
//         }
//      }
//     return maxWater;
//     }

//     public static void main(String args[]){
//        ArrayList <Integer> height = new ArrayList<>(); 
//        height.add(1);
//        height.add(8);
//        height.add(6);
//        height.add(2);
//        height.add(5);
//        height.add(4);
//        height.add(8);
//        height.add(3);
//        height.add(7);
//        System.out.print(storeWater(height));
//     }
// }



// // Container with most water... Two Pointer approch TC = O(n)
// import java.util.*;
// public class Index{
//     public static int storeWater(ArrayList <Integer> height){
//      int maxWater = 0;
//      int lp = 0, rp = height.size()-1;
//      while(lp < rp){
//         int ht = Math.min(height.get(lp), height.get(rp));
//         int width = rp - lp;
//         int currWater = ht * width;
//         maxWater  = Math.max(maxWater, currWater);
//         if(height.get(lp) < height.get(rp)){
//             lp ++;
//         } else{
//             rp --;
//         }
//      }
//     return maxWater;
//     }

//     public static void main(String args[]){
//        ArrayList <Integer> height = new ArrayList<>(); 
//        height.add(1);
//        height.add(8);
//        height.add(6);
//        height.add(2);
//        height.add(5);
//        height.add(4);
//        height.add(8);
//        height.add(3);
//        height.add(7);
//        System.out.print(storeWater(height));
//     }
// }


// //Pair sum 1 brute force approch...
// import java.util.*;
// public class Index{
//     public static boolean pairSum1(ArrayList<Integer>list, int target){
//         for(int i=0 ; i<list.size(); i++){
//             for(int j=i+1; j<list.size(); j++){
//                 if(list.get(i) + list.get(j) == target){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         ArrayList<Integer>list = new ArrayList<>();
//         for(int i = 1; i<=6; i++){
//             list.add(i);
//         }
//         int target = 80;
//         System.out.print(pairSum1(list, target));
//     }
// }


// //Pair sum 1 two pointer approch...
// import java.util.*;
// public class Index{
//     public static boolean pairSum1(ArrayList<Integer>list, int target){
//        int lp = 0, rp = list.size()-1;
//        while(lp < rp){
//         if(list.get(lp) + list.get(rp) == target){
//             return true;
//        } 
//         if(list.get(lp) + list.get(rp) < target){
//         lp++;
//        } else{
//         rp --;
//        }
//        }
       
//         return false;
//     }
//     public static void main(String args[]){
//         ArrayList<Integer>list = new ArrayList<>();
//         for(int i = 1; i<=6; i++){
//             list.add(i);
//         }
//         int target = 5;
//         System.out.print(pairSum1(list, target));
//     }
// }


// pair sum2 pointer approch on sorted and rotated array
import java.util.*;
public class Index{
    public static boolean pairSum2(ArrayList<Integer>list, int target){
        int breakinPoint = -1;
        int n = list.size();
        
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > list.get(i+1)){
                breakinPoint = i;
                break;
            }
        }

        int lp = breakinPoint+1;
        int rp = breakinPoint;

        while(lp != rp){
            // case 1
            if(list.get(lp) + list.get(rp) == target){
                return true;
            } 

            // case 2 
            if(list.get(lp) + list.get(rp) < target){
                lp = (lp+1) % n;
             } else {
                 rp = (n+rp-1)%n;
             }
            
        }
        return false;
    }

    public static void main(String args[]){
        ArrayList<Integer> list  = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.print(pairSum2(list, target));
    }
}