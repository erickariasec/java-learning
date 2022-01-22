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
        this.name = name;
        this.lastName = lastName;
    }
}