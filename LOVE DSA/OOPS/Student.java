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

// public class Student{

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



//------------PARAMETERISED CONSTRUCTOR------------
// import java.util.*;
// // Create Class

// class pen{
//     //Atteributes / Properties
//    public String color;
//    public String type; 


// //  parameterised constructor
//     public pen (String color, String type){
//         System.out.println("Student parameterised constructor");
//         this.color=color;
//         this.type=type;
//     }

// }


// public class Student {
//     public static void main (String args[]){

//     pen pen1= new pen( "blue", "ballpen");
//     //  pen1.color= "blue";   // When we are using default Constructor its mean we can't create any constructor is defaultly called
//     //  pen1.type= "ballpen"; // When we are using default Constructor

//       System.out.println(pen1.color);
//      System.out.println(pen1.type);

//     }
// }


import java.util.*;
class Student{
    // Attribute  // also known as (object)instance variable 

    public int id;
    public int age;
    public String name;
    public int nos;

 //  parameterised constructor
    public Student (int id, int age , String name, int nos){
        System.out.println("Student parameterised constructor");
       this.id=id;
       this.age=age;
       this.name=name;
       this.nos=nos;
        // System.out.println(this.name);
    }

//   Copy Constructor
     public Student (Student A){ //srcobj is the variable 
       System.out.println("Student parameterised constructor");
       this.id=A.id;
       this.age=A.age;
       this.name=A.name;
       this.nos=A.nos;
    }

public static void main (String[] args){
Student A=new Student(1, 12, "Rahul", 3); //student A is the object

Student B= new Student(A); // call copy constructor
 
 System.out.println(B.id);
 System.out.println(B.age);
 System.out.println(B.name);
 System.out.println(B.nos);
 
} 
}
