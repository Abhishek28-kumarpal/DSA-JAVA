// // 2d Array is the nothing it is just an Array of Arrays 
// import java.util.*;
// public class TwoDarray {
//     public static void main(String[] args) {
//     // declaration
//     // int arr[][];
//     // allocation
//     // arr= new int [2][4];
//     //initialization
//         int arr[][] = {
//             {10, 20, 30},
//             {40, 50, 60},
//             {70, 80, 90}
//         };

//         System.out.println(arr[0][0]); // 10
//         System.out.println(arr[1][2]); // 60
//         System.out.println(arr[2][1]); // 80 
//     }
// }


// import java.util.*;
// public class TwoDarray{
//     public static void  main(String[] args){

//         int arr[][]={
//             {1,2,3},
//             {5,4,7},
//             {0,6,9}
//         };
//         // System.out.println(arr[1][1]);

// // int rowlength=arr.length; //find row length
// // int collength=arr[0].length; // its find the row length
// // like how many column in the row zero....
//         for (int rowindex =0; rowindex < arr.length ;rowindex++){
//             for(int colindex=0; colindex < arr[0].length ;colindex++){
//                 System.out.print(arr[rowindex][colindex]+ " ");
//             }
//                 System.out.println();

//         }

//     }
// }


//--------------------------Jagged array--------------------------
import java.util.*;
public class TwoDarray{
    public static void  main(String[] args){

        int arr[][]={
            {1,2,3},
            {5,4,4,7,4,3,},
            {0,}
        };
        // System.out.println(arr[1][1]);

// int rowlength=arr.length; //find row length
// int collength=arr[0].length; // its find the row length
// like how many column in the row zero....
        for (int rowindex =0; rowindex < arr.length ;rowindex++){
            for(int colindex=0; colindex < arr[rowindex].length ;colindex++){
                System.out.print(arr[rowindex][colindex]+ " ");
            }
                System.out.println();

        }

    }
}