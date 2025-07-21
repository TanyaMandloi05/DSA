// // Valid Parenthesis....
// import java.util.*;
// public class StackB {
//     public static boolean isValid(String str) {
//         Stack<Character> s = new Stack<>();
        
//         for(int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i) ;

//             //Opening condition
//             if(ch == '(' || ch == '{' || ch == '[') {
//              s.push(ch);
//             } // closing conditon 
//             else {
//                 if(s.isEmpty()) {
//                     return false;
//                 }
//                 if((s.peek() == '(' && ch == ')') || 
//                 (s.peek() == '{' && ch == '}') ||
//                 s.peek() == '[' && ch == ']') {
//                  s.pop();
//                 }
                
//              else {
//                return false;
//             }
//         }
//         }
//         if(s.isEmpty()) {
//             return true;
//         } else {
//             return false;
//         }
//     }

//     public static void main(String args[]) {
//         String str = "()";
//         System.out.println(isValid(str));
//     }
// }


// // Duplicate parenthesis...
// import java.util.*;
// public class StackB {
//     public static boolean isDuplicate(String str) {
//         Stack<Character> s = new Stack<>();

//         for(int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             //closing 
//         if(ch == ')') {
//             int count = 0;
//             while(s.peek() != '(') {
//                 s.pop();
//                 count ++;
//             }
//             if(count < 1) {
//                 return true; //duplicate
//             } else {
//                 s.pop();
//             }
//         } else {
//             //opening
//             s.push(ch);
//         }
//         }
//         return false;
//     }

//     public static void main(String args[]) {
//         String str = "((a+b))";
//         String str2 = "(c+d)";
//         System.out.println(isDuplicate(str2));
//     }
// }

// maximum ractangular area in Histogram....
import java.util.*;
public class StackB {
    public static void maxArea(int arr[]) {
        int maxArea = 0;
        int nsl[] = new int[arr.length];
        int nsr[] = new int[arr.length];

        //next smaller right..
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1; i>=0; i--) {
            while(!s.isEmpty() && arr[i] <= arr[s.peek()]) {
                s.pop();
            } 

            if(s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
               nsr[i] = s.peek();
            }
            s.push(i);
        }

        //next smaller left..
         s = new Stack<>();
        for(int i=0; i<arr.length; i++) {
            while(!s.isEmpty() && arr[i] <= arr[s.peek()]) {
                s.pop();
            } 

            if(s.isEmpty()) {
                nsl[i] = arr.length;
            } else {
               nsl[i] = s.peek();
            }
            s.push(i);
        }
         
        // calculating area..
        for(int i=0; i<arr.length; i++) {
            int height = arr[i];
            int widht = nsr[i] - nsl[i] - 1;
            int currArea = height * widht;
            maxArea = Math.max(currArea, maxArea);
        } 
        System.out.println("max recatngualr area is : " + maxArea);
    }

    public static void main(String args[]) {
        int arr[] = {2, 1, 5, 6, 2, 3};
        maxArea(arr);
    }
}