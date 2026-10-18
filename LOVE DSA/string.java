// String  is just  a sequence of the character when a using  multiple character and form a word  like : Abhishek

// import java.util.*;
// public class string{
//     public static void main (String [] args){

//         //1st way to create a string
//         String str1= new String ("paul");  
//         //  2nd way to create string
//         String str2="love";

//         // print the string 
//          System.out.println(str1);  
//          System.out.println(str2);
//     }
// }




//                Access of character
//                   Using of loop  

// import java.util.*;
// public class string{
// public static void  main(String[] args){

// Scanner sc=new Scanner(System.in);
// String str=sc.nextLine();
// sc.close(); // closing the Scanner object after taking input from the user 
// // String str= "LOVE";

// // in the "string" tength parentheses considered as a method.
// //int he "array" we can't use the parenteses because considered as property
// for (int i=0; i < str.length(); i++){
// System.out.print(str.charAt(i));

// }

// }
// }

// //---------------------Comapring strings-----------
// //                    There are three ways
// //                         1. (==)

// //                         Note*
// // Because two Strings are same location into the string pool or heap memory
// import java.util.*;
// public class string{
// public  static void main (String[] args){
// String str="paul";

// String str1="paul";

// if(str==str1){
//     System.out.println("both strings  are equal");
// }else{
//     System.out.println("both  strings are not  equal");

// }

// }
// }

//---------------------------------------- 2. (.equals())--------------------------------

// both strings are not equal because st1 has small (l) in this equal function has csae Sensitive
// import java.util.*;
// public class string{
//     public static void main(String [] args){
//         String str= "PAUL";
//         String str1= "PAUl";

//         if(str.equals(str1)){
//             System.out.println("both strings are equal");
//         }else{
//             System.out.println("both strings are not equal");
//         }
//     }
// }

// -------------------------------------3.(.equalIgnoreCase())---------------
// import java.util.*;
// public class string{
//     public static void main(String[] args){

//         String str="PAul";
//         String str1="PauL";

//         if(str.equalsIgnoreCase(str1)){
//             System.out.println("both strings are equal");
//         }else
//              System.out.println("both strings are not equal");
         
//     }
// }

//-----------------------------(ValueOf) method Use------------------------------------
// import java.util.*;
// public class string{
// public static void main (String[] args){


// // its used to change integer or another datatype to string by the using of valueOf method.
// int num= 23;
// String str = String.valueOf(num);
// System.out.println(str); 

// }
// }



// -------------------------------Split method use----------------------------------------
// import java.util.*;
// public class string{

//     public static void main (){
// String  name = "Babbar";
// // create array character ka array
// char[] crr = name.toCharArray(); 
// // int arr[] arr=

// for(char ch:crr){// for each loop is the for print the value of the array 
//     System.out.println(ch);// ch is for print the value of the character array LIKE: char[] 
//     }

//     String str="my,name,is,paul";
//     String[] word= str.split(",");

//     for(String val: word ){
//         System.out.println(val);
//     }
// }
// }

//-------------------------------Practice Question

//----------------------------Q1 Print each character of the string 

// import java.util.*;
// public class string{
//     public static void main(String[] args){
//         // String str1=new String("paul");
//         String str1="paul";

//         for(int i=0;i<str1.length();i++){
//         System.out.println(str1.charAt(i));
//         }
//     }
// }

// --------------------------Q2 count length of the string without using of length method.

// import java.util.*;
// public class string{
//     public static void main (String[] args){
//          String str1= new String ("paul");
          
//           int count =1;
//         for(char val:str1.toCharArray()){
//             count++;
//          }
//             System.out.println(count);
//     }
// }
// -----------------------------Q3 revrse string---------------------------------------
// import java.util.Scanner;

// public class string {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a string: ");
//         String str = sc.nextLine();

//         String rev = "";

//         for (int i = str.length() - 1; i >= 0; i--) {
//             rev = rev + str.charAt(i);
//         }

//         System.out.println("Reverse: " + rev);

//         sc.close();
//     }
// }

//  ----------------------------Q4 Reverse string-----------------------------------------
// import java.util.*;
// public class string{
//    public static void main (String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a string: ");
//         String str1 = sc.nextLine();
//     //   String str1="paul";  // initialisation

//       for(int i=str1.length()-1;i>=0;i--){  //reverse loop print...
//          char ch=str1.charAt(i);  // use to print the character of the string using charAt() method
//          System.out.print(ch);
//       }
//    }
// }


//---------------------------------Q5 palindrome check----------------------------------

import java.util.*;

public class string {

    static String reverseString(String str) {
        String reverse = " ";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        return reverse;
    }

    static boolean isPalindrome(String str) {
        String reverse = reverseString(str);

        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            char ch2 = reverse.charAt(i);

            if (ch1 != ch2) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "dad";

        System.out.println(reverseString(str));
        System.out.println(isPalindrome(str));
    }
}

