// OBJECT , Class , Constructor or Parameterised constructor

import java.util.*;
// create class
class pen{
    //Atteributes / Properties
   public String color;
   public String type; 

    // function define 
    // public void write(){ 
    //     System.out.println("writing Something");
    // }

    // parameterised constructor
    public pen (String color, String type){
        System.out.println("Student parameterised constructor");
        this.color=color;
        this.type=type;
    }

 
    // public void printColor(){
    //     System.out.println(this.color);
    // }
}





    // public void printColor(){
    //     System.out.println(this.color);
    // }
// }

//  public class Student{

//     public static void main (String args[]) throws Exception{

//      pen pen1= new pen( "blue", "ballpen");
//     //  pen1.color= "blue";  // When we are using default Constructor its mean we can't create any constructor is defaultly called
//     //  pen1.type= "ballpen";  // When we are using default Constructor

//       System.out.println(pen1.color);
//      System.out.println(pen1.type);
//     //  pen1.write();

//     //  pen pen2= new pen();

//     //  pen2.color="black";
//     //  pen2.type= "gel";

    
//     // pen1.printColor();
//     // pen2.printColor();

//     }
// }

