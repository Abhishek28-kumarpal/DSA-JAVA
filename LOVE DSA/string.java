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


//--------------------NOT PUSH-----------------------

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

// import java.util.*;
// public class string{
// public static void main (String[] args){


// // its used to change integer or another datatype to string by the using of valueOf method.
// int num= 23;
// String str = String.valueOf(num);
// System.out.println(num+1); // 



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

//              Practice Question
 
// Q1    Print Each Character of the String.

// import java.util.*;
// public class string{

//     static void printString(String str){
//         for (int i=0;i<str.length();i++){
//             char ch=str.charAt(i);
//             System.out.println(ch);
//         }
//     }


//     public static void main (String[] args){
//       String str="Paul";
//       printString(str);
//     }
// }

// Q2 Count length of String without length()?
// import java.util.*;
// public class string{

//     public static countstrings(String str){
        
//     }

//     public static void main(String[] args){
//         String str= "paul";

//         countstrings(str);
//     }
// }


// Q3 Count Vowels in a String
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a string: ");
//         String str = sc.nextLine().toLowerCase();

//         int count = 0;

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);

//             if (ch == 'a' || ch == 'e' || ch == 'i' ||
//                 ch == 'o' || ch == 'u') {
//                 count++;
//             }
//         }

//         System.out.println("Total vowels = " + count);

//         sc.close();
//     }
// }

//Q3 Reverse a String

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Reversed string = " + reverse);

        sc.close();
    }
}