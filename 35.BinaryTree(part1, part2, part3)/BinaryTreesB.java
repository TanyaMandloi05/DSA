// // Build Tree PreOrder...
// import java.util.*;
// public class BinaryTreesB {
//     static class Node {
//         int data;
//         Node left; 
//         Node right;

//          Node(int data) {
//             this.data = data;
//             this.left = left;
//             this.right = right;
//         }
//     }
//         static class BinaryTree {
//             static int idx = -1;
//             public static Node buildTree(int nodes[]) {
//                 idx++;
//                 if(nodes[idx] == -1) {
//                     return null;
//                 }

//                 Node newNode = new Node(nodes[idx]);
//                 newNode.left = buildTree(nodes);
//                 newNode.right = buildTree(nodes);

//                 return newNode;
//             }

//             public static void PreOrder(Node root) {
//             if(root == null) {
//                 // System.out.print("-1" + " ");
//                 return;
//             }
//             System.out.print(root.data + " ");
//             PreOrder(root.left);
//             PreOrder(root.right);
//         }
        
//         //inorder..
//         public static void inOrder(Node root) {
//             if(root == null) {
//                 return;
//             }

//             inOrder(root.left);
//             System.out.print(root.data + " ");
//             inOrder(root.right);
//         }

//         //Post order...
//         public static void postOrder(Node root) {
//             if(root == null) {
//                 return;
//             }
//             postOrder(root.left);
//             postOrder(root.right);
//             System.out.print(root.data + " ");
//         }

//         //Level order...
//         public static void levelOrder(Node root) {
//             if(root == null) {
//                 return;
//             }
//             Queue<Node> q = new LinkedList<>();
//             q.add(root);
//             q.add(null);

//             while(!q.isEmpty()) {
//                  Node currNode = q.remove();
//                  if(currNode == null) {
//                     System.out.println();
//                   if(q.isEmpty()) {
//                     break;
//                  } else {
//                     q.add(null);
//                  } 
//                  }
//                  else {
//                     System.out.print(currNode.data + " ");
//                   if(currNode.left != null) {
//                     q.add(currNode.left);
//                  } if(currNode.right != null) {
//                     q.add(currNode.right);
//                  }
//             } 
//         }
//         }
// }

       
//     public static void main(String args[]) {
//         int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
//         BinaryTree tree = new BinaryTree();
//         Node root = tree.buildTree(nodes);
//         // System.out.println(root.data);
//         // tree.PreOrder(root);
//         // tree.inOrder(root);
//         // tree.postOrder(root);
//         tree.levelOrder(root);
//     }
// }

// //height of a tree
// import java.util.*;
// public class BinaryTreesB {
//     static class Node {
//         int data;
//         Node left, right;

//         public Node(int data) {
//             this.data = data;
//             this.left = left;
//             this.right = right;
//         }
//     }

//     public static int height(Node root) {
//         if(root == null) {
//             return 0;
//         }

//         int lh = height(root.left);
//         int rh = height(root.right);
//         return Math.max(lh, rh) + 1;
//     }

//     public static void main(String args[]) {
// //         1
// //        /  \
// //       2    3
// //     /  \  /  \
// //    4    5 6   7

//    Node root = new Node(1);
//    root.left = new Node(2);
//    root.right = new Node(3);
//    root.left.left = new Node(4);
//    root.left.right = new Node(5);
//    root.right.left = new Node(6);
//    root.right.right = new Node(7);
//    System.out.print(height(root));

//     }
// }

////count of tree
// import java.util.*;
// public class BinaryTreesB {
//     static class Node {
//         int data;
//         Node left, right;

//         public Node(int data) {
//             this.data = data;
//             this.left = left;
//             this.right = right;
//         }
//     }

//     public static int count(Node root) {
//         if(root == null) {
//             return 0;
//         }

//         int lc = count(root.left);
//         int rc = count(root.right);
//         return lc + rc + 1;
//     }

//     public static void main(String args[]) {
// //         1
// //        /  \
// //       2    3
// //     /  \  /  \
// //    4    5 6   7

//    Node root = new Node(1);
//    root.left = new Node(2);
//    root.right = new Node(3);
//    root.left.left = new Node(4);
//    root.left.right = new Node(5);
//    root.right.left = new Node(6);
//    root.right.right = new Node(7);
//    System.out.print(count(root));

//     }
// }

// //sum of nodes
// import java.util.*;
// public class BinaryTreesB {
//     static class Node {
//         int data;
//         Node left, right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static int sum(Node root) {
//         if(root == null) {
//             return 0;
//         }

