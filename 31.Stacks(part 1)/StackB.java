// import java.util.*;
//// stack using ArrayList...
// public class StackB {
//     static class Stack {
//         static ArrayList<Integer> list = new ArrayList<Integer>();

//         // isEmpty
//         public static boolean isEmpty() {
//             return list.size() == 0;
//         }

//         // push
//         public static void push(int data) {
//             list.add(data);
//         }

//         // pop
//         public static int pop() {
//             if(isEmpty()){
//                 return -1;
//             }
//             int top = list.get(list.size() - 1);
//             list.remove(list.size()-1);
//             return top;
//         }

//         //peek
//         public static int peek() {
//              if(isEmpty()){
//                 return -1;
//             }
//             return list.get(list.size() - 1);
//         }

//     }
//     public static void main(String args[]){
//       Stack s = new Stack();
//       s.push(1);
//       s.push(2);
//       s.push(3);

//       while(!s.isEmpty()){
//         System.out.println(s.peek());
//         s.pop();
//       }
//     }
// }

//// stack using ll..
// import java.util.*;
// public class StackB {
//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }
//     static class Stack {
//         static Node head = null;
//         // isEmpty.
//         public static boolean isEmpty() {
//             return head == null;
//         }

//         // push 
//         public static void push(int data) {
//             Node newNode = new Node(data);
//             if(isEmpty()) {
//                 head = newNode;
//                 return;
//             }
//             newNode.next = head;
//             head = newNode;
//         }
        

//         //pop
//         public static int pop() {
//             if(isEmpty()) {
//                 return -1;
//             }
//             int top = head.data;
//             head = head.next;
//             return top;
//         }

//         //peek
//         public static int peek() {
//             if(isEmpty()) {
//                 return -1;
//             }
//             return head.data;
//         }
//     }
//     public static void main(String args[]){
//       Stack s = new Stack();
//       s.push(1);
//       s.push(2);
//       s.push(3);

//       while(!s.isEmpty()){
//         System.out.println(s.peek());
//         s.pop();
//       }
//     }
// }

// // stack using java collection framework
// import java.util.*;
// public class StackB {
    
//     public static void main(String args[]) {
//       Stack<Integer> s = new Stack<>();
//       s.push(1);
//       s.push(2);
//       s.push(3);

//       while(!s.isEmpty()) {
//         System.out.println(s.peek());
//         s.pop();
//       }
//     }
// }

// //Push at the bottom...
// import java.util.*;
// public class StackB {
    
//     public static void pushAtBottom(Stack<Integer> s, int data) {
//     if(s.isEmpty()){
//         s.push(data);
//         return;
//     }
//     int top = s.pop();
//     pushAtBottom(s,data);
//     s.push(top);
//     }

//     public static void main(String args[]) {
//       Stack<Integer> s = new Stack<>();
//       s.push(1);
//       s.push(2);
//       s.push(3);
//       pushAtBottom(s,4);
//       while(!s.isEmpty()) {
//         System.out.println(s.peek());
//         s.pop();
        
//       }
//     }
// }

// //Reverse a string
// import java.util.*;
// public class StackB {
//     public static String reverString(String str){
//       Stack<Character> s = new Stack<>();
//     int idx = 0;
//     while(idx < str.length()){
//         s.push(str.charAt(idx));
//         idx++;
//     }
//     StringBuilder result  = new StringBuilder("");
//     while(!s.isEmpty()){
//         char curr = s.pop();
//         result.append(curr);
//     }
//     return result.toString();
//     }
  
//     public static void main(String args[]) {
//      String str = "abc";
//      System.out.print(reverString(str));
     
//     }
// }

// //Reverse a Stack...
// import java.util.*;
// public class StackB {
//     public static void pushAtBottom(Stack<Integer> s, int data) {
//         if(s.isEmpty()) {
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//         pushAtBottom(s, data);
//         s.push(top);
//     }

//     public static void reversStack(Stack<Integer> s) {
//         if(s.isEmpty()) {
//             return;
//         }
//         int top = s.pop();
//         reversStack(s);
//         pushAtBottom(s, top);
//     }
   
//     public static void printStack(Stack<Integer> s) {
//         while(!s.isEmpty()) {
//             System.out.println(s.pop());
//         }
//     }
    
//     public static void main(String args[]) {
//     Stack<Integer> s = new Stack<>();
//     s.push(1);
//     s.push(2);
//     s.push(3);
//     // 3 2 1
//     reversStack(s);
//     printStack(s);
//     // 1 2 3
//     }
// }

// //Stock span problem...
// import java.util.*;
// public class StackB {
//     public static void stockSpan(int stock[], int span[]) {
//          Stack<Integer> s = new Stack<>();
//          span[0] = 1;
//          s.push(0);

//          for(int i = 1; i < stock.length; i++) {
//             int currPrice = stock[i];
//             while(!s.isEmpty() && currPrice >= stock[s.peek()]) {
//                 s.pop();
//             }
//             if(s.isEmpty()) {
//                 span[i] = i+1;
//             } else {
//                 int prevHigh = s.peek();
//                 span[i] = i - prevHigh;
//             }
//             s.push(i);
//          }
//     }
//     public static void main(String args[]) {
//         int stock[] = {100, 80, 60, 70, 60, 85, 100};
//         int span[] = new int[stock.length];
//         stockSpan(stock, span);
//         for(int i = 0; i < span.length; i++) {
//             System.out.println(span[i] + " ");
//         }
//     }
// }


// NextGreater on the right side....
import java.util.*;
public class StackB {
     public static void main(String args[]) {
        int arr[] = {4, 5, 2, 25};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for(int i = arr.length-1; i >= 0 ; i--) {

            while(!s.isEmpty() && arr[i] > arr[s.peek()]) {
                s.pop();
            } 
            
            if(s.isEmpty()) {
                nxtGreater[i] = -1; 
            } else {
                nxtGreater[i] = arr[s.peek()];
            }

            s.push(i);
        } 
        for(int i = 0; i < nxtGreater.length; i++){
            System.out.print(nxtGreater[i] + " ");
        }
        System.out.println();
     }
}