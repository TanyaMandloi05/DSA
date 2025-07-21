// //HashMap Operation..
// import java.util.*;
// public class Classroom {
//     public static void main(String args[]) {
//         //Create
//         HashMap<String, Integer> hm = new HashMap<>();
        
//         hm.put("India" , 150);
//         hm.put("US" , 100);
//         hm.put("Canada", 200);
//         System.out.println(hm);

//         //Get
//         int population = hm.get("India");
//         System.out.println(population);

//         //conatains Key (returns true or false)
//         System.out.println(hm.containsKey("US")); // true
//         System.out.println(hm.containsKey("China")); // false

//         //remove
//         hm.remove("Canada");
//         System.out.println(hm);
//         System.out.println(hm.remove("Bhutan"));

//         //size
//         System.out.println(hm.size());

//         //IsEmpty
//         System.out.println(hm.isEmpty());

//         //Clear
//         hm.clear();
//         System.out.println(hm);
//     }
// }

// //Iteration on hashmap..
// import java.util.*;
// public class Classroom {
//     public static void main(String args[]) {
//         HashMap<String, Integer> hm = new HashMap<>();

//         hm.put("India" , 150);
//         hm.put("chine" , 100);
//         hm.put("Australia", 200);
//         hm.put("Singapore", 50);
//         hm.put("Indonesia", 300);

//         Set<String> Keys = hm.keySet();
//         System.out.println(Keys);

//         for(String k : Keys) {
//             System.out.println("Key = " + k + ", Value = " + hm.get(k));
//         }

//     }
// }


// //HashMap Implementation...
// import java.util.*;
// public class Classroom {
//     static class HashMap<K, V> { //generic
//         private class Node {
//             K key;
//             V value;

//             public Node(K key, V value) {
//                 this.key = key;
//                 this.value = value;
//             }
//         }

//         private int N;
//         private int n;
//         private int size; //n(node size);
//         private LinkedList<Node> bukets[]; //N

//         @SuppressWarnings("unchecked")
//         public HashMap() {
//             this.N = 4;
//             this.bukets = new LinkedList[4];
//             for(int i=0; i<4; i++) {
//                 this.bukets[i] = new LinkedList<>();
//             }
//         }

//        public int hashFunction(K key) {
//             int hc = key.hashCode();
//             return Math.abs(hc) % N;
//         }

//         public int SearchInLL(K key, int bi) {
//             LinkedList<Node> ll = bukets[bi];
//             int di = 0;

//             for(int i=0; i<ll.size(); i++) {
//                 Node node = ll.get(i);
//                 if(node.key == key) {
//                     return di;
//                 }
//                 di++;
//             }
            
//             return -1;
//         }

//         public void put(K key, V value) {
//             int bi = hashFunction(key);
//             int di = SearchInLL(key, bi);

//             if(di != -1) {
//                 Node node = bukets[bi].get(di);
//                 node.value =  value;
//             } else {
//                 bukets[bi].add(new Node(key, value));
//                 n++;
//             }

//             double lambda = (double)n/N;
//             if(lambda > 2.0) {
//                 rehash();
//             }
//         }

//          @SuppressWarnings("unchecked")
//         public void rehash() {
//             LinkedList<Node> oldBuck[] = bukets;
//             bukets = new LinkedList[N * 2];
//             N = 2*N;
//             for(int i=0; i<bukets.length; i++) {
//                 bukets[i] = new LinkedList<>();
//             }

//             //node add in buket
//             for(int i=0; i<oldBuck.length; i++) {
//                 LinkedList<Node> ll = oldBuck[i];
//                 for(int j=0; j<ll.size(); j++) {
//                     Node node = ll.remove();
//                     put(node.key, node.value);
//                 }
//             }
//         }
//         public boolean containsKey(K key) {
//              int bi = hashFunction(key);
//             int di = SearchInLL(key, bi);

//             if(di != -1) {
//                 return true;
//             } else {
//                 return false;
//             }

//         }

//         public V get(K key) {
//              int bi = hashFunction(key);
//             int di = SearchInLL(key, bi);

//             if(di != -1) {
//                 Node node = bukets[bi].get(di);
//                 return node.value;
//             } else {
//                 return null;
//             }

//         }

//         public V remove(K key) {
//             int bi = hashFunction(key);
//             int di = SearchInLL(key, bi);

//             if(di != -1) {
//                 Node node = bukets[bi].remove(di);
//                 n--;
//                 return node.value;
//             } else {
//                 return null;
//             }

//         }

//         public ArrayList<K> keySet() {
//             ArrayList<K> keys = new ArrayList<>();

//             for(int i=0; i<bukets.length; i++) {
//                 LinkedList<Node> ll = bukets[i];

