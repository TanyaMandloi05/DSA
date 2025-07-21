// public class Oops {
//     public static void main(String args[]){
//         Pen p1 = new Pen();
//         p1.changeColor("blue");
//         System.out.println(p1.color);

//         p1.tip = 5;
//         System.out.println(p1.tip);

//         BankAccount myAccount = new BankAccount();
//         myAccount.username = "Tanya";
//         System.out.println(myAccount.username);
//         myAccount.setPassword("abcd");
//       }
//     }

//     class BankAccount{
//         public String username;
//         private String password;
//         public void setPassword(String pwd){
//             password = pwd;
//             System.out.println(password);

//         }
//     }

// class Pen{
//     String color;
//     int tip;

//     void changeColor(String newColor){
//         color = newColor;
//     }

//     void changeTip(int newTip){
//         tip = newTip;
//     }
// }


// // getters and setters....
// public class Oops{
//     public static void main(String args[]){
//     Pen p = new Pen();
//     p.setColor("blue");
//     System.out.println(p.getColor());
//     p.setTip(5);
//     System.out.println(p.getTip());
//     }
// }

// class Pen{
//      private  String color;
//      private  int tip;
     
//      String getColor(){
//         return this.color;
//      }

//      void setColor(String color){
//         this.color = color;
//      }
     
//      int getTip(){
//         return this.tip;
//      }

//      void setTip(int tip){
//         this.tip = tip;
//      }
// }

// //constructor....
// public class Oops{
//     public static void main(String args[]){
//     Student s1 = new Student();
//     Student s2 = new Student("tanya");
//     System.out.println(s2.name);
//     Student s3 = new Student(123);
//     System.out.println(s3.roll);
//     }
// }

// class Student{
//     String name;
//     int roll;
    
//     //Non Paramterized constructor...
//     Student(){
//         System.out.println("this is constructor s1");
//     }
    
//     //Paramterized constructor....
//     Student(String name){
//         // System.out.println("constructor was called....");
//         this.name = name;
//     }

//     Student(int roll){
//         this.roll = roll;
//     }
// }

// //copy constructor

// public class Oops{
//     public static void main(String args[]){
//     Student s1 = new Student();
//     s1.name = "tanya";
//     s1.roll = 123;
//     s1.marks[0] = 100;
//     s1.marks[1] = 80;
//     s1.marks[2] = 100;
//     s1.password = "abcd";
//     Student s2 = new Student(s1);
//     System.out.println(s2.name);
//     System.out.println(s2.roll);
//      s2.password = "xyz";
//      System.out.println(s2.password);
//     s1.marks[2] = 90;
//     for(int i=0; i<3; i++){
//         System.out.println(s2.marks[i]);
//     }
//     }
// }

// class Student{
//     String name;
//     int roll;
//     int marks[];
//     String password;

//     //shallow copy constructor....
//     Student(Student s1){
//         this.name = s1.name;
//         this.roll = s1.roll;
//         marks = new int[3];
//         this.marks = s1.marks;
//     }

//     // //Deep copy constructor....
//     // Student(Student s1){
//     //      this.name = s1.name;
//     //     this.roll = s1.roll;
//     //     marks = new int[3];
//     //     for(int i=0; i<3; i++){
//     //         this.marks[i] = s1.marks[i];
//     //     }
//     // }

//     // Student(){
//     //     marks = new int[3];
//     // }
// }

// // Inheritence....
// public class Oops{
//     public static void main(String args[]){
//     //Fish shark = new Fish();
//     //shark.eat();
//     dog jennu = new dog();
//     jennu.eat();
//     jennu.legs = 4;
//     System.out.println(jennu.legs);
//     }
// }

// // Base class..
// class Animal{
//     String color;
    
//     void eat(){
//         System.out.println("eats..");
//     }

//     void breadth(){
//         System.out.println(" breadth..");
//     }
// }

// //Derived class...
// class Fish extends Animal{
//     int fins;
//     void swim(){
//     System.out.println("swims in water");
//     }
// }


// //Multilevel inheritance....
// class Mammal extends Animal{
//     int legs;
// }

// class dog extends Mammal{
//  int breed;
// }

//hierarchial inheritance....

// public class Oops{
//     public static void main(String args[]){
//     Mammal human = new Mammal();
//     human.eat();

//     }
// }

// class Animal{
//     String color;
    
//     void eat(){
//         System.out.println("eats");
//     }

