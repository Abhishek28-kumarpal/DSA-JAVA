

// // function defination
// static void print2katable(){
//     for(int i=1;i<=10;i++){
//         System.out.println(2*i);
//     }
// }
// //example 2nd

// static void sum1(int a, int b){ // received data is called parameters 
    
//     System.out.println("sum"+" "+(a+b));
// }

// // main function
// static void main(){
//     // // call all the function
//     // System.out.println("hii");
   
//     print2katable(); // function call
//     System.out.println("byy");
//     sum1( 3, 5);  // pass argument

// }

// //_________________VOID vs NON-VOID Return Type_______


// //   VOID RETURN TYPE 

// static void sum(int a,int b){
// int sum=a+b;
// System.out.println("sum:"+" "+ sum);
// return; 
  
// }

// static void main(){
// sum(2,3);
// //   System.out.println("sum:"+ " "+ result);
// }


// //__________________NON-VOID RETURN TYPE------------



// // static void main(){    
// //     int result=sum(3,6);
// //     System.out.println(result);
// // }

// // static int sum(int a,int b){
// //     int sum=a+b;
// //     return sum;
// // }

// // //_______________CALL BY VALUE___________________

// // static void solve(int num){
// //     System.out.println("inside solve 2 :"+num);
// //     num=num*10;
// //     System.out.println("inside solve 3 :"+num);
// // }

// // static void main(){
// //     int num=5;
// //     System.out.println("inside 1 :"+ num);
// //     solve(num); //num is passing call by value it is acopy of num
// //     System.out.println("inside main 4 :"+num);
// // }

// //-------------------CALL BY VALUE-----------------------



// // public class methods {
// //     static int add(int a, int b){
// //         int ans= a+b;
// //         return ans;
// //     }
// //     static int add (int a, int b, int c){
// //         int sum= a+b+c;
// //         return sum;
// //     }

// //     public static void main (String[] args){
// //         int ans1= add(1,2);
// //         int ans2= add(1,2,3);
// //         System.out.println(ans1);
// //         System.out.println(ans2);
// //     }
// // }

// // public class methods{
// //      static void intu(int num){
// //         num=num*10;
// //         System.out.println(num);
// //     }


// // public static void main (String[] args){
// //     int num=5;

// //      // its argument passing but passing the copy of num which has value of 5
// //      //AND IS CALLED CALL BY VALUE BUT VALUE IS COPYED VALUE  
// //      // THAT IS HOW CALL BY VALUE IS WORKS
// //     intu(num);
// //         System.out.println(num);
// // }
// // }

// //Q1 CREATE A METHOD PRINTWELCOMEMESSAGE() THAT PRINTS A GREETING

// // public class methods{

// //     static void greeting(){
// //         System.out.println("Good Morning");
// //     }
// //     public static void main (String[] args){
// //      greeting();
// //     }
// // }

// // Q2  CREATE A METHOD ADD(INT A, INT B) THAT RETURN SUM.
// // public class methods{

// //     static int add(int a, int b){
// //         // return a+b;
// //         int sum=a+b;
// //         return sum;
// //     }
// //     public static void main(String[]args){
// //        int result = add(3, 5);
// //        System.out.println(result);
// //     }
// // }

// // // Q2  CREATE A METHOD ISEVEN(INT NUMBER) THAT RETURNS TRUE IF NUMBER IS EVEN.
// //  public class methods{
// //     static boolean iseven(int number){
        
// //        boolean even= number%2==0;
// //        return even;
        
// //     }
// //     public static void main (String[] args){
// //       boolean eve = iseven(3);
// //       System.out.println("its even ? "+eve);
// //     }
// //  } 