public class car extends Inheritancetransport {

    public int noofDoors;
    public String transmissionType;

    car(String name, String model, int nooftyers, int noofDoors,
     String transmissionType) {

        super(name, model, nooftyers);

        this.noofDoors = noofDoors;
        this.transmissionType = transmissionType;
    }

    public void startac() {
        System.out.println("AC started of " + name);
    }
}