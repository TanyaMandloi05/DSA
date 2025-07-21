// public class BST {

//     static class Node{
//         int data;
//         Node left;
//         Node right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//         public static Node insert(Node root, int values) {
//             if(root == null) {
//                 root = new Node(values);
//                 return root;
//             }

//             if(root.data > values) {
//                 root.left = insert(root.left, values);
//             } else {
//                 root.right = insert(root.right, values);
//             }

//                return root;
//         }

     
    

//     public static void inOrder(Node root) {
//         if(root == null) {
//             return;
//         }

//         inOrder(root.left);
//         System.out.println(root.data);
//         inOrder(root.right);
//     }

//     public static void main(String args[]) {
//         int values[] = {5, 1, 4, 3, 2, 7};
//         Node root = null;

//         for(int i=0; i<values.length; i++) {
//            root =  insert(root, values[i]);
//         }

//         inOrder(root);
//     }
// }

// //BST Search..
// public class BST {

//     static class Node{
//         int data;
//         Node left;
//         Node right;
 
//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//         public static Node insert(Node root, int values) {
//             if(root == null) {
//                 root = new Node(values);
//                 return root;
//             }

//             if(root.data > values) {
//                 root.left = insert(root.left, values);
//             } else {
//                 root.right = insert(root.right, values);
//             }

//                return root;
//         }

//         public static boolean searchKey(Node root, int key) {
//             if(root == null) {
//                 return false;
//             } 

//             if(root.data == key) {
//                 return true;
//             }

//             if(root.data > key) {
//                 return searchKey(root.left, key);
//             } else {
//                 return searchKey(root.right, key);
//             }
//         }

//       public static void inOrder(Node root) {
//         if(root == null) {
//             return;
//         }

//         inOrder(root.left);
//         System.out.print(root.data);
//         inOrder(root.right);
//     }

//     public static void main(String args[]) {
//         int values[] = {5, 1, 4, 3, 2, 7};
//         Node root = null;

//         for(int i=0; i<values.length; i++) {
//            root =  insert(root, values[i]);
//         }

//         inOrder(root);
//         int key = 7;
//         System.out.println();
//         System.out.print(searchKey(root, key));
//     }
// }


// //delete a Node...
// public class BST {

//     static class Node{
//         int data;
//         Node left;
//         Node right;
 
//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//         public static Node insert(Node root, int values) {
//             if(root == null) {
//                 root = new Node(values);
//                 return root;
//             }

//             if(root.data > values) {
//                 root.left = insert(root.left, values);
//             } else {
//                 root.right = insert(root.right, values);
//             }

//                return root;
//         }

//         public static Node deleteNode(Node root, int val) {
//             if(root.data > val) {
//                 root.left = deleteNode(root.left, val);
//             } 
            
//             else if(root.data < val) {
//                 root.right = deleteNode(root.right, val);
//             }

//             else {
//                 //case 1 leaf node
//                 if(root.left == null && root.right == null) {
//                     return null;
//                 }

//                 // case 2 single childe..// if had left childe
//                 if(root.right == null) {
//                     return root.left;
//                 }

//                 else if(root.left == null) {
//                     return root.right;
//                 }

//                 // case 3 both childern
//                 Node Is = inOrderSuccesor(root.right);
//                 root.data = Is.data;
//                 root.right = deleteNode(root.right, Is.data);
//             }
//             return root;
//         }

//         public static Node inOrderSuccesor(Node root) {
//             while(root.left != null) {
//                 root = root.left;
//             }

//             return root;
//         }

//         public static void inOrder(Node root) {
//         if(root == null) {
//             return;
//         }

//         inOrder(root.left);
//         System.out.print(root.data + " ");
//         inOrder(root.right);
//     }

//     public static void main(String args[]) {
//         int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
//         Node root = null;

//         for(int i=0; i<values.length; i++) {
//            root =  insert(root, values[i]);
//         }

//         inOrder(root);
//         System.out.println();
//         deleteNode(root, 5);
//         inOrder(root);
       
//     }
// }

// //Print in order..
// import java.util.*;
// public class BST {

//     static class Node{
//         int data;
//         Node left;
//         Node right;
 
//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static Node insert(Node root, int values) {
//             if(root == null) {
//                 root = new Node(values);
//                 return root;
//             }

