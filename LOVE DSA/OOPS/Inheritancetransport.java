
//                       PARENT CLASS

public class Inhertancetransport{
   public String name;
   public String model;
   public int nooftyers;

//   // default constructor
//     Inhertancetransport (String name, String model, int nooftyers){
//     this.name=name;
//     this.model=model;
//     this.nooftyers=nooftyers;
//    }
   
// create Constructor
   Inhertancetransport (String name, String model, int nooftyers){
    this.name=name;
    this.model=model;
    this.nooftyers=nooftyers;
   }
// Function and methods 
void startengine(){
    System.out.println("Engine is starting  of "+ name+":"+ model);
}

void stopengine(){
    System.out.println("Engine is stop of"+ name);
}

}

