// print digit of a NUMBER  12345 divided by 10  = 1234
// sam as its print again and again.

//---------------------------Print digits of the number
// import java.util.*;
// public class basicmaths{
//      static void printdigits(int num){
//        while(num!=0){
//         int digits=num%10;

//         System.out.println(digits);
//         num= num/10;
//        }
//      }
//     public static void main (String[] args){
//         int num=12345;
//         printdigits(num);
//     }
// }





//---------------------------Count digits of the number

// import java.util.*;
// public class basicmaths{
//      static int countdigits(int num){
//         int count =0;
//        while(num!=0){
//         int digits=num%10;
//          count ++;
//         // System.out.println(digits);
//         num= num/10;
//        }
//        return count;
//      }
//     public static void main (String[] args){
//         int num=12345;
//         int ans=countdigits(num);
//         System.out.println(ans);
//     }
// } 


//--------------------------Sum of digits of the number

// import java.util.*;
// public class basicmaths{
//      static int sumOfdigits(int num){
//         int sum =0;
//        while(num!=0){
//         int digits=num%10;

//          sum=sum+digits;
//         // System.out.println(digits);
//         num= num/10;
//        }
//        return sum;
//      }
//     public static void main (String[] args){
//         int num=12345;
//         int sum=sumOfdigits(num);
//         System.out.println(sum);
//     }
// } 

// -------------------------Sum of digits of the number

// import java.util.*;
// public class basicmaths{
// static int  reverseOfnumber(int num){

// int revnum=0;
// while(num!=0){

//     int digits =num% 10; // create the decimal value
//     // reversenum calculated

//     revnum= revnum*10 + digits;

//     num= num/10; // remove the decimal value.
// }
// return revnum;
// }

//     public static void main (String[] args){
//      int num= 12345;
//      int revnum= reverseOfnumber(num);
//      System.out.println(revnum);

//     }
// }



//------------------------------------palindrome number
// import java.util.*;
// public class basicmaths {
//     static int reverseOfnumber(int num) {
//         int revnum = 0;

//         while (num != 0) {
//             int digits = num % 10;
//             revnum = revnum * 10 + digits;
//             num = num / 10;
//         }
//         return revnum;
//      }
//      static boolean palindromenumm(int num){
//         int original = num;
//         int reversedNum = reverseOfnumber(num);

//         if (original == reversedNum){
//             System.out.println("It is a palindrome");
//             return true;
//         } else{
//             System.out.println("It is not a palindrome");
//             return false;
//         }
//     }
     
//     public static void main(String[] args){
//         boolean ans = palindromenumm(1221);
//         System.out.println(ans);
//     }
// }



//-------------------------Print Prime number--Time Complexity N^2----------------- 

// import java.util.*;
// public class basicmaths{


//     static boolean isprime(int num){
//         for(int i=2;i<num-1;i++){ // complexity n^2
//             if(num%i==0){
//          System.out.println("numer is not prime");
//                 return false;

//             }
//         }
//         // when the num is not divided by any number between 2 to num value like:- num=7 
//         // then return true
        
         
//          System.out.println("numer is prime");
//         return true;

//     }
//     public static void main(String[] args){
//          System.out.println("Enter the number");
//          Scanner sc= new Scanner(System.in);
//          int num=sc.nextInt();
//          System.out.println(isprime(num));
        
//     }
// }


//--------------Print Prime number--Time Complexityis  √2 ----------------- 

// import java.util.*;
// public class basicmaths{

//     static boolean isprime(int num){
//         for(int i=2;i*i<=num;i++){ // less complexity logic....
//             if(num%i==0){
//          System.out.println("numer is not prime");
//                 return false;

//             }
//         }
//         // when the num is not divided by any number between 2 to num value like:- num=7 
//         // then return true
        
         
//         System.out.println("numer is prime");
//         return true;

//     }
//     public static void main(String[] args){
//          System.out.println("Enter the number");
//          Scanner sc= new Scanner(System.in);
//          int num=sc.nextInt();
//          System.out.println(isprime(num));
        
//     }
// }



//-----------------------------------REVERSE A NUMBER--------------------------
import java.util.*;
public class basicmaths{
 static int reverseOfnumber(int num) {
        int revnum = 0;

        while (num != 0) {
            int digits = num % 10;
            revnum = revnum * 10 + digits;
            num = num / 10;
        }
        return revnum;
     }
     public static void main (String[] args){
        System.out.println("Enter the number");
        Scanner sc=new Scanner (System.in);
            int num= sc.nextInt();

            System.out.println(reverseOfnumber(num));

        }
     }
