// constructing segment tree..
// import java.util.*;
// public class Classroom {
//     static int tree[];

//     public static void init(int n) {
//         tree = new int[n*4];
//     }

//     public static int buildbst(int arr[], int i, int start, int end) {
//         if(start == end) {
//             tree[i] = arr[start];
//             return tree[i];
//         }

//         int mid = (start + end)/2;
//         buildbst(arr, 2*i+1, start, mid);
//         buildbst(arr, 2*i+2, mid+1, end);
//         tree[i] = tree[2*i+1] + tree[2*i+2];
//         return tree[i];
//     }
//     public static void main(String args[]) {
//         int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
//         int n = arr.length;

//         init(n);
//         buildbst(arr, 0, 0, n-1);

//         for(int i=0; i<tree.length; i++) {
//             System.out.print(tree[i] + " ");
//         }
//     }
// }


// //queries on segment tree
// import java.util.*;
// public class Classroom {
//     static int tree[];

//     public static void init(int n) {
//         tree = new int[n*4];
//     }

//     public static int buildbst(int arr[], int i, int start, int end) {
//         if(start == end) {
//             tree[i] = arr[start];
//             return tree[i];
//         }

//         int mid = (start + end)/2;
//         buildbst(arr, 2*i+1, start, mid);
//         buildbst(arr, 2*i+2, mid+1, end);
//         tree[i] = tree[2*i+1] + tree[2*i+2];
//         return tree[i];
//     }

//     public static int getSumUtil(int i, int si, int sj, int qi, int qj) {
//         if(qi >= sj || qj <= si) { // non overlap
//             return 0;
//         } else if(si >= qi && sj <= qj) { // complete overlape
//             return tree[i];
//         } else {
//             int mid = (si + sj)/2; //partial overlape
//             int left = getSumUtil( 2*i+1, si, mid, qi, qj);
//             int right = getSumUtil( 2*i+2, mid+1, sj, qi, qj);
//             return left + right;
//         }

//     }
    
//     public static int getSum(int arr[], int qi, int qj) {
//         int n = arr.length;
//         return getSumUtil( 0, 0, n-1, qi, qj);
//     }

//     public static void main(String args[]) {
//         int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
//         int n = arr.length;

//         init(n);
//         buildbst(arr, 0, 0, n-1);
//         System.out.print(getSum(arr, 2, 5)); //ans 18
//     }
// }

// //updation on segment tree
// import java.util.*;
// public class Classroom {
//     static int tree[];

//     public static void init(int n) {
//         tree = new int[n*4];
//     }

//     public static int buildbst(int arr[], int i, int start, int end) {
//         if(start == end) {
//             tree[i] = arr[start];
//             return tree[i];
//         }

//         int mid = (start + end)/2;
//         buildbst(arr, 2*i+1, start, mid);
//         buildbst(arr, 2*i+2, mid+1, end);
//         tree[i] = tree[2*i+1] + tree[2*i+2];
//         return tree[i];
//     }

//     public static int getSumUtil(int i, int si, int sj, int qi, int qj) {
//         if(qi >= sj || qj <= si) { // non overlap
//             return 0;
//         } else if(si >= qi && sj <= qj) { // complete overlape
//             return tree[i];
//         } else {
//             int mid = (si + sj)/2; //partial overlape
//             int left = getSumUtil( 2*i+1, si, mid, qi, qj);
//             int right = getSumUtil( 2*i+2, mid+1, sj, qi, qj);
//             return left + right;
//         }

//     }
    
//     public static int getSum(int arr[], int qi, int qj) {
//         int n = arr.length;
//         return getSumUtil( 0, 0, n-1, qi, qj);
//     }

//     public static void updateUtil(int i, int si, int sj, int idx, int diff) {
//         if(idx > sj || idx < si) {
//             return;
//         }

//         tree[i] += diff;
//         if(sj != si) {
//             int mid = (si+sj)/2;
//             updateUtil(2*i+1, si, mid, idx, diff);
//             updateUtil(2*i+2, mid+1, sj, idx, diff);
//         }
//     }

//     public static void update(int arr[], int idx, int val) {
//         int n = arr.length;
//         int diff = val - arr[idx];
//         arr[idx] = val;
//         updateUtil(0, 0, n-1, idx, diff);
//     }

//     public static void main(String args[]) {
//         int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
//         int n = arr.length;

//         init(n);
//         buildbst(arr, 0, 0, n-1);
//         System.out.println(getSum(arr, 2, 5)); //ans 18
//         update(arr, 2, 2);
//         System.out.print(getSum(arr, 2, 5));
//     }
// }

//maximum for subarray && update the element at idx..
import java.util.*;
public class Classroom {
    static int tree[];
    public static void init(int n) {
        tree = new int[4*n];
    }

    // constructing segment tree with maximum element in each node
    public static int buildSt(int arr[], int i, int si, int sj) {
        if(si == sj) {
            tree[i] = arr[si];
            return tree[i];
        }

        int mid = (si+sj)/2;
        buildSt(arr, 2*i+1, si, mid);
        buildSt(arr, 2*i+2, mid+1, sj);
        tree[i] = Math.max(tree[2*i+1], tree[2*i+2]);
        return tree[i];
    }

    //maximum of subarray sum
    public static int getMax(int arr[], int qi, int qj) {
        int n = arr.length;
        return getmaxUtil(0, 0, n-1, qi, qj);
    }

    public static int getmaxUtil(int i, int si, int sj, int qi, int qj) {
        if(si > qj || sj < qi) {
            return Integer.MIN_VALUE;
        } else if(si >= qi && sj <= qj) {
            return tree[i];
        } else {
            int mid = (si + sj)/2;
            int left = getmaxUtil(2*i+1, si, mid, qi, qj);
            int right = getmaxUtil(2*i+2, mid+1, sj, qi, qj);
            return Math.max(left, right);
        }
    }

    //update 
    public static void update(int arr[], int idx, int val) {
        arr[idx] = val;
        int n = arr.length;
        updateUtil(0, 0, n-1, idx, val);
    }

    public static void updateUtil(int i, int si, int sj, int idx, int val) {
        if(idx < si || idx > sj) {
            return;
        }

        if(si == sj) {
            tree[i] = val;
        }

        tree[i] = Math.max(tree[i], val);

        if(si != sj) {
            int mid = (si+sj)/2;
            updateUtil(2*i+1, si, mid, idx, val);
            updateUtil(2*i+2, mid+1, sj, idx, val);
        }
    }

    public static void main(String args[]) {
        int arr[] = {6, 8, -1, 2, 17, 1, 3, 2, 4};
        int n = arr.length;

        init(n);
        buildSt(arr, 0, 0, n-1);

        // for(int i=0; i<tree.length; i++) {
        //     System.out.print(tree[i] + " ");
        // }

        System.out.println(getMax(arr, 2, 5));
        update(arr, 2, 20);
        System.out.println(getMax(arr, 2, 5));
    }
}