//         int lsum = sum(root.left);
//         int rsum = sum(root.right);
//         return lsum + rsum + root.data;
//     }

//     public static void main(String args[]) {
// //         1
// //        /  \
// //       2    3
// //     /  \  /  \
// //    4    5 6   7

//    Node root = new Node(1);
//    root.left = new Node(2);
//    root.right = new Node(3);
//    root.left.left = new Node(4);
//    root.left.right = new Node(5);
//    root.right.left = new Node(6);
//    root.right.right = new Node(7);
//    System.out.print(sum(root));

//     }
// }

//// diameter of tree Approch1 tc -> O(n^2)
// import java.util.*;
// public class BinaryTreesB {
//      static class Node {
//         int data;
//         Node left, right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }
//      public static int height(Node root) {
//         if(root == null) {
//             return 0;
//         }

//         int lh = height(root.left);
//         int rh = height(root.right);
//         return Math.max(lh, rh) + 1;
//     }

//     public static int diameter(Node root) {
//         if(root == null) {
//             return 0;
//         }

//         int lDiam = diameter(root.left);
//         int lh = height(root.left);
//         int rDiam = diameter(root.right);
//         int rh = height(root.right);

//         int selfDiam = lh + rh +1;

//         return Math.max(selfDiam , Math.max(lDiam, rDiam));
//     }

// public static void main(String args[]) {
// //          1
// //        /  \
// //       2    3
// //     /  \  /  \
// //    4    5 6   7

//    Node root = new Node(1);
//    root.left = new Node(2);
//    root.right = new Node(3);
//    root.left.left = new Node(4);
//    root.left.right = new Node(5);
//    root.right.left = new Node(6);
//    root.right.right = new Node(7);
//    System.out.print(diameter(root));
// }
// }

// // diameter of tree Approch2 tc -> O(n)
// import java.util.*;
// public class BinaryTreesB {
//      static class Node {
//         int data;
//         Node left, right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }
    
//     static class Info {
//         int diam; 
//         int ht;

//         public Info (int diam, int ht) {
//             this.diam = diam;
//             this.ht = ht;
//         }
//     }

//     public static Info diameter(Node root) {
//         if(root == null) {
//             return new Info(0,0);
//         }

//         Info leftInfo = diameter(root.left);
//         Info rightInfo = diameter(root.right);

//         int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
//         int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

//         return new Info(diam, ht);
//     }

// public static void main(String args[]) {
// //          1
// //        /  \
// //       2    3
// //     /  \  /  \
// //    4    5 6   7

//    Node root = new Node(1);
//    root.left = new Node(2);
//    root.right = new Node(3);
//    root.left.left = new Node(4);
//    root.left.right = new Node(5);
//    root.right.left = new Node(6);
//    root.right.right = new Node(7);
//    System.out.print(diameter(root).diam);
// }
// }


// //Subtree of another tree
// import java.util.*;
// public class BinaryTreesB {

//     static class Node {
//         int data;
//         Node left, right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static boolean isIdentical(Node node, Node subroot) {
//         if(node == null && subroot == null) {
//             return true;

//         } else if(node == null || subroot == null || node.data != subroot.data) {
//             return false;
//         } 

//         if(!isIdentical(node.left, subroot.left)) {
//             return false;
//         } 

//         if(!isIdentical(node.right, subroot.right)) {
//             return false;
//         }

//         return true;
//     }

//     public static boolean isSubtree(Node root, Node subroot) {
//         if(root == null) {
//             return false;
//         }

//         if(root.data == subroot.data) {
//             if(isIdentical(root, subroot)) {
//                 return true;
//             }
//         }

//         return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
//     }
//     public static void main(String args[]) {

// //          1   
// //        /  \
// //       2    3
// //     /  \  /  \
// //    4    5 6   7

//    Node root = new Node(1);
//    root.left = new Node(2);
//    root.right = new Node(2);
//    root.left.left = new Node(8);
//    root.left.right = new Node(9);
//    root.right.left = new Node(4);
//    root.right.right = new Node(5);
   

// //       2    
// //     /  \  
// //    4    5

//    Node subroot = new Node(2);
//    subroot.left = new Node(4);
//    subroot.right = new Node(5);

//    System.out.println(isSubtree(root, subroot));

//     }
// }


// //Top view of tree..
// import java.util.*;
// public class BinaryTreesB {

//     static class Node {
//         int data; 
//         Node left, right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     static class Info {
//         int hd;
//         Node node;

