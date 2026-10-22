public class main {

    public static void main(String args[]) {

        car c = new car("maruti", "800", 4, 4, "automatic");
        // motorcycle m=new motorcycle()

        c.startengine();
        c.stopengine();
        c.startac();

    System.out.println(" Transmission type:"+ c.transmissionType);
    System.out.println(" Number of doors:"+ c.noofDoors);
    
    }
}