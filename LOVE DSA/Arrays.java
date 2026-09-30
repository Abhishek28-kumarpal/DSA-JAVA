import java.util.*; 
public class Arrays{
    
    public static void main (String[]args){
        // declaration
        // int arr[];

        // // allocation
        // arr=new int [5];

        // //initialisation
        // int brr[] ={1,3,5};

        // System.out.println(brr[0]);
        // System.out.println(brr[1]);
        // System.out.println(brr[2]);

        // int n=brr.length;
        // for(int index=0; index<=n-1;index++){
        //     System.out.println(brr[index]);
        // }
        // for(int val:brr){
        //     System.out.println(val);
        // }
        int brr[];
        int brr[] = new int [5];
        System.out.println("Enter the elements of array ");
        Scanner sc=new Scanner(System.in);

         int n=brr.length;

        for(int i=0;i<=n-1;i++){

        System.out.println("Provide input for index of :"+i);
             brr[i]= sc.nextInt();
        }
        
            System.out.println();
        for(int val:brr){
            System.out.print("["+val+"]"); 
        }
        
        
        // for(int val:brr){
        //     System.out.println(val);
        // }

    }
}