//     void breadth(){
//         System.out.println(" breadth..");
//     }
// }

// class Mammal extends Animal{
//     void walks(){
//         System.out.println("walks");
//     }
// }


// class Birds extends Animal{
//     void fly(){
//         System.out.println("fly in the sky");
//     }
// }


// class fish extends Animal{
//     void swim(){
//         System.out.println("swims in water");
//     }
// }

// //Polymorphism (method overloding) compile time polymorphism....
// public class Oops{
//     public static void main(String args[]){
//     Calculator calc = new Calculator();
//     System.out.println(calc.sum(1,2));
//     System.out.println(calc.sum((float)1.2,(float)3.2));
//     System.out.println(calc.sum(1,2,3));
//     }
// }

// class Calculator{
//     int sum(int a, int b){
//         return a+b;
//     }

//     float sum(float a, float b){
//         return a+b;
//     }

//     int sum(int a, int b, int c){
//         return a+b+c;
//     }
// }

// //Polymorphism (method overriding) run time polymorphism....
// public class Oops{
//     public static void main(String args[]){
//         Deer d = new Deer();
//         d.eat();
//     }
// }

// class Animal{
//    void eat(){
//         System.out.println("eats evrthing");
//     }
// }

// class Deer extends Animal{
//     void eat(){
//         System.out.println("eat grass");
//     }
// }

// // Abstraction
// public class Oops{
//     public static void main(String args[]){
//     Horse h = new Horse();
//     h.eats();
//     h.walk();
//     System.out.println(h.color);
//     }
// }

// abstract class Animal{
//     String color;
//     Animal(){
//        color = "brown";
//     }
//     void eats(){
//         System.out.println("it eats");
//     }

//     abstract void walk();
// }

// class Horse extends Animal{
//     String color = "dark brown";
//     void walk(){
//         System.out.println(" it walk on 4 legs");
//     }
// }

// // how Constructor called  in abstraction..

// public class Oops{
//     public static void main(String args[]){
//     Mustang myHorse = new Mustang();
//     }
// }

// abstract class Animal{
//     Animal(){
//         System.out.println("animal constructore is called");
//     }
// }

// class Horse extends Animal{
//     Horse(){
//         System.out.println("Horse constructor was called");
//     }
// }

// class Mustang extends Horse{
//     Mustang(){
//         System.out.println("Mustang constructor was called");
//     }
// }

// //interfaces in java..
// public class Oops{
//     public static void main(String args[]){
//      Queen Q = new Queen();
//      Q.moves();
//     }
// }

// interface ChessPlayer{
//     void moves();
// }

// class Queen implements ChessPlayer{
//     public void moves(){
//         System.out.println("up, down, left, right and diagonal in 4 directions");
//     }
// }

// class Rook implements ChessPlayer{
//     public void moves(){
//         System.out.println("up, down, left, right");
//     }
// }

// class King implements ChessPlayer{
//     public void moves(){
//         System.out.println("up, down, left, right and diagonal in one step");
//     }
// }

// // Static keyword....
// public class Oops{
//     public static void main(String args[]){
//      Student s1 = new Student();
//      s1.SchoolName = "jvm";
//      Student s2 = new Student();
//      System.out.println(s2.SchoolName);
//     }
// }

// class Student{
//     String name;
//     int roll;
//     static String SchoolName;

//     Static int returnPercentage(int math, int phy, int chem){
//         return (math + phy + chem) / 3;
//     }
     
//     void setName(String name){
//         this.name = name;
//     } 

//     String getName(){
//         return this.name;
//     }

// }

// // Super keyword
// public class Oops{
//     public static void main(String args[]){
//     Horse h = new Horse();
//     System.out.println(h.color);
//     }
// }

// class Animal{
//     String color;
//     Animal(){
//         System.out.println("Animal constructore is called");
//     }
// } 

// class Horse extends Animal{
    
//     Horse(){
//         super.color = "brown";
//         System.out.println("horse constructore is called");
//     }
// }

// // Practice que 1.)

// public class Oops{
//     public static void main(String args[]){
//     Complex c = new Complex();
//     int sumResult = c.sum(10, 10);
//      System.out.println("Sum: " + sumResult);
// }
// }
// class Complex{
//     int sum(int a, int b){
//         return a+b;
//     }
//     int difference(int a, int b){
//         return a-b;
//     }
//     int mul(int a, int b){
//         return a*b;
//     }
// }