//         public Info( Node node ,int hd) {
//             this.node = node;
//             this.hd = hd;
//         }
//     }

//     public static void topView(Node root) {

//         Queue<Info> q = new LinkedList<>();
//         HashMap<Integer, Node> map = new HashMap<>();

//         int min = 0, max = 0;
//         q.add(new Info(root, 0));
//         q.add(null);

//         while(!q.isEmpty()) {
//             Info curr = q.remove();
//             if(curr == null) {
//                 if(q.isEmpty()) {
//                     break;
//                 } else {
//                     q.add(null);
//                 }
//             }
//             else {
//                 if(!map.containsKey(curr.hd)) {
//                     map.put(curr.hd, curr.node);
//                 }

//                 if(curr.node.left != null) {
//                     q.add(new Info(curr.node.left, curr.hd-1));
//                     min = Math.min(min, curr.hd-1);
//                 }

//                 if(curr.node.right != null) {
//                     q.add(new Info(curr.node.right, curr.hd+1));
//                     max = Math.max(max, curr.hd+1);
//                 }
//             }
//         }

//         for(int i = min; i <=max ; i++) {
//             System.out.print(map.get(i).data + " ");
//         }
//         System.out.println();
        
//     } 

//     public static void main(String args[]) {
// //          1
// //        /  \
// //       2    3
// //     /  \  /  \
// //    4    5 6   7

//    Node root = new Node(1);
//    root.left = new Node(2);
//    root.right = new Node(3);
//    root.left.left = new Node(4);
//    root.left.right = new Node(5);
//    root.right.left = new Node(6);
//    root.right.right = new Node(7);
//    topView(root);   

//     }
// }

// //kth level
// import java.util.*;
// public class BinaryTreesB {
//      static class Node {
//         int data; 
//         Node left, right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static void kLevel(Node root, int k, int level) {
//         if(root == null) {
//             return;
//         } 

//         if(k == level) {
//             System.out.print(root.data + " ");
//             return;
//         }

//         kLevel(root.left, k, level+1);
//         kLevel(root.right, k, level+1);

//     }
//     public static void main(String args[]) {
// //          1
// //        /  \
// //       2    3
// //     /  \  /  \
// //    4    5 6   7

//    Node root = new Node(1);
//    root.left = new Node(2);
//    root.right = new Node(3);
//    root.left.left = new Node(4);
//    root.left.right = new Node(5);
//    root.right.left = new Node(6);
//    root.right.right = new Node(7);
//    int k = 2;

//    kLevel(root, k, 1);

//     }
// }


// //Lowest common ancestor
// import java.util.*;
// public class BinaryTreesB {

//      static class Node {
//         int data; 
//         Node left, right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        
//         if(root == null) {
//             return false;
//         }

//         path.add(root);

//         if(root.data == n) {
//             return true;
//         }


//         boolean leftPath = getPath(root.left, n, path);
//         boolean rightPath = getPath(root.right, n, path);

//         if(leftPath || rightPath) {
//             return true;
//         }

//         path.remove(path.size() - 1);
//         return false;
//     }

//     public static Node Lca(Node root, int n1, int n2) {
//     ArrayList<Node> path1 = new ArrayList<>();
//     ArrayList<Node> path2 = new ArrayList<>();

//     getPath(root, n1, path1);
//     getPath(root, n2, path2);

//     int i = 0;
//     for(; i < path1.size() && i < path2.size(); i++) {
//         if(path1.get(i) != path2.get(i)) {
//             break;
//         }
//      }
//      Node lca = path1.get(i-1);
//       return lca;
//     }

//     public static void main(String args[]) {
//  //         1
// //        /  \
// //       2    3
// //     /  \  /  \
// //    4    5 6   7

//    Node root = new Node(1);
//    root.left = new Node(2);
//    root.right = new Node(3);
//    root.left.left = new Node(4);
//    root.left.right = new Node(5);
//    root.right.left = new Node(6);
//    root.right.right = new Node(7);

//    int n1 = 4;
//    int n2 = 7;
//    System.out.println(Lca(root, n1, n2).data);
//     }
// }


// //Lowest common ancestor(Approch 2)
// import java.util.*;
// public class BinaryTreesB {

//      static class Node {
//         int data; 
//         Node left, right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

// public static Node lca(Node root, int n1, int n2) {

//     if(root == null || root.data == n1 || root.data == n2) {
//         return root;
//     }

