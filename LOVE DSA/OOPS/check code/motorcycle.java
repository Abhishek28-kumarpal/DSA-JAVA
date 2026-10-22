public class motorcycle extends Inheritancetransport {

    public String handbreaksystem;
    public String suspensiontype;

    motorcycle(String name, String model, int nooftyers,
               String handbreaksystem, String suspensiontype) {

        super(name, model, nooftyers);

        this.handbreaksystem = handbreaksystem;
        this.suspensiontype = suspensiontype;
    }

    public void wheelie() {
        System.out.println("motorcycle is doing wheelie " + name);
    }
}