//                 for(Node node: ll) {
//                     keys.add(node.key);
//                 }
//             }

//              return keys;
//         }

//          public boolean isEmpty() {
//             return n == 0;
//         }
//     }

   
//     public static void main(String args[]) {
//         HashMap<String, Integer> hm = new HashMap<>();
//         hm.put("India", 150);
//         hm.put("Gremany", 130);
//         hm.put("Italy", 100);
//         hm.put("Singapore", 170);

//         ArrayList<String> keys = hm.keySet();

//         for(String key : keys) {
//             System.out.println(key);
//         }

//         System.out.println(hm.get("India"));
//         System.out.println(hm.remove("Gremany"));
//         System.out.println(hm.get("Gremany"));
//     }
// }

// //Linked HashMap...
// import java.util.*;
// public class Classroom {
//     public static void main(String args[]) {
//         LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

//         lhm.put("India", 2000);
//         lhm.put("China", 3000);

//         System.out.println(lhm);
//     }
// }

// //Tree Map
// import java.util.*;
// public class Classroom {
//     public static void main(String args[]) {
//         TreeMap<String, Integer> tm = new TreeMap<>();

//         tm.put("India", 2000);
//         tm.put("China", 3000);

//         System.out.println(tm);
//     }
// }

// //Majority element -> grater then n/3 element in array
// import java.util.*;
// public class Classroom {

    
//     public static void main(String args[]) {
//         int nums[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
//         HashMap<Integer, Integer> hm = new HashMap<>();

        
//         for(int i=0; i<nums.length; i++) {
//             if(hm.containsKey(nums[i])) {
//                 hm.put(nums[i], hm.get(nums[i]) + 1);
//             } else {
//                 hm.put(nums[i], 1);
//             }

//         }

//         Set<Integer> keySet = hm.keySet();
//         for(Integer key : keySet) {
//             if(hm.get(key) > (nums.length/3)) {
//                 System.out.println(key);
//             }
//         }
//     }
// }


// //Majority element -> grater then n/3 element in array
// // same code same tc but the number of lines becomes less..
// import java.util.*;
// public class Classroom {
//         public static void main(String args[]) {
//         int nums[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
//         HashMap<Integer, Integer> hm = new HashMap<>();

//           for(int i=0; i<nums.length; i++) {
//             hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
//         }

//         for(Integer key : hm.keySet()) {
//             if(hm.get(key) > (nums.length/3)) {
//                 System.out.println(key);
//             }
//         }
//     }
// }

// // valid anagram
// import java.util.*;
// public class Classroom {

//     public static boolean isAnagram(String s, String t) {
//         if(s.length() != t.length()) {
//             return false;
//         }
//         HashMap<Character, Integer> map = new HashMap<>();

//         for(int i=0; i<s.length(); i++) {
//             map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0) + 1);
//         }

//         for(int i=0; i<t.length(); i++) {
//             char ch = t.charAt(i);
//             if(map.get(ch) != null) {
//                 if(map.get(ch) == 1) {
//                     map.remove(ch);
//                 } else {
//                     map.put(ch, map.get(ch)-1);
//                 } 
//             }

//             else {
//                     return false;
//                 }
//         }

//         return map.isEmpty();
//     }
//     public static void main(String args[]) {
//         String s = "tulip";
//         String t = "lipid";

//         System.out.println(isAnagram(s,t));
//     }
// }

// //HashSet Operations..
// import java.util.*;
// public class Classroom {
//     public static void main(String args[]) {
//         HashSet<Integer> set = new HashSet<>();

//         set.add(2);
//         set.add(1);
//         set.add(3);
//         set.add(5);
//         set.add(1);
//         set.add(2);
//         System.out.println(set);
//         System.out.println(set.size());
        
//         if(set.contains(2)) {
//             System.out.println("Key exists");
//         }

//         set.clear();
//         System.out.println(set.isEmpty());
//     }
// }

// //iteration on HashSet..
// import java.util.*;
// public class Classroom {
//     public static void main(String args[]) {
//         HashSet<String> set = new HashSet<>();
//         set.add("Delhi");
//         set.add("Mumbai");
//         set.add("Indore");
//         set.add("Noida");

//         Iterator it = set.iterator();

//         while(it.hasNext()) {
//             System.out.println(it.next());
//         }
//     }
// }

// //iteration on HashSet..
// import java.util.*;
// public class Classroom {
//     public static void main(String args[]) {
//         HashSet<String> cities = new HashSet<>();
//         cities.add("Delhi");
//         cities.add("Mumbai");
//         cities.add("Indore");
//         cities.add("Noida");

