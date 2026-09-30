// // import java.util.*;
// // public class PatternPrint{
// //     public static void main (String[] arg){
// //     int n=5;

// //     for(int row=1; row<=n ;row++){
// //         //space

// //       for(int col=1;col<=n-row; col++)
// //       {
// //         System.out.print(" ");
// //       }


// //       //star
// //       for(int col=1; col<=n ;col++ ){
// //         System.out.print("* ");
      

// //       }

// //       // move to next row
// //         System.out.println();
     
// //     }
// // }
// // }

// import java.util.*;
// public class PatternPrint{
//   public static void main (String[] arg){
//     int n=5; 
//     for(int i=1;i<=n;i++){
//       for(int j=5; i<j; j--){ 

//         // * * * * * 
//         // * * * *
//         // * * *
//         // * *
//         // *

//       // for(int j=1; j<i; j++){ 
//         // *
//         // * *
//         // * * *
//         // * * * *
//         // * * * * *
        
        
    
        


//         System.out.print("* ");
//       }
       
//         System.out.println();
      
//     }
//   }
// }

//            SELF TRY

// import java.util.*;
// public class PatternPrint{
//   public static void main(String[]arg ){
//     int n=5;
//     for(int i=1; i<=n ; i++){

      
//       for(int j=5;i<j;j--){
//       System.out.print(" &");
//       }


//       for(int str=1;str<n;str++){
//       for(int stc=1;stc<n-1;stc++){
//         System.out.print("* ");
//       }
      

//     }
//       System.out.println();
//     }
    
//   }
// }
//         *
//       * * *
//     * * * * *
//   * * * * * * *
// * * * * * * * * *

// INSTRUCTOR HELP
// import java.util.*;
// public class PatternPrint{
//   public static void main(String[] arg){
// int n=5;
//     for(int i=1;i<=5;i++){

//       for(int col=1; col<=n-i;col++){

//         System.out.print("  ");
//       }

//       for(int col=1; col<=2*i-1; col++){
//         System.out.print(" *");

//       }

//         System.out.println();
//     }
    
//   }
// }

// * * * * * * *
//   * * * * *
//     * * *
//       *


// import java.util.*;
// public class PatternPrint{
//     public static void main(String[] arg){
// int n=4;
//         for(int i=1; i<=n; i++){
//             // spaces
//             for(int j=0; j<=i-1;j++){
//                 System.out.print("  ");
//             }
//             // stars
//             for(int j=1; j<=2*n-2*i+1;j++){
//             System.out.print(" *");
//             }
//             System.out.println();
//         }
//     }
// }
// * * * * * *
// *         *
// *         *
// * * * * * *
// import java.util.*;
// public class PatternPrint{
//     public static void main(String[] arg){
//       int n=4;
//       for(int i=1; i<=4;i++){
//         for(int j=1;j<=6;j++){

//             if(i==1 || i==n){
//              System.out.print("* ");
//             }
//             else{
//               if(j==1 || j==6){
//                 System.out.print("* ");
//               }
//               else{
//                 System.out.print("  ");
//               }
//             }
          
//         }
//         System.out.println();
//       }
//     }
// }

//  *
//  * *
//  *   *
//  *     *
//  * * * * *
// import java.util.*;
// public class PatternPrint{
//   public static void main (String []arg){
//     int n=5;
//     for (int i=1;i<=n;i++){

//      if(i==1 || i==2 || i==n){

//       for(int j=1;j<=i;j++){
//       System.out.print("* ");
//       }
//      }
//      else{
//       // middle row
//        System.out.print("* "); // first star
      
//        for(int j=1;j<=i-2;j++)
//        {  // spaces  print
//          System.out.print("  "); // spaces print
//        }                        // spaces print
//        System.out.print("* ");
//      }
//       System.out.println();

//   }
//  }
// }

//         *
//       *   *
//     *       *
//   *           *
// * * * * * * * * *

// import java.util.*;
// public class PatternPrint{
//     public static void main (String[] arg){
//         int n=5;
//         // part 1
//         for(int i=1;i<=n;i++){
//             for(int j=i;j<=n-1;j++){
//                 System.out.print("  ");   
//             }
//             //part 2
//             if(i==1 || i==n){
//                 for(int j=1;j<=2*i-1;j++){
//                     System.out.print("* ");
//                 }
//                 }else{
               
//                 System.out.print("* ");
//                 // 2*i-3 sp print
//                 for(int j=1;j<=2*i-3;j++){
//                     System.out.print("  ");
//                 }
//                 System.out.print("* ");
//                 //1*
//                }
//                System.out.println();
//             }     
//         }
//     }






///                         DIAMOND PATTERN IN TWO PARTS 
//         *
//       * * *
//     * * * * *
//   * * * * * * *
//     * * * * * 
//       * * *
//         *


//         *
//       * * *
//     * * * * *
//   * * * * * * *
// import java.util.*;
// public class PatternPrint{
//   public static void main(String[] arg){
// int n=4;
//     for(int i=1;i<=n;i++){

//       for(int j=1; j<=n-i;j++){

//         System.out.print(" ");
//       }

//       for(int j=1; j<=2*i-1; j++){
//         System.out.print("*");

//       }

//         System.out.println();
//     }


// // part 2

// //     * * * * * 
// //       * * *
// //         *

// // int n=4;
//         for(int i=1; i<=n; i++){
//             // spaces
//             if(i==1){
//                 continue;
//             }
//             for(int j=1; j<=i-1;j++){
//                 System.out.print(" ");
//             }
//             // stars
//             for(int j=1; j<=2*n-2*i+1; j++){
//             System.out.print("*");
//             }
//             System.out.println();
//         }

    
//   }
// }

import java.util.*;
public class PatternPrint{
    public static void main (String[] arg){
        int n=5;
        // part 1
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n-1;j++){
                System.out.print("  ");   
            }
            //part 2
            if(i==1 ){
                for(int j=1;j<=2*i-1;j++){
                    System.out.print("* ");
                }
                }else{
               
                System.out.print("* ");
                // 2*i-3 sp print
                for(int j=1;j<=2*i-3;j++){
                    System.out.print("  ");
                }
                System.out.print("* ");
                //1*
               }
               System.out.println();
            }     
        }
    }