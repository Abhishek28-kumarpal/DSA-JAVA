public class Student{
    public int id;
    public int age;
    public String name;
    public int nos;

// CONSTRUCTOR ARE USED FOR THE INSERT THE VALUE INTO ATTRIBUTE
    public Student(){
        System.out.println("STUDENT DEFAULT CONSTRUCTOR CALLED");
    }
// Method / Behaviour
public void study(){
    System.out.println(name + "studiying");
}

public void sleep(){
    System.out.println(name + "sleeping");
}

public void bunk(){
    System.out.println(name + "bunking");

}

} 