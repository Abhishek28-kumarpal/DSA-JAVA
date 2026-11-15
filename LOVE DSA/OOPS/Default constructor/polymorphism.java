public class polymorphism{

     int add (int a, int b){
        return a+b;
     }

// After that this is the two time Overloading Overlodaing nd 3 int addition

        int add(int a, int b, int c){ //1st overload
            return a+b+c;
        }
        double add (int a, int b, int c, double d){ //2st overload
            return a + b + c + d;
        }
    
    public static void main (String [] args){
    polymorphism c = new polymorphism();
    System.out.println(c.add(2,3));
    System.out.println(c.add(2,3,4));
    System.out.println(c.add(2,3,4,5.6));

    }
}