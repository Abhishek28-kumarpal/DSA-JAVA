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
// import java.util.*;
// public class TwoDarray{
//     public static void  main(String[] args){

//         int arr[][]={
//             {1,2,3},
//             {5,4,4,23,45,21,34},
//             {0,}
//         };
//         // System.out.println(arr[1][1]);

// // int rowlength=arr.length; //find row length
// // int collength=arr[0].length; // its find the row length
// // like how many column in the row zero....
//         for (int rowindex =0; rowindex < arr.length ;rowindex++){

//             //    finally we can add the arr[rowindex] into the condition
//             for(int colindex=0; colindex < arr[rowindex].length ;colindex++){
//                 System.out.print(arr[rowindex][colindex]+ " ");
//             }
//                 System.out.println();

//         }

//     }
// }


//-------------------Input from the user into the 2D Array---------------------
// import java.util.Scanner;

// public class TwoDarray {
//     static void main() {

//         int arr[][] = new int[3][4];
//         Scanner sc = new Scanner(System.in);

//         //input
//         for(int i=0; i<arr.length; i++) {
//             for(int j=0; j<arr[i].length; j++) {
//                 System.out.println("Provide value for row=" + i + " and column=" + j);
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         //print
//         for(int rowIndex = 0; rowIndex<arr.length; rowIndex++) {
//             for(int colIndex=0; colIndex<arr[rowIndex].length; colIndex++) {
//                 System.out.print(arr[rowIndex][colIndex] + " ");
//             }
//             System.out.println();
//         }
//     }
// }


//---------------------------Sum of 2DArray element--------------------

// import java.util.*;
// public class TwoDarray{
//     public static void main(String[] args){

//         int arr[][]={{1,2,3}, {1,2,3}};
//         int sum=0;

//         for(int i=0; i<arr.length; i++){
//             for(int j=0; j<arr[i].length; j++){
//                 int value=arr[i][j];
//                 sum=sum+value;
//             }
//         }
//         System.out.println(sum);
//     }
// }

//             substration using 2d array


// public class TwoDarray {
//     public static void main(String[] args) {

//         int[][] a = {
//             {10, 20},
//             {30, 40}
//         };

//         int[][] b = {
//             {1, 2},
//             {3, 4}
//         };

//         int[][] result = new int[2][2];

//         for (int i = 0; i < a.length; i++) {
//             for (int j = 0; j < a[i].length; j++) {
//                 result[i][j] = a[i][j] - b[i][j];
//             }
//         }

//         for (int i = 0; i < result.length; i++) {
//             for (int j = 0; j < result[i].length; j++) {
//                 System.out.print(result[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }



//         multiplication using 2d array


// public class TwoDarray {
//     public static void main(String[] args) {

//         int[][] a = {
//             {10, 20},
//             {30, 40}
//         };

//         int[][] b = {
//             {1, 2},
//             {3, 4}
//         };

//         int[][] result = new int[2][2];

//         for (int i = 0; i < a.length; i++) {
//             for (int j = 0; j < a[i].length; j++) {
//                 result[i][j] = a[i][j] * b[i][j];
//             }
//         }

//         for (int i = 0; i < result.length; i++) {
//             for (int j = 0; j < result[i].length; j++) {
//                 System.out.print(result[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }


//    Find Maximum value by the twod array

// public class TwoDarray {
//     public static void main(String[] args) {

//         int arr[][] = {{1, 2, 3}, {21, 20, 19}};

//         int maxValue = arr[0][0];

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 if (arr[i][j] > maxValue) {
//                     // Update max
//                     maxValue = arr[i][j];
//                 }
//             }
//         }

//         System.out.println(maxValue);
//     }
// }


//  Find Minimum value by the twod array

public class TwoDarray {
    public static void main(String[] args) {

        int arr[][] = {{1, 2, 3}, {21, 20, 19}};

        int minValue = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < minValue) {
                    // Update min
                    minValue = arr[i][j];
                }
            }
        }

        System.out.println(minValue);
    }
}