package JavaBasics.S13_UseOf_this_Java.WordThis;

public class WordThis {
    public static void main(String[] args) {
        Person person = new Person("Brian", "Lester");
        System.out.println("Person = " + person); // Prints person memory location
        System.out.println("Person Name = " + person.name);
        System.out.println("Person Last Name = " + person.lastName);
    }
}

// Creation of Class Person
class Person{
    String name;
    String lastName;

    // Constructor Method with Parameters
    Person(String name, String lastName){
        //super();     Implicit Call to Parent Class Constructor (object)
        this.name = name;
        this.lastName = lastName;
        System.out.println("Person Object using this = " + this);
        System.out.println("Person Name = " + name);
        System.out.println("Person Last Name = " + lastName + "\n\n");
        new Print().print(this);
    }
}

// Creation of Class Print
class Print{

    public Print(){
        super(); // Calls Constructor of Object Class (Parent) to reserve memory
    }

    public void print(Person person){
        System.out.println("Person from print = " + person);
        System.out.println("Print Actual Object (this) = " + this + "\n\n"); // Point to print object
    }
}

// this: point to the objects depending on the object that is being executed at that moment