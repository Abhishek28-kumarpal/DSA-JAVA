// An Array is a Collection of element  of the same datatype stored in continuous memory locations.
// public class Array2{

//     public static void main (String[] args){

    
// int scores[]={29,45,76,46};
// for(int i=0;i<scores.length;i++){
// System.out.println(scores[i]);
// }

//     }
// }
import java.util.*;
public class Array2{


     static void main(){
        // declaration 
        int arr[];
        // memory allocation
        arr=new int [5]; // array length mention
        // initialization of array and store the element into the array 
        
        int brr[]= {10,20,30};
    //  Access the value with the help of the print statement
        // System.out.println(brr[0]);
        // System.out.println(brr[1]);
        // System.out.println(brr[2]);
        // System.out.println(brr[3]);

        // print array element with the help of the loop
        int n= brr.length;
        for(int index=0; index<=n-1;index++){

        System.out.println(brr[index]);

        }
        for(int val:brr){
            System.out.print("["+val+"]"); 
        }
        

    }
}  