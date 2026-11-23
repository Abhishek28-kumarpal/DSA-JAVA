import java.util.*;
public class compiletimepolymorphism{
//      int add (int a, int b){
//         return a+b;
//      }
// // After that this is the two time Overloading Overlodaing nd 3 int addition

//         int add(int a, int b, int c){ //1st overload
//             return a+b+c;
//         }
        
//         double add (int a, int b, int c, double d){ //2st overload
//             return a + b + c + d;
//         }
    
    public static void main (String [] args){
    // compiletimepolymorphism c = new compiletimepolymorphism();
    // System.out.println(c.add(2,3));
    // System.out.println(c.add(2,3,4));
    // System.out.println(c.add(2,3,4,5.6));

    // Runtime polymorphism
    circle c= new circle(); // create object
    dodrawingstuff(c);  // Upcasting 

    rect r= new rect();
    r.rect();
    dodrawingstuff(r);

   }

    public static void dodrawingstuff( shape s){
        s.draw();
    }
    
}