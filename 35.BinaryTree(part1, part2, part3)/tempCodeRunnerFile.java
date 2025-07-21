//Lowest common ancestor
import java.util.*;
public class BinaryTreesB {

     static class Node {
        int data; 
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        
        if(root == null) {
            return false;
        }

        path.add(root);

        if(root.data == n) {
            return true;
        }


        boolean leftPath = getPath(root.left, n, path);
        boolean rightPath = getPath(root.right, n, path);

        if(leftPath || rightpath) {
            return true;
        }

        path.remove(size() - 1);
        return false;
    }

    public static Node Lca(Node root, int n1, int n2) {
    ArrayList<Node> path1 = new ArrayList<>();
    ArrayList<Node> path2 = new ArrayList<>();

    getPath(root, n1, path1);
    getPath(root, n2, path2);

    for(int i = 0; i < path1.size() && i < path2.size(); i++) {
        if(path1.get(i) != path2.get(i)) {
            break;
        }

        Node lca = path1.get(i-1);
        return lca;
    }
    }

    public static void main(String args[]) {
 //         1
//        /  \
//       2    3
//     /  \  /  \
//    4    5 6   7

   Node root = new Node(1);
   root.left = new Node(2);
   root.right = new Node(3);
   root.left.left = new Node(4);
   root.left.right = new Node(5);
   root.right.left = new Node(6);
   root.right.right = new Node(7);

   int n1 = 4;
   int n2 = 5;
   System.out.println(Lca(root, n1, n2));
    }
}