import java.util.*;
class Encapsulation{
    // Attribute  // also known as (object)instance variable 

    private int id;
    private int age;
    private String name;
    private int nos;
    private String gf;

 //  parameterised constructor
    public Encapsulation (int id, int age , String name, int nos, String gf){
        System.out.println("Encapsulation parameterised constructor");
       this.id=id;
       this.age=age;
       this.name=name;
       this.nos=nos;
       this.gf=gf;
        // System.out.println(this.name);
    }

 //   Copy Constructor
     public Encapsulation (Encapsulation A){ //srcobj is the variable 
       System.out.println("Encapsulation parameterised constructor");
       this.id=A.id;
       this.age=A.age;
       this.name=A.name;
       this.nos=A.nos;
    }

    private void gfChatting(){
        System.out.println("Gfchatting is chatting");
    }
}
 public static void main (String[] args){
 Encapsulation A= new Encapsulation(1, 12, "Rahul", 3, "Tina"); //student A is the object

 Encapsulation B= new Encapsulation (A); // call copy constructor
 
 System.out.println(A.id);
 System.out.println(A.age);
 System.out.println(A.name);
 System.out.println(A.nos); 
 System.out.println(A.gf);
 A.gfChatting();
}