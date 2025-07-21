// //Backtracking on arrays...
// public class Index{
//     public static void changeArr(int arr[], int i, int val){
//       //Base Case
//       if(i == arr.length){
//         printArr(arr);
//         return;
//       }
//      // recursion
//       arr[i] = val;
//       changeArr(arr, i+1, val+1);
//       arr[i] = arr[i] - 2; //Backtracking...

//     }

//     public static void printArr(int arr[]){
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]){
//         int arr[] = new int[5];
//         changeArr(arr, 0, 1);
//         printArr(arr);
//     }
// }

// //Find subset...
// public class Index{
//   public static void findSubStr(String str, String ans, int i){
//     //Base case
//     if(i == str.length()){
//       if(ans == ""){
//         System.out.println("null");
//       } else{
//         System.out.println(ans);
//       }
//       return;
//     }
//     // yes choice
//     findSubStr(str, ans+str.charAt(i), i+1);
//     // No choice
//     findSubStr(str, ans, i+1);
//   }
//   public static void main(String args[]){
//     String str = "abc";
//     findSubStr(str,"", 0);
//   }
// }

// //Find Permutation... 
// public class Index{
//   public static void findPer(String str, String ans){
//     //Base case
//     if(str.length() == 0){
//       System.out.println(ans);
//       return;
//     }
//     // recursion
//     for(int i = 0; i< str.length(); i++){
//       char curr = str.charAt(i);
//       String newStr = str.substring(0,i) + str.substring(i+1); // in this we removing i the charcater and in substring of 0,i i is non inclusive
//       findPer(newStr, ans+curr);
//     }
//   }
//   public static void main(String args[]){
//     String str = "abc";
//     findPer(str,"");
//   }
// }

// //N queens all Possible solution...
// public class Index{
//   public static boolean isSafe(char board[][], int row , int col){

//     // vertically up 

//     for(int i = row-1; i >= 0; i--){
//       if(board[i][col] == 'Q'){
//       return false;
//       }
//       }

//     // left diagonal up

//     for(int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j-- ){
//       if(board[i][j] == 'Q'){
//       return false;
//       }
//     }

//     // Right diagonal up

//     for(int i = row-1, j = col+1; i >= 0 && j < board.length; i--, j++){
//        if(board[i][j] == 'Q'){
//       return false;
//       }
//     }
//     return true;
//   }

//   public static void nQueen(char board[][], int row){
//     //Base case
//     if(row == board.length){
//          printBoard(board);
//          count++;
//          return;
//     }

//      for(int j=0; j<board.length; j++){
//       if(isSafe(board, row, j)){
//        board[row][j] = 'Q';
//       nQueen(board,row+1); // function call
//       board[row][j] = 'x'; // Backtracking step
//       }
//       }
//   }

//   public static void printBoard(char board[][]){
//     System.out.println("---------chessBoard---------");
//     for(int i = 0; i < board.length; i++){
//       for(int j = 0; j < board.length; j++){
//         System.out.print(board[i][j] + " ");
//       }
//       System.out.println();
//     }
//   }
 
//  public static int count = 0;
//   public static void main(String args[]){
//     int n = 4;
//     char board[][] = new char[n][n];
//     for(int i = 0; i < board.length; i++){
//       for(int j = 0; j < board.length; j++){
//         board[i][j] = 'x';
//       }
//     }
//     nQueen(board, 0);
//     System.out.println(count);
//   }
// }


// //N queens only one solution
// public class Index{
//   public static boolean isSafe(char board[][], int row , int col){

//     // vertically up 

//     for(int i = row-1; i >= 0; i--){
//       if(board[i][col] == 'Q'){
//       return false;
//       }
//       }

//     // left diagonal up

//     for(int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j-- ){
//       if(board[i][j] == 'Q'){
//       return false;
//       }
//     }

//     // Right diagonal up

//     for(int i = row-1, j = col+1; i >= 0 && j < board.length; i--, j++){
//        if(board[i][j] == 'Q'){
//       return false;
//       }
//     }
//     return true;
//   }
//   public static boolean nQueen(char board[][], int row){

//     //Base case

//     if(row == board.length){
//         return true;
//     }

//      for(int j=0; j<board.length; j++){
//       if(isSafe(board, row, j)){
//        board[row][j] = 'Q';
//       if(nQueen(board,row+1)){
//         return true;
//       }
//       board[row][j] = 'x'; // Backtracking step
//       } 
//       }
//       return false;
//   }

//   public static void printBoard(char board[][]){
//     System.out.println("---------chessBoard---------");
//     for(int i = 0; i < board.length; i++){
//       for(int j = 0; j < board.length; j++){
//         System.out.print(board[i][j] + " ");
//       }
//       System.out.println();
//     }
//   }
 
 
//   public static void main(String args[]){
//     int n = 4;
//     char board[][] = new char[n][n];
//     for(int i = 0; i < board.length; i++){
//       for(int j = 0; j < board.length; j++){
//         board[i][j] = 'x';
//       }
//     }
//     if(nQueen(board, 0)){
//     System.out.println("solution exits");
//     printBoard(board);
//     } else{
//       System.out.println("solution not exits");
//     }
 
//   }
// }

// //Grid Way...
// public class Index{
//   public static int gridWay(int i, int j, int n, int m){
//     if(i == n-1 && j == m-1){
//       return 1;
//     } else if (i == n || j == n){
//       return 0;
//     }
//     int w1 = gridWay(i+1, j, n, m);
//     int w2 = gridWay(i, j+1, n, m);
//     return w1 + w2;
//   }
//   public static void main(String args[]){
//     int n = 3, m = 3;
//     System.out.print(gridWay(0, 0, n, m));
//   }
// }

// //sudoku...
// public class Index{
//   public static boolean isSafe(int sudoku[][], int row, int col, int digit){
//     // col
//     for(int i = 0; i < 9; i++){
//       if(sudoku[i][col] == digit){
//         return false;
//       }
//     }
//     // row
//     for(int j = 0; j < 9; j++){
//       if(sudoku[row][j] == digit){
//         return false;
//       }
//     }
//     // grid
//     int sr = (row/3)*3;
//     int sc = (col/3)*3;
//     for(int i = sr; i < sr+3; i++){
//       for(int j = sc; j < sc+3; j++){
//        if(sudoku[i][j] == digit){
//         return false;
//        }
//       }
//     }
//    return true;
//   }
//   public static boolean sudokuSolver(int sudoku[][], int row, int col){
//     if(row == 9){
//       return true;
//     }
//     int nextRow = row, nextCol = col+1;
//     if(col+1 == 9){
//       nextRow = row+1;
//       nextCol = 0;
//     }
//     if(sudoku[row][col] != 0){
//        return sudokuSolver(sudoku, nextRow, nextCol);
//     }
//     for(int digit = 1; digit <= 9; digit++){
//     if(isSafe(sudoku, row, col, digit)){
//       sudoku[row][col] = digit;
//       if(sudokuSolver(sudoku, nextRow, nextCol)){
//         return true;
//       }
//       sudoku[row][col] = 0;
//     }
//   }
//   return false;
//   } 

//   public static void printSudoku(int sudoku[][]){
//     for(int i = 0; i < 9; i++){
//       for(int j = 0; j < 9; j++){
//         System.out.print(sudoku[i][j] + " ");
//       }
//       System.out.println();
//     }
//   }

//   public static void main(String args[]){
//     int sudoku[][] = {
//     {0, 0, 8, 0, 0, 0, 0, 0, 0},
//     {4, 9, 0, 1, 5, 7, 0, 0, 2},
//     {0, 0, 3, 0, 0, 4, 1, 9, 0},
//     {1, 8, 5, 0, 6, 0, 0, 2, 0},
//     {0, 0, 0, 0, 2, 0, 0, 6, 0},
//     {9, 6, 0, 4, 0, 5, 3, 0, 0},
//     {0, 3, 0, 0, 7, 2, 0, 0, 4},
//     {0, 4, 9, 0, 3, 0, 0, 5, 7},
//     {8, 2, 7, 0, 0, 9, 0, 1, 3},
// };
//      if(sudokuSolver(sudoku, 0, 0)){
//       System.out.println("solution exists");
//       printSudoku(sudoku);
//      } else{
//       System.out.print(" solution does not exists");
//      }

//   }
// }

