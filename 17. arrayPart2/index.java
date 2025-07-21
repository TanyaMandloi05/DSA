// // Maximum Sub Array sum
// import java.util.*;
// public class index{
//     public static void maxSubArrSum(int numbers[]){
//         int currSum = 0,maxSum = Integer.MIN_VALUE;

//         for(int i=0; i<numbers.length; i++){ //O(n)
//             for(int j=i; j<numbers.length; j++){ 
//                 currSum = 0;
//                 for(int k=i; k<=j; k++){
//                     currSum = currSum + numbers[k];
//                 }

//                 System.out.println("subarrays sum is :" + currSum);
//                 if(maxSum < currSum){
//                     maxSum = currSum;
//                 }
//             }
//         }
//         System.out.println("maximum sum is :" + maxSum);
//     }
//     public static void main(String args[]){
//      int numbers[] = {2,4,6,8,10};
//      maxSubArrSum(numbers);
//     }
// }

// //Maximum sub array sum using prefix
// import java.util.*;
// public class index{
//  public static void maxSubArrSum(int numbers[]){
//         int prefix[] = new int[numbers.length];
//         int currSum = 0 ,  maxSum = Integer.MIN_VALUE;
        
//         prefix[0] = numbers[0];
//         for(int i = 1; i < prefix.length; i++){
//             prefix[i] = prefix[i-1] + numbers[i];
//         }
//         for(int i = 0; i < numbers.length; i++){
//             int start = i;
//             currSum = 0;
//             for(int j = i; j < numbers.length; j++){
//              int end = j;
//              currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];  
//              }
//              if(maxSum < currSum){
//                 maxSum = currSum;
//              }
//         }
//         System.out.println("maximum sum is :" + maxSum);
//     }
//     public static void main(String args[]){
//         int numbers[] = {1,-2,6,-1,3};
//         maxSubArrSum(numbers);
//     }
// }

// // kadans algorithm..
// import java.util.*;
// public class index{
//     public static void kadans(int numbers[]){
//         int max_sum = Integer.MIN_VALUE, currSum = 0;
//         for(int i = 0; i < numbers.length; i++){
//             currSum = currSum + numbers[i];
//             max_sum = Math.max(max_sum, currSum);
//          if(currSum < 0){
//             currSum = 0;
//         } 
          
//         }
//       System.out.println("maximum sum is :" + max_sum);
//     }
//     public static void main(String args[]){
//         int numbers[] = {-1,-3, 4, -1, -2, 1, 5, -3};
//         kadans(numbers);
//     }
// }

// //trapping rain water....
// import java.util.*;
// public class index{
//     public static int trappedWater(int height[]){
//         int n = height.length;
//          //left max boundary
//         int leftMax[] = new int[n];
//         leftMax[0] = height[0];
//         for(int i = 1; i < n; i++){
//             leftMax[i] = Math.max(height[i], leftMax[i-1]);
//             System.out.println("left maximum boundary for index  is : " + leftMax[i]);
//         }
       
//         // right max boundary
//         int rightMax[] = new int[n];
//         rightMax[n-1] = height[n-1];
//         for(int i = n-2; i >= 0; i--){
//             rightMax[i] = Math.max(height[i], rightMax[i+1]);
//             System.out.println("right maximum boundary for index is :" + i + "," + rightMax[i]);
//         }
        
//         int trappedWater = 0;
//         for(int i = 0; i < n; i++){
//           //water level
//           int waterLevel = Math.min(leftMax[i], rightMax[i]);
//             //trapped water
//           trappedWater = trappedWater + (waterLevel - height[i]);
//         }
//         return trappedWater;
//         }

//     public static void main(String args[]){
//         int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
//         System.out.println("trapped rain water is :" + trappedWater(height));
//     }
// }

// import java.util.*;
// // buy and sell stock
// public class index{
//     public static int buyAndSellStock(int prices[]){
//         int buyPrice = Integer.MAX_VALUE, max_profit = 0;
//         for(int i = 0; i < prices.length; i++){
//             if(buyPrice < prices[i]){
//                 int profit = prices[i] - buyPrice;
//                 max_profit = Math.max(profit, max_profit);
//             } else{
//                 buyPrice = prices[i];
//             }
//         }
//         return max_profit;
//     }
//     public static void main(String args[]){
//         int prices[] = {7,1,5,3,6,4};
//         System.out.println(buyAndSellStock(prices));
//     }
// }

// import java.util.*;
// // array part 2 assignment question one....
// public class index{
//     public static boolean arrayNums(int nums[]){
//         for(int i = 0; i < nums.length; i++){
//             for(int j = i+1; j < nums.length; j++){
//                 if(nums[i] == nums[j]){
//                     return true;
//                 } 
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         int nums[] = {1,1,1,3,3,4,3,2,4,2};
//         System.out.println(arrayNums(nums));
//     }
// }


// //assignment ques 3
// import java.util.*;
// public class index {
//     public static int buyAndSellStock(int prices[]) {
//         int bp = Integer.MAX_VALUE;
//         int max_profit = Integer.MIN_VALUE;

//         for(int i=0; i<prices.length; i++) {
//             if(bp < prices[i]) {
//                 int profit = prices[i] - bp;
//                 max_profit = Math.max(profit, max_profit);
//             }

//             else {
//                 bp = prices[i];
//             }
//         }

//         if(max_profit > bp) {
//             return max_profit;
//         }
        
//         return 0;
//     }
    
//     public static void main(String args[]) {
//         int prices[] = {7, 1, 5, 3, 6,  };
//         System.out.println(buyAndSellStock(prices));
        
//     }
// }


// //assigment que 4
// import java.util.*;
// public class index { 
//     public static int trappedWater(int height[]) {
//         int n = height.length;
//         int leftMax[] = new int[n];
//         int rightMax[] = new int[n];
//         int totalTrapWat = 0;

//         leftMax[0] = height[0];
//         for(int i=1; i<n; i++) {
//             leftMax[i] = Math.max(height[i], leftMax[i-1]);
//         }

//         rightMax[n-1] = height[n-1];
//         for(int i=n-2; i>=0; i--) {
//             rightMax[i] = Math.max(height[i], rightMax[i+1]);
//         }

//         for(int i=0; i<n; i++) {
//             int water = Math.min(leftMax[i], rightMax[i]);
//             totalTrapWat += water - height[i];
//         }

//         return totalTrapWat;
//     }
//     public static void main(String args[]) {
//         int height[] = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
//         System.out.println(trappedWater(height));
//     }
// }

// import java.util.*;
// public class index {
//     public static void findTriplets(int nums[]) {
//         int n = nums.length;
//         for(int i=0; i<n; i++) {
//             for(int j=i+1; j<n; j++) {
//                 for(int k=j+1; k<n; k++) {
//                     if(nums[i] + nums[k] + nums[j] == 0) {
//                         System.out.println(nums[i] + "," + nums[j] + "," + nums[k]);
//                     }
//                 }
//             }
//         }
//     }

//     public static void main(String args[]) {
//         int nums[] = {-1, 0, 1, 2, -1, 4};
//         findTriplets(nums);
//     }
// }
