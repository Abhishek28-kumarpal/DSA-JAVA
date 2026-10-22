public class motorcycle extends Inheritancetransport{

    public String handbreaksystem;
    public String suspensiontype;

// This is how we write the constructor
    motorcycle(String name, String model, int nooftyers, String handbreaksystem,String suspensiontype){

    super(name,model,nooftyers);
    this.handbreaksystem=handbreaksystem;
    this.suspensiontype=suspensiontype;
    }
    public void wheelii(){
        System.out.println("motorcycle is doing wheeliii"+name);
    }
}