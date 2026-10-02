// // this is the classs name all are into the class
// public class methodsrepractice{

// // function defination / declaration 
// static void print2katable(){
//      for (int i=1; i<=10; i++){
//         int ans= 2*i;
//         System.out.println(ans);
//      }
//   System.out.println("hiii");
// }   

// // This is the main function 
//     public static void main (){
//      print2katable(); // invoke the function or call 
//     }
// }

// ------------------// parameters vs no parameters 

// //pass the parameters
// public class methodsrepractice{

// static void printsum(int x, int y){ // pass parameters this lines is known as method signature 
//     // for(int i=1; i<=10; i++){
//     //     int ans =2*i;
//     //     System.out.println(ans);
//     // }
//     System.out.println(a+b);
// }
// public static void main (){

// printsum(2,4); // pass arguments 
// }
// }


//------------------------- void or no return type 

// public class methodsrepractice{ 

//     static int add(int x, int y){
//         int sum=x+y;
//         return sum;
//         // System.out.println(x+y);
//     }


// public static void main (){
//  int result=add(23,45);
//   System.out.println(result);
// }
// }


//---------------------------CALL BY VALUE 
// public class methodsrepractice{

//     static void solve(int num) 
    
//     {
//         System.out.println (num);
//         num=num*10;

//         System.out.println(num);
//     }

//     public static void main (String[] args){
//     int num=5;
//     System.out.println(num);
//     solve(5);
//     System.out.println(num);

//     }
// }



// Q1


// public class methodsrepractice{

// static void printwelcomemessage(String name){
// System.out.println("good morning "+" "+name);
// }

// public static void main (){
// printwelcomemessage("Abhishek");
// }
// }


// Q2


// public class methodsrepractice{

//     static int sum(int a, int b){
//     int sum=a+b;
//     return sum;
//     }

// public static void main (String [] args){
//     int sum=sum(2,6);
//     System.out.println(sum);
// }
// }

// Q3


// public class methodsrepractice{

//     static String iseven(int a){
//         if(a%2==0){
//             return "true";
//         }else{
//             return "false";
//         }
//     }

//     public static void main (String[] args){
//         String iseven=iseven(2);
//         System.out.println(iseven);
//     }
// }



// Q4

// public class methodsrepractice{

//   static int getmaximum(int a, int b){
//     if(a<b){
//         System.out.print("the greater number is :- ");
//         return b;
//     }else{
//         System.out.print("the greater number is :- ");
//         return a;
//     }
//   }
//     public static void main (String [] args){
//       int getmaximum=getmaximum(3,9);
//       System.out.println(getmaximum);
//     }
// }

// Q5

// public class methodsrepractice{

// static int calculatepercentage(int obtain,int Total){
//    int percentage=obtain*100/Total;
//    return percentage;
// }

//     public static void  main (String[] args){
//        int calculate=calculatepercentage(450,500);
//        System.out.println(calculate);
//     }
// }

// Q6


// public class methodsrepractice{

//   static void display(int a, String b){
    
//     System.out.println("this is the 2 parameter DETECTED");
    
//   }
//   static void display(int a, String b, int c )
//   {
//     System.out.println("this is the 3 parameter DETECTED");
//   }
//     public static void main (String[] args){
//       display(23, "abhisheek",34);

    
//     }
// }



// Q7

// public class methodsrepractice{

// static void updatevalue(int x){
//    x=20;
// }

//     public static void main (String[] args){
//         int x=10;
//    System.out.println(x); // 

//      updatevalue(x);
//    System.out.println(x); // the value is still original


//     }
// }