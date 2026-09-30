// import java.util.*;
// public class prime{
//     public static void main (String[]arr){

// System.out.print("Enter the number: ");
// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
//         for( int num=2;num<=n;num++){

//             int i;
//             for(i=2;i<num;i++){
//                 if(num%i==0){
//                     break;
//                 }
//             }
//             if(i==num){
//                 System.out.println(num);
//             }
//         }

//     }
// }


// IN  JAVA INITIALIZE THE VARIABLE AGAIN AND AGAIN

// import java.util.*;
// public class prime{
//     public static void main (String [] arg){
//         int isprime = 32; // initial value
//         isprime = 23; // updated value
//         System.out.println(isprime);
//     }
// }

// when we check the specific number is prime or not  then use this code 
// import java.util.*;
// public class prime{
//     public static void main (String[] arg){

//         // int n;
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();

//         boolean isprime=true;
//         for(int i=2;i<n;i++){

//             if(n%i==0){

//                 isprime=false;

//             }

//             // System.out.println(i);
//         }
//         if(isprime){ // agar isprime true hai to primt kar do block of code ko
//           System.out.println("n's input is prime number");
//         }else{
//             System.out.println("n's input is not number");
//         }
//     }
// }


//                       ALL THE PRIME OR NOT PRIME NUMBER
// import java.util.*;
// public class prime{
//     public static void main (String[] arg){
//         System.out.println("Enter the number");
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();




//         for(int j=2;j<=n;j++){

//         boolean isprime=true;

//         for(int i=2;i<j;i++){

//             if(j%i==0){
//                 isprime=false;
//                 break;
//             }
        
//         }
//         if(isprime){
//             System.out.println("prime number" + j);

//         }else{
//             System.out.println("not prime"+j);
//         }
        
//         }
//     }
// }


//                            SUM OF ALL PRIME NUMBER 

// import java.util.*;
// public class prime{
//     public static void main (String[] arg){
//         System.out.println("Enter the number");
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();



//            int sum =0;
//         for(int j=2;j<=n;j++){

//         boolean isprime=true;

//         for(int i=2;i<j;i++){

//             if(j%i==0){
//                 isprime=false;
//                 break;
//             }
        
//         }
//         if(isprime){
//             System.out.println("prime number" + j);
//             sum=sum+j; // add only prime number
//         }else{
//             System.out.println("not prime"+j);
//         }
        
//         }
//         System.out.println(" the all prime number sum is: "+sum);
//     }
// }

//                         COUNT ALL THE PRIME NUMBER


// import java.util.*;
// public class prime{
//     public static void main (String[] arg){
//         System.out.println("Enter the number");
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();



//            int sum =0; // FOR COUNTER VARIABLE 
//         for(int j=2;j<=n;j++){

//          boolean isprime=true;

//          for(int i=2;i<j;i++){

//             if(j%i==0){
//                 isprime=false;
//                 break;
//             }
        
//          }
//          if(isprime){
//             System.out.println("prime number" + j);
//             // sum=sum+j; // add only prime number
//              sum=sum ; // add only prime number
//          }else{
//             System.out.println("not prime"+j);
//          }
//          if(isprime){ // for COUNT VARIABLE
//             sum++;  // FOR COUNTER VARIABLE
//          }
        
//         }
//          System.out.println(" the all prime number sum is: "+sum);
//     }
// }

//                  SUM OF ALL N NUMBER

// import java.util.*;
// public class prime{
//    public static void main (String[] arg){

//       System.out.println("Enter the number");
//       Scanner sc=new Scanner(System.in);
//       int n=sc.nextInt();
      
//       int sum=0;
//       for(int i=1;i<=n;i++){
//          // System.out.println();
//          sum=sum+i;
//       }
//        System.out.println(sum);
     
//    }
// }

//                        Multiplication Table

// import java.util.*;
// public class prime {
//    public static void main(String[] arg){

//       Scanner sc=new Scanner(System.in);
//       int mult= sc.nextInt();
//       for(int i=1;i<=10; i++){

//          System.out.println(mult*i);
//       }
//    }
// }

//                       Factorial of 2

// import java.util.*;
// public class prime{
//    public static void main(String[] arg){
//       Scanner sc= new Scanner(System.in);
//       int fact=sc.nextInt();
       
//       int factor=0;
//       // for(int i=1; i<=10; i++ ){
          
//       //     if(2%i==0){
//       //        System.out.println(factor);
//       //     }
//       //     factor++;

//       // }
//       for(int i=1;i<=fact;i++){
//          factor=factor*i;
//       }
//          System.out.println(factor);

   
//    }
// }


// import java.util.*;
// public class prime{
// public static void main(String[] arg){

// int  fact=1;
// System.out.println("Enter the number");
// Scanner sc=new Scanner(System.in);
// int n= sc.nextInt();

// for(int i=1; i<=n;i++){
//    fact=fact*i;
// }
// System.out.println(fact);

// }

// // }

// import java.util.*;
// public class prime{
//    public static void main (String[] arg){
//       int sum=0;
//       int n=5;
//       for(int i=1;i<=n;i++){
//       sum= sum+i;
//       // sum++; 1+2+3+4+5
//       }
//       System.out.println(sum);
//    }
// }



///                    1 to N Number print
// import java.util.*;
// public class prime{
//    public static void main(String[] arg){
//       Scanner sc=new Scanner(System.in);
//       int n=sc.nextInt();
//       for(int i=1;i<=n;i++){
//       System.out.println(i);
//       }
//    }
// }


//                     N to 1 number print

// import java.util.*;
// public class prime{    
// public static void main (String[] arg){
//    System.out.println("Enter the number");
//    Scanner sc=new Scanner(System.in);
//    int n=sc.nextInt();

//   for(int i=n;1<=i;--i){         
//     System.out.println(i);
//   }
// }
// }


//                 COUNT number of Digit 

//    import java.util.*;
// public class prime {
//     public static void main(String[] args) {
//         System.out.print("Enter a number: ");
//         int count=0;
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();

//         while(n>0){  // condition
//          n=n/10;
//          count++; // updation
//         }
//         System.out.println(count);

//     }
// }


//                    9 8 7 6 5 4 3 2 1
//                      8 7 6 5 4 3 2
//                        7 6 5 4 3
//                          6 5 4
//                            5
import java.util.*;
public class prime{
   public static void main (String[] arg){
     
     for(int i=1;i<=5;i++){

      for(int j=1;j<=i;j++){
         System.out.print(i);
      }
         System.out.println();
      
     }

   }
}