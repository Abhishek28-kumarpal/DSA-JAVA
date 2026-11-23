import java.util.*;


    abstract class bird{

        abstract void fly();
        abstract void eat();
    }

    class sparrow extends bird{
        void fly(){
            System.out.println("sparrow is flying");
        }
        void eat(){
            System.out.println("sparrow is eating");
        }
    }




    public class Abstraction{

    public static void main (String[] args){
     bird b= new sparrow();
     b.eat();
     b.fly();

    }
}