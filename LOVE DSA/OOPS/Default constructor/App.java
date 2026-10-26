// we can create the main function and student class seperately:- app file and student class 
import java.util.*;
public class App{
    public static void main (String[] args){
    // default ctor
    Student A=new Student(); //A is the object of the class of Student class
    A.id=1;
    A.name="abhsihek";
    A.nos= 5;
    System.out.println(A.id);
    System.out.println(A.name);
    System.out.println(A.nos);

    A.bunk();
    A.sleep();
    A.study();
    }
}