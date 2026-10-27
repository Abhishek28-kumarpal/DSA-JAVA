// COPY CONSTRUCTOR

public class copyctor{

    public int id;
    public int age;
    public String name;
    public int nos;

public copyctor(Student srcobj){
System.out.println("Student Parameterised ctor");

this.id=srcobj.id;
this.age=srcobj.age;
this.name=srcobj.name;
this. nos=srcobj.nos;

}
}