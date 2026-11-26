import java.util.*;


    abstract class bird{
        abstract void fly();
        abstract void eat(); 
    }  

    class sparrow extends bird{ // invoke the bird class all methods in to sparrow 
        void fly(){ //define the methods 
            System.out.println("sparrow is flying");
        }
        void eat(){
            System.out.println("sparrow is eating");
        }
    }

    public class Abstraction{

    public static void main (String[] args){
     bird b= new sparrow();//create the object for the 
     b.eat();
     b.fly();

    }
}