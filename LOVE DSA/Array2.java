// An Array is a Collection of element  of the same datatype stored in continuous memory locations.
// public class Array2{

//     public static void main (String[] args){

    
// int scores[]={29,45,76,46};
// for(int i=0;i<scores.length;i++){
// System.out.println(scores[i]);
// }

//     }
// }
// import java.util.*;
// public class Array2{


//      static void main(){
//         // declaration 
//         // int arr[];
//         // memory allocation
//         // arr=new int [5]; // array length mention
//         // initialization of array and store the element into the array 
        
//         int brr[]= {10,20,30};
//     //  Access the value with the help of the print statement
//         // System.out.println(brr[0]);
//         // System.out.println(brr[1]);
//         // System.out.println(brr[2]);
//         // System.out.println(brr[3]);

//         // print array element with the help of the loop
//         // int n= brr.length;
//         // for(int index=0; index<=n-1;index++){

//         // System.out.println(brr[index]);

//         // }
//         for(int val:brr){
//             System.out.println("["+val+"]"); 
//         }
        

//     }
// }  


//                               For Each loop
// import java.util.*;

// public class Array2{
    
//     public static void main(String[] args){
//         int arr[]={10,20,30};

//         for(int val:arr){
//             System.out.println(val); 
//         }


// // System.out.println("Enter the number ");
// // Scanner sc= new Scanner(System.in);
// //     int num=sc.nextInt();

// // System.out.println(num);
        
//     }
// }

//               Get Array Element from the USER

// import java.util.*;
// public class Array2{

//     public static void main (String[] args){
//    int arr[]=new int[3];
//         Scanner sc=new Scanner(System.in);
     
//      int n=arr.length;
//         for(int i=0;i<=n-1;i++){

//          System.out.println("Enter the Element of index "+i);
//              arr[i]=sc.nextInt();
//         }
//         for(int val:arr){
//             System.out.print(val);
//         }
//     }
// }


//                                     PRACTICE

//  Print array Element without using for each loop
// public class Array2{

//     public static void main (String[]args){
//      int arr[]={12,34,56,77,88};

// int n=arr.length;
// int sum=0;
//      for(int i=0;i<=n-1;i++){
//         System.out.println(arr[i]);
//      }
//     }
// }


//                  Sum of the all Array Element

// public class Array2{

//     public static void main (String[] args){

//      int arr[]={12,12};

//       int n=arr.length;
//       int sum=0; // counter variable using 
//       for(int i=0;i<=n-1;i++){
//         int value=arr[i];
//         sum=sum+value;
        
//      }
//      System.out.println(sum);
//     }
// }

public class Array2{

    public static void main (String[] args){

     int arr[]={12,12};

      int n=arr.length;
      int sum=0; // counter variable using 
      for(int i=0;i<=n-1;i++){
        int value=arr[i];
        sum=sum+value;
        
     }
     System.out.println(sum);
    }
}