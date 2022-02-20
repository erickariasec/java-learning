package poo.v046.abstractclasses;

public class Student extends Person{

    private final String career;

    public Student(String name, String career){
        super(name);
        this.career=career;
    }

    public String getDescription(){ // Overriding getDescription Method of Parent Class (Person)
        return "This student is studying " + career + " career";
    }
}
