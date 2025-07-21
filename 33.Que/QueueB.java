// import java.util.*;
// public class QueueB {
//     static class Queue {
//         static int arr[];
//         static int size;
//         static int rear;

//         Queue(int n) {
//             arr = new int[n];
//             size = n;
//             rear = -1;
//         }
        
//         public static boolean isEmpty() {
//             return rear == -1;
//         }

//         public static void add(int data) {
//             if(rear == size-1) {
//                 System.out.println("queue is not empty ");
//             }
//             rear = rear + 1;
//             arr[rear] = data;
//         }

//         public static int remove() {
//             if(isEmpty()) {
//                 System.out.println("Queue is full");
//             }
//             int front = arr[0];
//             for(int i=0; i<rear; i++) {
//                 arr[i] = arr[i+1];
//             }
//             rear--;
//              return front;
//         }

//         public static int peek() {
//             if(isEmpty()) {
//                 System.out.println("Queue is full");
//             }
//                  return arr[0];
//         }
        
//     }
//     public static void main(String args[]) {
//       Queue q = new Queue(5);
//       q.add(1);
//       q.add(2);
//       q.add(3);

//       while(!q.isEmpty()) {
//         System.out.println(q.peek());
//             q.remove();
        
//       }
//     }
// }

// //circular queue..
// import java.util.*;
// public class QueueB {
//     static class Queue {
//         static int arr[];
//         static int size;
//         static int rear;
//         static int front;

//         Queue(int n) {
//             arr = new int[n];
//             size = n;
//             rear = -1;
//             front = -1;
//         }
        
//         public static boolean isEmpty() {
//             return rear == -1 && front == -1;
//         }

//         public static boolean isFull() {
//             return (rear + 1) % size == front;
//         }



//         public static void add(int data) {
//             if(isFull()) {
//                 System.out.println("queue is not empty ");
//                 return;
//             }
//             if(front == -1) {
//                 front = 0;
//             }
//            rear = (rear + 1) % size;
//             arr[rear] = data;
//         }

//         public static int remove() {

//             if(isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }
//             int result = arr[front];
//             if(rear == front) {
//                 rear = front = -1;
//             } else {
//                  front = (front + 1) % size;
//             }
           
//             return result;
//         }

//         public static int peek() {
//             if(isEmpty()) {
//                 System.out.println("Queue is full");
//             }
//                  return arr[front];
//         }
        
//     }
//     public static void main(String args[]) {
//       Queue q = new Queue(5);
//       q.add(1);
//       q.add(2);
//       q.add(3);
//       System.out.println(q.remove());
//       q.add(4);
//       System.out.println(q.remove());
//       q.add(5);
//       System.out.println(q.remove());
//       q.add(6);

//       while(!q.isEmpty()) {
//         System.out.println(q.peek());
//             q.remove();
        
//       }
//     }
// }

// import java.util.*;
// public class QueueB {
//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }
//     static class Queue {
//         static Node head = null;
//         static Node tail = null;
        
//         public static boolean isEmpty() {
//             return head == null && tail == null;
//         }

//         public static void add(int data) {
//             Node newNode = new Node(data);
//             if(isEmpty()) {
//                 head = tail = newNode;
//                 return;
//             }

//             tail.next = newNode;
//             tail = newNode;
//         }

//         public static int remove() {

//             if(isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }
//             int front = head.data;
//             if(head == tail) {
//                 head = tail = null;
//                 return front;
//             }
//             head = head.next;
//             return front;
//         }

//         public static int peek() {
//             if(isEmpty()) {
//                 System.out.println("Queue is full");
//             }
//                  return head.data;
//         }
        
//     }
//     public static void main(String args[]) {
//       Queue q = new Queue();
//       q.add(1);
//       q.add(2);
//       q.add(3);
      
//       while(!q.isEmpty()) {
//         System.out.println(q.peek());
//             q.remove();
        
//       }
//     }
// }


// //Queue using two stack...
// import java.util.*;
// public class QueueB {
//     static class Queue {
//        static Stack<Integer> s1 = new Stack<>();
//        static Stack<Integer> s2 = new Stack<>();

//         public static boolean isEmpty() {
//             return s1.isEmpty();
//         }

//         //add
//         public static void add(int data) {
//             while(!s1.isEmpty()) {
//                 s2.push(s1.pop());
//             }

//             s1.push(data);

//             while(!s2.isEmpty()) {
//                 s1.push(s2.pop());
//             }
//         }

//         //remove
//         public static int remove() {
//             if(s1.isEmpty()) {
//                 System.out.println("Queue is empty");
//                 return -1;
//             }

//             return s1.pop();
//         }

//         //Peek
//         public static int peek() {
//             if(s1.isEmpty()) {
//                 System.out.println("Queue is empty");
//                 return -1;
//             }

//             return s1.peek();
//         }
//     }
//     public static void main(String args[]) {
//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);

//         while(!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }


// //Stack using two Queue...
// import java.util.*;
// public class QueueB {
//     static class Stack{
//         static Queue<Integer> q1 = new ArrayDeque<>();
//         static Queue<Integer> q2 = new ArrayDeque<>();
         
//        public static boolean isEmpty() {
//         return q1.isEmpty() && q2.isEmpty();
//        }