//         for(String city : cities) {
//             System.out.println(city);
//         }
//     }
// }

// //Linked HashSet..
// import java.util.*;
// public class Classroom {
//     public static void main(String args[]) {
//         LinkedHashSet<String> cities = new LinkedHashSet<>();
//         cities.add("Delhi");
//         cities.add("Mumbai");
//         cities.add("Indore");
//         cities.add("Noida");

//         for(String city : cities) {
//             System.out.println(city);
//         }
//     }
// }

// //Tree Set..
// import java.util.*;
// public class Classroom {
//     public static void main(String args[]) {
//         TreeSet<String> cities = new TreeSet<>();
//         cities.add("Delhi");
//         cities.add("Mumbai");
//         cities.add("Indore");
//         cities.add("Noida");

//         for(String city : cities) {
//             System.out.println(city);
//         }
//     }
// }

// //count distinct element..
// import java.util.*;
// public class Classroom {
//     public static void main(String args[]) {
//         int nums[] = {4, 3, 2, 5, 6, 7, 3, 4, 2, 1};
//         HashSet<Integer> set = new HashSet<>();

//         for(int i=0; i<nums.length; i++) {
//             set.add(nums[i]);
//         }

//         System.out.println(set.size());
//     }
// }

// //union and intersection of 2 array..
// import java.util.*;
// public class Classroom {
//     public static void main(String args[]) {
//         int arr1[] = {7, 3, 9};
//         int arr2[] = {6, 3, 9, 2, 9,4};
//         HashSet<Integer> set = new HashSet<>();

//         //union
//         for(int i=0; i<arr1.length; i++) {
//             set.add(arr1[i]);
//         }

//         for(int i=0; i<arr2.length; i++) {
//             set.add(arr2[i]);
//         }

//         System.out.println("total union = " + set.size());

//         Iterator it = set.iterator();
//         while(it.hasNext()) {
//             System.out.print( it.next() + " ");
//         }

//         System.out.println();

//         //Intersection
//         set.clear();
//         for(int i=0; i<arr1.length; i++) {
//             set.add(arr1[i]);
//         }

//         int count = 0;
//         for(int i=0; i<arr2.length; i++) {
//            if(set.contains(arr2[i])) {
//                 System.out.print( arr2[i] + " ");
//                 count++;
//                 set.remove(arr2[i]);
//            }
//         }
//         System.out.println();
//         System.out.println("Intersection  = " + count);
//     }
// }

// //Find itinerary for tickets..
// import java.util.*;
// public class Classroom {
    
//     public static String getStart(HashMap<String, String> tickets) {
//         HashMap<String, String> revMap = new HashMap<>();

//         for(String key : tickets.keySet()) {
//             revMap.put(tickets.get(key), key);
//         }

//         for(String key : tickets.keySet()) {
//             if(!revMap.containsKey(key)) {
//                 return key;
//             }
//         }

//         return null;
//     }
//     public static void main(String args[]) {
//         HashMap<String, String> tickets = new HashMap<>();
//         tickets.put("Chennai", "Bengaluru");
//         tickets.put("Mumbai", "Delhi");
//         tickets.put("Goa" , "Chennai");
//         tickets.put("Delhi", "Goa");

//         String start = getStart(tickets);
//         System.out.print(start);
//         for(String key: tickets.keySet()) {
//             System.out.print(" -> " + tickets.get(start));
//             start = tickets.get(start);
//         }
//     }
// }

// //Largest subArray with sum 0
// import java.util.*;
// public class Classroom {
//     public static void main(String args[]) {
//         int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
//         HashMap<Integer, Integer> map = new HashMap<>();
//         //(sum, idx)

//         int sum = 0;
//         int len = 0;

//         for(int j=0; j<arr.length; j++) {
//             sum += arr[j];
//             if(map.containsKey(sum)) {
//                 len = Math.max(len, j - map.get(sum));
//             } else {
//                 map.put(sum, j);
//             }
//         }

//         System.out.println("largest subarray with sum as 0 => " + len);
//     }
// }

// //count subarray sum equals to k..
// import java.util.*;
// public class Classroom {
//     public static void main(String args[]) {
//         int arr[] = {10, 2, -2, -20, 10};
//         int k = -10;

//         HashMap<Integer, Integer> map = new HashMap<>();
//         //(sum, count)
//         map.put(0, 1);

//         int sum = 0;
//         int ans = 0;

//         for(int j=0; j<arr.length; j++) {
//             sum += arr[j];
//             if(map.containsKey(sum-k)) {
//                 ans += map.get(sum-k);
//             }
//             map.put(sum, map.getOrDefault(sum, 0) + 1);
//         }

//         System.out.println(ans);
//     }
// }