//     Node leftLca = lca(root.left, n1, n2);
//     Node rightLca = lca(root.right, n1, n2);

//     if(rightLca == null) {
//         return leftLca;
//     }

//     if(leftLca == null) {
//         return rightLca;
//     }

//     return root;

// }
   
//   public static void main(String args[]) {
//  //         1
// //        /  \
// //       2    3
// //     /  \  /  \
// //    4    5 6   7

//    Node root = new Node(1);
//    root.left = new Node(2);
//    root.right = new Node(3);
//    root.left.left = new Node(4);
//    root.left.right = new Node(5);
//    root.right.left = new Node(6);
//    root.right.right = new Node(7);

//    int n1 = 4;
//    int n2 = 5;
//    System.out.println(lca(root, n1, n2).data);
//     }
// }


// //minimum distance between two nodes..
// import java.util.*;
// public class BinaryTreesB {

//      static class Node {
//         int data; 
//         Node left, right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

// public static Node lca(Node root, int n1, int n2) {

//     if(root == null || root.data == n1 || root.data == n2) {
//         return root;
//     }

//     Node leftLca = lca(root.left, n1, n2);
//     Node rightLca = lca(root.right, n1, n2);

//     if(rightLca == null) {
//         return leftLca;
//     }

//     if(leftLca == null) {
//         return rightLca;
//     }

//     return root;

// }

// public static int lcaDis(Node root, int n) {
    
//     if(root == null) {
//         return -1;
//     }

//     if(root.data == n) {
//         return 0;
//     }

//     int leftDis = lcaDis(root.left, n);
//     int rightDis = lcaDis(root.right, n);

//     if(leftDis == -1 && rightDis == -1) {
//         return -1;

//     } else if(leftDis == -1) {
//         return rightDis + 1;

//     } else {
//         return leftDis + 1;
//     }
// }

// public static int minDis(Node root, int n1, int n2) {
//     Node lca = lca(root, n1, n2);
//     int dist1 = lcaDis(lca, n1);
//     int dist2 = lcaDis(lca, n2);

//     return dist1 + dist2;
// }
   
// public static void main(String args[]) {
//  //         1
// //        /  \
// //       2    3
// //     /  \  /  \
// //    4    5 6   7

//    Node root = new Node(1);
//    root.left = new Node(2);
//    root.right = new Node(3);
//    root.left.left = new Node(4);
//    root.left.right = new Node(5);
//    root.right.left = new Node(6);
//    root.right.right = new Node(7);

//    int n1 = 4;
//    int n2 = 5;
//    System.out.println(minDis(root, n1, n2));
//     }
// }

// //minimum distance between two nodes..
// import java.util.*;
// public class BinaryTreesB {

//      static class Node {
//         int data; 
//         Node left, right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

// public static int kAncestor(Node root, int k, int n) {
//     if(root == null) {
//         return -1;
//     }

//     if(root.data == n) {
//         return 0;
//     }

//     int leftDis = kAncestor(root.left, k, n);
//     int rightDis = kAncestor(root.right, k, n);

//     if(leftDis == -1 && rightDis == -1) {
//         return -1;
//     }

//     int max = Math.max(leftDis, rightDis);

//     if(k == max+1) {
//         System.out.print(root.data);
//     }

//     return max+1;
// }
 
// public static void main(String args[]) {
//  //         1
// //        /  \
// //       2    3
// //     /  \  /  \
// //    4    5 6   7

//    Node root = new Node(1);
//    root.left = new Node(2);
//    root.right = new Node(3);
//    root.left.left = new Node(4);
//    root.left.right = new Node(5);
//    root.right.left = new Node(6);
//    root.right.right = new Node(7);

//    int k = 1;
//    int n = 5;
//    kAncestor(root, k , n);
//     }
// }


import java.util.*;
public class BinaryTreesB {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int transforSum(Node root) {
        if(root == null) {
            return 0;
        }

        int leftChild = transforSum(root.left);
        int rightChild = transforSum(root.right);

        int data = root.data;

        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;

        root.data = leftChild + newLeft + rightChild + newRight;
        return data;

    }

    public static void preOrder (Node root) {
        if(root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String args[]) {
/*
         1
       /  \
      2    3
    /  \  /  \
   4    5 6   7

 */

   Node root = new Node(1);
   root.left = new Node(2);
   root.right = new Node(3);
   root.left.left = new Node(4);
   root.left.right = new Node(5);
   root.right.left = new Node(6);
   root.right.right = new Node(7);

    transforSum(root);
    preOrder(root);

    }
}