//             if(root.data > values) {
//                 root.left = insert(root.left, values);
//             } else {
//                 root.right = insert(root.right, values);
//             }

//                return root;
//         }

//         public static void printInRange(Node root, int k1, int k2) {
//             if(root == null) {
//                 return;
//             }

//             if(root.data >= k1 && root.data <= k2) {

//                 printInRange(root.left, k1, k2);
//                 System.out.print(root.data + " ");
//                 printInRange(root.right, k1, k2);

//             } else if(root.data < k1) {
//                 printInRange(root.right, k1, k2);
//             } else {
//                 printInRange(root.left, k1, k2);
//             }
//         }

//         public static void inOrder(Node root) {
//         if(root == null) {
//             return;
//         }

//         inOrder(root.left);
//         System.out.print(root.data + " ");
//         inOrder(root.right);
//     }

//     public static void main(String args[]) {
//        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
//         Node root = null;

//         for(int i=0; i<values.length; i++) {
//            root =  insert(root, values[i]);
//         }

//         inOrder(root);
//         System.out.println(); 
        
//         printInRange(root, 5, 12);
        
//     }
// }


// //Print Root to leaf..
// import java.util.*;
// public class BST {

//     static class Node{
//         int data;
//         Node left;
//         Node right;
 
//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static Node insert(Node root, int values) {
//             if(root == null) {
//                 root = new Node(values);
//                 return root;
//             }

//             if(root.data > values) {
//                 root.left = insert(root.left, values);
//             } else {
//                 root.right = insert(root.right, values);
//             }

//                return root;
//         }

//     public static void printPath(ArrayList<Integer> path) {
//         for(int i = 0; i < path.size(); i++) {
//             System.out.print(path.get(i) + " -> ");
//         }

//         System.out.println("N");
//     }

//     public static void rootToLeaf(Node root, ArrayList<Integer> path) {
//         if(root == null) {
//             return;
//         }
//         path.add(root.data);

//         if(root.left == null && root.right == null) {
//             printPath(path);
//         }

//         rootToLeaf(root.left, path);
//         rootToLeaf(root.right, path);
//         path.remove(path.size() - 1);
//     }

//     public static void main(String args[]) {
//        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
//         Node root = null;

//         for(int i=0; i<values.length; i++) {
//            root =  insert(root, values[i]);
//         }

//         rootToLeaf(root, new ArrayList<>());

//      }
// }


// //Validate BST
//  import java.util.*;
// public class BST {

//     static class Node{
//         int data;
//         Node left;
//         Node right;
 
//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static Node insert(Node root, int values) {
//             if(root == null) {
//                 root = new Node(values);
//                 return root;
//             }

//             if(root.data > values) {
//                 root.left = insert(root.left, values);
//             } else {
//                 root.right = insert(root.right, values);
//             }

//                return root;
//         }

//     public static boolean isValidate(Node root, Node min, Node max) {
//         if(root == null) {
//             return true;
//         }

//         if(min != null && root.data <= min.data) {
//             return false;
//         } 

//         if(max != null && root.data >= max.data) {
//             return false;
//         }

//         return isValidate(root.left, min, root) &&
//                isValidate(root.right, root, max);
//     }

//     public static void main(String args[]) {
//     //    int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
//           int values[] = {1,1,1};
//         Node root = null;

//         for(int i=0; i<values.length; i++) {
//            root =  insert(root, values[i]);
//         }

//         if(isValidate(root, null, null)) {
//             System.out.println("validate bst");
//         }
//         else {
//             System.out.println("inValidate bst");
//         }
//     }
// }

//mirror BST
public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node mirrorBst(Node root) {
        if(root == null) {
            return null;
        }

        Node leftSub = mirrorBst(root.left);
        Node rightSub = mirrorBst(root.right);

        root.left = rightSub;
        root.right = leftSub;

        return root;
    }

     public static void inOrder(Node root) {
        if(root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String args[]) {
        Node root = new Node(8);
         root.left = new Node(5);
         root.left.left = new Node(3);
         root.left.right = new Node(6);
         root.right = new Node(10);
         root.right.right = new Node(11);

        inOrder(root);
        System.out.println();
        mirrorBst(root);
        inOrder(root);
    }
}



