// //Sorted array to balanced bst..
// public class BST {
   
//         static class Node {
//             int data;
//             Node left;
//             Node right;

//             public Node(int data) {
//                 this.data = data;
//                 this.left = null;
//                 this.right = null;
//             }
//         }

//         public static Node createBST(int arr[], int st, int end) {
//             if(st > end) {
//                 return null;
//             }

//             int mid = (st + end) / 2;
//             Node root = new Node(arr[mid]);

//             root.left = createBST(arr, st, mid-1);
//             root.right = createBST(arr, mid+1, end);

//             return root;
//         }

//         public static void preOrder(Node root) {
//             if(root == null) {
//                 return;
//             }
//             System.out.print(root.data + " ");
//             preOrder(root.left);
//             preOrder(root.right);
//         }

//         public static void main(String args[]) {
//         int arr[] = {3, 5, 6, 8, 10, 11, 12};
//         /*
//             8
//            / \
//           5   11
//          / \   / \
//         3  6  10 12

//         expected output
//         */

//        Node root = createBST(arr, 0, arr.length-1);
//        preOrder(root);
//     }
// }

// import java.util.*;
// public class BST {
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }

//     } 
//      public static void preOrder(Node root) {
//          if(root == null) {
//                 return;
//         }
//         System.out.print(root.data + " ");
//         preOrder(root.left);
//         preOrder(root.right);
//     }

//     public static void getInorder(Node root, ArrayList<Integer> Inorder) {
//         if(root == null) {
//             return;
//         }
//         getInorder(root.left, Inorder);
//         Inorder.add(root.data);
//         getInorder(root.right, Inorder);
//     }

//     public static Node createBST(ArrayList<Integer> Inorder, int st, int end) {
//             if(st > end) {
//                 return null;
//             }

//             int mid = (st + end) / 2;
//             Node root = new Node(Inorder.get(mid));

//             root.left = createBST(Inorder, st, mid-1);
//             root.right = createBST(Inorder, mid+1, end);

//             return root;
//     }

//     public static Node balancedBst(Node root) {
//         //Inorder..
//         ArrayList<Integer> Inorder = new ArrayList<>();
//         getInorder(root, Inorder);

//         //createBst
//         root = createBST(Inorder, 0, Inorder.size()-1);
//         return root;
//  }

//     public static void main(String args[]) {
//     Node root = new Node(8);
//     root.left = new Node(6);
//     root.left.left = new Node(5);
//     root.left.left.left = new Node(3);
//     root.right = new Node(10);
//     root.right.right = new Node(11);
//     root.right.right.right = new Node(12);
//     /*
//            8
//          /   \
//         6    10
//        /      \
//       5       11
//      /         \
//     3          12
// */

//  /*
//             8
//            / \
//           5   11
//          / \   / \
//         3  6  10 12

//         expected output
//  */
//     root =  balancedBst(root);
//    preOrder(root);
// }
// }

// // Size of largets bst..
// public class BST {
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     static class Info {
//         boolean BST;
//         int size;
//         int min; 
//         int max;

//         public Info(boolean BST, int size, int min, int max) {
//             this.BST = BST;
//             this.size = size;
//             this.min = min;
//             this.max = max;
//         }
//     }
   
//     public static int maxBst = 0;
//     public static Info largetBst(Node root) {
//         if(root == null) {
//             return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
//         }

//         Info leftInfo = largetBst(root.left);
//         Info rightInfo = largetBst(root.right);

//         int size = leftInfo.size + rightInfo.size + 1;

//         int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
//         int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

//         if(root.data <= leftInfo.max || root.data >= rightInfo.min) {
//             return new Info(false, size, min, max);
//         }

//         if(leftInfo.BST && rightInfo.BST) {
//             maxBst = Math.max(maxBst, size);
//             return new Info(true, size, min, max); 
//         }

//         return new Info(false, size, min, max);

//     }
//     public static void main(String args[]) {
//         Node root = new Node(50);
//         root.left = new Node(30);
//         root.right = new Node(60);
//         root.left.left = new Node(5);
//         root.left.right = new Node(20);
//         root.right.left = new Node(45);
//         root.right.right = new Node(70);
//         root.right.right.left = new Node(65);
//         root.right.right.right = new Node(80);
//         /* 
//                     50
//                   /    \
//                 30     60
//               /   \   /  \
//              5    20 45   70
//                          /  \
//                         65   80
//         */

//         /*
//                            60
//                          /  \
//                         45   70
//                              /  \
//                             65   80
//             expected output
//         */
//        Info info =  largetBst(root);
//        System.out.println("size of largest bst is : " + maxBst);

//     }
// }


//Merge BSt..
import java.util.*;

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

    public static Node createBST(ArrayList<Integer> finalArr, int st, int end) {
        if (st > end) {
            return null;
        }

        int mid = (st + end) / 2;
        Node root = new Node(finalArr.get(mid));

        root.left = createBST(finalArr, st, mid - 1);
        root.right = createBST(finalArr, mid + 1, end);

        return root;
    }

    public static void getInorder(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }

        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }

    public static Node mergeBst(Node root1, Node root2) {
        // step 1
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);

        //step2
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);

        // step3 merge
        ArrayList<Integer> finalArr = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                finalArr.add(arr1.get(i));
                i++;
            } else {
                finalArr.add(arr2.get(j));
                j++;
            }
        }
        while (i < arr1.size()) {
            finalArr.add(arr1.get(i));
            i++;
        }

        while (j < arr2.size()) {
            finalArr.add(arr2.get(j));
            j++;
        }
        return createBST(finalArr, 0, finalArr.size() - 1);
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String args[]) {
        // BST-1
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);
        /*
            2
          /  \
         1    4

        */

        // BST-2
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);
        /*
            9
          /  \
         3    12

       */

        
        Node root = mergeBst(root1, root2);
        preOrder(root);
    }
}
