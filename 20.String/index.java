// import java.util.*;
// public class index{
// public static void printLetters(String str){
//         for(int i=0; i<str.length(); i++){
//             System.out.print(str.charAt(i) + " ");
//         }
//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String name;
//         name  = sc.nextLine();
//         System.out.println(name.length()); 
//         String firstName = "Tanya";
//         String lastName = "Mandloi";
//         String fullName = firstName + " " + lastName;
//         System.out.print(fullName);
//         String str = "Tony Stark";
//         printLetters(str);
//     }
// }

// import java.util.*;
// // palindrome....
// public class index{
//     public static boolean palindrome(String str){
//         int n = str.length();
//         for(int i = 0; i < (str.length())/2; i++){
//             if(str.charAt(i) != str.charAt(n-1-i)){
//                 return false;
//             }
//         }
//     return true;
//     }
//     public static void main(String args[]){
//         String str = "racecar";
//         System.out.print(palindrome(str));
//     }
// }

// import java.util.*;
// // shortest Path....
// public class index{
//     public static float shortestPath(String path){
//         int x1 = 0, y1 = 0;
//         for(int i = 0; i < path.length(); i++){
//             char dir = path.charAt(i);
//             if(dir == 'N'){
//                 y1++;
//             } else if(dir == 'S'){
//                 y1--;
//             } else if(dir == 'E'){
//                 x1++;
//             } else{
//                 x1--;
//             }
//         }

//         int x2 = x1*x1; //x2 means x square
//         int y2 = y1*y1;
//         return (float)Math.sqrt(x2 + y2);
//     }
//     public static void main(String args[]){
//         String path = "WNEENESENNN";
//         System.out.print(shortestPath(path));
//     }
// }

// import java.util.*;
// // String functions compare....
// public class index{
//     public static void main(String args[]){
//         String str1 = "Tony";
//         String str2 = "Tony";
//         String str3 = new String("Tony");
//         if(str1 == str2 ){
//             System.out.println("Strings are equal");
//         } else{
//             System.out.print("Strings are not equal");
//         }
//         // gives not equals as their values are equal..
//         //  if(str1 == str3){
//         //     System.out.println("Strings are equal");
//         // } else{
//         //     System.out.println("Strings are not equal");
//         // }

//         if(str1.equals(str2)){
//          System.out.println("Strings are equal");
//         } else{
//             System.out.print("Strings are not equal");
//         }    
        
//     }
// }

// import java.util.*;
// // substring..
// public class index{
//     public static String substring(String str, int si, int ei){
//     String subStr = "";
//     for(int i = si; i < ei; i++){
//      subStr += str.charAt(i);
//     }
//     return subStr;
// }
//     public static void main(String args[]){
//         String str = "HELLOWORLD";
//         // System.out.print(str.substring(0,5));
//          System.out.print(substring(str,0,5));
//     }
// }

// import java.util.*;
// public class index{
//     public static void main(String args[]){
//         String fruits[] = {"zoya","mango","banana"};
//         String largest = fruits[0];
//         for(int i=0; i<fruits.length; i++){
//             if(largest.compareTo(fruits[i]) < 0){
//                 largest = fruits[i];
//             }
//         }
//         System.out.print(largest);
//     }
// }

// import java.util.*;
// public class index{
//     public static void main(String args[]){
//         StringBuilder sb = new StringBuilder("");
//         for(char ch = 'a'; ch <= 'z'; ch++){
//             sb.append(ch);
//         }
//         System.out.println(sb);
//     }
// }

// import java.util.*;
// // converting each letter of String to upperCase....
// public class index {
//     public static String toUpperCase(String str) {
//         StringBuilder sb = new StringBuilder("");
//         char ch = Character.toUpperCase(str.charAt(0));
//         sb.append(ch);

//         for(int i=1; i<str.length(); i++) {
//           if(str.charAt(i) == ' ' && i < str.length()-1) {
//            sb.append(str.charAt(i));
//            i++;
//            sb.append(Character.toUpperCase(str.charAt(i)));
//           } else {
//            sb.append(str.charAt(i));
//           }
//         }

//         return sb.toString();
//     }
//     public static void main(String args[]) {
//         String str = "hi i am tanya";
//         System.out.print(toUpperCase(str));
//     }
// }

// import java.util.*;
// //compress string....
// public class index{
//     public static String compress(String str){
//         String  newStr = "";
//          for(int i=0; i<str.length(); i++){
//             Integer count = 1;
//             while( i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
//                 count++;
//                 i++;
//             }
            
//            newStr += str.charAt(i);
//            if(count > 1){
//             newStr += count.toString();
//            }
//         }
//         return newStr;
//     }
//     public static void main(String args[]){
//         String str = "aaabbbccdd";
//         System.out.print(compress(str));
//     }
// }

// import java.util.*;
// public class index{
//     public static String compress(String str){
//         StringBuilder sb = new StringBuilder("");
//         for(int i=0; i<str.length(); i++){
//             Integer count = 1;
//             while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
//                 count ++;
//                 i++;
//             }
//              sb.append(str.charAt(i));
//              if(count > 1){
//                 sb.append(count.toString());
//              }
//         }
//         return sb.toString();
//     }
//     public static void main(String args[]){
//         String str = "aaabbbccdd";
//         System.out.print(compress(str));
//     }
// }


//// assignment que1
// import java.util.*;
// public class index{
//     public static void main(String args[]){
//         System.out.print("enter any string");
//         Scanner sc = new Scanner(System.in);
//         String str = sc.next();
//         int count = 0;
//         for(int i=0; i< str.length(); i++){
//          if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
//             count ++;
//         } 
//         }
//         System.out.print(count);
//     }
// }

//// que2
// public class index{
//     public static void main(String args[]) {
//         String str = "ShradhaDidi";
//         String str1 = "ApnaCollege";
//         String str2 = "ShradhaDidi";

//         System.out.println(str.equals(str1) + " " + str.equals(str2));
//     }
// }

////que 3
// public class index {
//     public static void main(String args[]) {
//         String str = "ApnaCollege".replace("l", "");
//         System.out.println(str);
//     }
// }

//que 3
import java.util.*;
public class index {
    public static void main(String args[]) {
        String str1 = "tree";
        String str2 = "thre";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()) {
            char str1CharArr[] = str1.toCharArray();
            char str2CharArr[] = str2.toCharArray();

            Arrays.sort(str1CharArr);
            Arrays.sort(str2CharArr);

            boolean result = Arrays.equals(str1CharArr,str2CharArr);
            if(result) {
                System.out.println("str1 and str2 are anagrams");
            }
            else {
                System.out.println("str1 and str2 are not anagrams");
            }
        }

         else {
                System.out.println("str1 and str2 are not anagrams");
            }
    }
}


