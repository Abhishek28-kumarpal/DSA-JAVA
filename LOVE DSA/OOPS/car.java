public class car extends Inheritancetransport{ // car is the extension of the inheritancetransport
// both are the car class properties/ attributes
public int  noofDoors; 
public String transmissionType;


// Why we are mention the parent class attribute like name ,model and nooftyers 
car(String name, String model, int nooftyers, int noofDoors, String transmissionType);{ // create car constructor
super ( name, model, nooftyers);
this.noofDoors=noofDoors;
this.transmissionType= transmissionType;

// super.startengine();
}

public void startac(){
    System.out.println("Ac started of "+ name);
}

}