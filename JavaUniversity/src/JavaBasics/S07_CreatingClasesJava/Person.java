package JavaBasics.S07_CreatingClasesJava;

public class Person {

    // Class Attributes
    public String name;     // It is not a good practice to establish Attributes as public
    public String lastName;     // It is not a good practice to establish Attributes as public

    // Class Methods
    public void showInformation(){
        System.out.println("Name: " + name);
        System.out.println("Last Name: " + lastName);
    }

}
