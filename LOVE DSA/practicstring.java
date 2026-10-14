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

import java.util.*;

public class practicstring {
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