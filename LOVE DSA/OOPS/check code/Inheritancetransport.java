public class Inheritancetransport {

    public String name;
    public String model;
    public int nooftyers;

    Inheritancetransport(String name, String model, int nooftyers) {
        this.name = name;
        this.model = model;
        this.nooftyers = nooftyers;
    }

    public void startengine() {
        System.out.println("Engine is starting of " + name + " : " + model);
    }

    public void stopengine() {
        System.out.println("Engine is stop of " + name);
    }
}