//        //add
//        public static void push(int data) {
//         if(!q1.isEmpty()) {
//             q1.add(data);
//         } else {
//             q2.add(data);
//         }
//        }

//        //remove
//        public static int pop() {
//         if(isEmpty()) {
//             System.out.println("stack is empty");
//             return -1;
//         }

//         int top = -1;

//         if(!q1.isEmpty()) {
//             while(!q1.isEmpty()) {
//                 top = q1.remove();
//                 if(q1.isEmpty()) {
//                     break;
//                 } 
//                 q2.add(top);
//             }

//          }
//          else {
//             while(!q2.isEmpty()) {
//                 top = q2.remove();
//                 if(q2.isEmpty()) {
//                     break;
//                 }
//                 q1.add(top);
//             }
//          }
//         return top;
//        }
    

//     public static int peek() {
//         if(isEmpty()) {
//             System.out.println("stack is empty");
//             return -1;
//         }
//         int top = -1;

//         if(!q1.isEmpty()){
//             while(!q1.isEmpty()) {
//                 top = q1.remove();
//                  q2.add(top);
//             }
//         }
//         else {
//             while(!q2.isEmpty()) {
//                 top = q2.remove();
//                 q1.add(top);
//             }
//         }
//         return top;
//     }
//     }
    
//     public static void main(String args[]) {
//     Stack s = new Stack();
//     s.push(1);
//     s.push(2);
//     s.push(3);

//     while(!s.isEmpty()) {
//         System.out.println(s.peek());
//             s.pop();
        
//      }
//     }
// }

// // first non repeating characters in a stream..
// import java.util.*;
// public class QueueB {
//     public static void printfirstNonRepeating(String str) {
//         int freq[] = new int[26];
//         Queue<Character> q = new LinkedList<>();

//         for(int i=0; i<str.length(); i++) {
//             char ch = str.charAt(i);
//             q.add(ch);
//             freq[ch - 'a']++;

//             while(!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
//                 q.remove();
//             } 
//             if(q.isEmpty()) {
//                 System.out.print(-1 + " ");
//             } else {
//                 System.out.print(q.peek() + " ");
//             }
//         }
//     }
//     public static void main(String args[]) {
//         String str = "aabccxb";
//         printfirstNonRepeating(str);
//     }
// }

// //interleave two halves of queue..
// import java.util.*;
// public class QueueB {
//     public static void interLeave(Queue<Integer> q) {
//         Queue<Integer> firstHalf = new LinkedList<>();
//         int size = q.size();

//         for(int i=0; i<size/2; i++) {
//             firstHalf.add(q.remove());
//         }
//         while(!firstHalf.isEmpty()) {
//               q.add(firstHalf.remove());
//               q.add(q.remove());  
//             }
//     }

//     public static void main(String args[]) {
//         Queue<Integer> q = new LinkedList<>();

//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         q.add(6);
//         q.add(7);
//         q.add(8);
//         q.add(9);
//         q.add(10);

//         interLeave(q);
//         while(!q.isEmpty()) {
//             System.out.print(q.remove() + " ");
//         }
        
//     }
// }

// // reverse a queue..
// import java.util.*;
// public class QueueB {
//     public static void reverseQueue(Queue<Integer> q) {
//         Stack<Integer> s = new Stack<>();

//         while(!q.isEmpty()) {
//             s.push(q.remove());
//         }

//         while(!s.isEmpty()) {
//             q.add(s.pop());
//         }
//     }
//     public static void main(String args[]) {
//         Queue<Integer> q = new LinkedList<>();

//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         reverseQueue(q);

//         while(!q.isEmpty()) {
//             System.out.println(q.remove() + " ");
//         }
//     }
// }

// //Deque (Double ended queue)..
// import java.util.*;
// public class QueueB {
//     public static void main(String args[]) {
//         Deque<Integer> dq = new LinkedList<>();

//         dq.addFirst(1);
//         dq.addLast(2);
//         dq.addLast(3);
//         System.out.println(dq);
//         dq.removeFirst();
//         System.out.println(dq);
//         System.out.println("first element is " + dq.getFirst());
//     }
// }

// //Stack using deque
// import java.util.*;
// public class QueueB {
//     static class Stack {

//        static Deque<Integer> dq = new LinkedList<>();

//        public static boolean isEmpty() {
//         return dq.isEmpty();
//        }
//         //push
//         public static void push(int data) {
//             dq.addLast(data);
//         }

//         public static int pop() {
//             return dq.removeLast();
//         }

//         public static int peek() {
//             return dq.getLast();
//         }

//     }
//     public static void main(String args[]) {
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         while(!s.isEmpty()) {
//             System.out.println(s.peek());
//                 s.pop();
            
//         }
//     }
// }


//Queue using deque
import java.util.*;
public class QueueB {
    static class Queue {

       static Deque<Integer> dq = new LinkedList<>();

       public static boolean isEmpty() {
        return dq.isEmpty();
       }
        //push
        public static void add(int data) {
            dq.addLast(data);
        }

        public static int remove() {
            return dq.removeFirst();
        }

        public static int peek() {
            return dq.getFirst();
        }

    }
    public static void main(String args[]) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
                q.remove();
            
        }
    }
}